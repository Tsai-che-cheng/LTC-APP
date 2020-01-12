package com.example.hc_app;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.List;

public class SigninActivity extends AppCompatActivity {

    private static final int MY_REQUEST_CODE = 123;
    List<AuthUI.IdpConfig> providers;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        getSupportActionBar().hide();

        providers = Arrays.asList(

                new AuthUI.IdpConfig.GoogleBuilder().build(),
                // new AuthUI.IdpConfig.PhoneBuilder().build(),
                new AuthUI.IdpConfig.EmailBuilder().build()
                //new AuthUI.IdpConfig.FacebookBuilder().build()
        );

        showSignInOptions();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        SharedPreferences sharecheck = getSharedPreferences("check", MODE_PRIVATE);
        Calendar c = Calendar.getInstance();//get calendar
        int today = c.get(Calendar.DAY_OF_YEAR);//get day of year

        if (requestCode == MY_REQUEST_CODE) {
            IdpResponse response = IdpResponse.fromResultIntent(data);
            if (resultCode == RESULT_OK) {
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                SharedPreferences.Editor editor = sharecheck.edit();
                int saveInt = sharecheck.getInt("write", 0);
                // Setting first login have to write questionnaire
                int firstloginofday = sharecheck.getInt("day", today);//The fistday writed to sharePref
                if (saveInt == 0) {
                    startActivity(new Intent(this, WebViewActivity.class));
                    finish();
                }
                else if (today-firstloginofday>=30 && saveInt ==100) {
                    startActivity(new Intent(this, WebViewActivity_After.class));
                    finish();
                }
                else {
                    startActivity(new Intent(this, MainActivity.class));
                    finish();
                }
            }
        } else {
            finish();
            System.exit(0);
//          ConfirmExit();
        }
    }

    private void showSignInOptions() {
        Intent intent = AuthUI
                .getInstance()
                .createSignInIntentBuilder()
//                        .setAlwaysShowSignInMethodScreen(true)
//                        .setIsSmartLockEnabled(false)
                .setAvailableProviders(providers)
                .setTheme(R.style.MyTheme)
                .setLogo(R.drawable.built_with_firebase_logo_dark)
                .build();
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivityForResult(intent, MY_REQUEST_CODE);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {//捕捉返回鍵
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            ConfirmExit();//按返回鍵，則執行退出確認
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void ConfirmExit() {//退出確認
        AlertDialog.Builder ad = new AlertDialog.Builder(SigninActivity.this);
        ad.setTitle("離開");
        ad.setMessage("確定要離開此程式嗎?");
        ad.setPositiveButton("是", new DialogInterface.OnClickListener() {//退出按鈕
            public void onClick(DialogInterface dialog, int i) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });
        ad.setNegativeButton("否", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int i) {
                //不退出不用執行任何操作
            }
        });
        ad.show();//顯示對話框
    }
}
