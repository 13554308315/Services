package com.xiong.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
  private EditText et_account;
  
  private EditText et_password;
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    getWindow().addFlags(1024);
    setContentView(R.layout.activity_login);
    this.et_account = (EditText)findViewById(R.id.et_account);
    this.et_password = (EditText)findViewById(R.id.et_password);
    String str1 = (String)SharedPreferencesUtils.get((Context)this, "account", "");
    String str2 = (String)SharedPreferencesUtils.get((Context)this, "password", "");
    if (str1.equals("admin") && str2.equals("191024")) {
      startActivity(new Intent((Context)this, MainActivity.class));
      finish();
    } 
    findViewById(R.id.bt_login).setOnClickListener(new View.OnClickListener() {
          public void onClick(View param1View) {
            if (!LoginActivity.this.et_account.getText().toString().isEmpty() && !LoginActivity.this.et_password.getText().toString().isEmpty()) {
              if (!LoginActivity.this.et_account.getText().toString().equals("admin")) {
                Toast.makeText((Context)LoginActivity.this, "账号异常!", 1).show();
              } else if (!LoginActivity.this.et_password.getText().toString().equals("191024")) {
                Toast.makeText((Context)LoginActivity.this, "密码错误!", 1).show();
              } else {
                SharedPreferencesUtils.put((Context)LoginActivity.this, "account", "admin");
                SharedPreferencesUtils.put((Context)LoginActivity.this, "password", "191024");
                LoginActivity loginActivity = LoginActivity.this;
                loginActivity.startActivity(new Intent((Context)loginActivity, MainActivity.class));
                LoginActivity.this.finish();
              } 
            } else {
              Toast.makeText((Context)LoginActivity.this, "账号或密码为空!", 1).show();
            } 
          }
        });
  }
}


/* Location:              C:\Users\28556\Desktop\app-release(43寸)\dex\classes_dex2jar.jar!\com\xiong\smartlegalservices\LoginActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */