package com.example.lightfuture.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by lightfuture on 2017/7/2.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private Button myLoginBtn;
    private EditText nameInput;
    private EditText pwdInput;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        myLoginBtn=(Button) findViewById(R.id.login_btn);
        nameInput=(EditText) findViewById(R.id.name_input);
        pwdInput=(EditText) findViewById(R.id.pwd_input);
        myLoginBtn.setOnClickListener(this);
    }
    public  void onClick(View v){
        switch(v.getId()){
            case R.id.login_btn:
                login();
                if(nameInput.getText().length()==0){
//                    error("用户名不能为空！");
                }else if(pwdInput.getText().length()==0){
//                    error("密码不能为空！");
                }else{
//                    login();
                }
                break;
            case R.id.regText:
                reg();
                /*Intent reIntent=new Intent();
                reIntent.setClass(LoginActivity.this,RegisterActivity.class);
                startActivity(reIntent);
                finish();
                //startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(V2EXManager.SIGN_UP_URL)));*/
                break;
        }
    }

    private void reg() {
        Intent reIntent=new Intent();
        reIntent.setClass(LoginActivity.this,RegActivity.class);
        startActivity(reIntent);
        finish();
    }

    private void login() {
        webView=(WebView) findViewById(R.id.homeNews);
        WebSettings wbs=webView.getSettings();
        wbs.setJavaScriptEnabled(true);
        wbs.setAllowFileAccess(true);
        wbs.setCacheMode(WebSettings.LOAD_DEFAULT);
        wbs.setDefaultTextEncodingName("gbk");
        webView.loadUrl("http://www.renfa888.com/mobile/login.php");
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view,String url){
                view.loadUrl(url);
                return true;
            }
        });
    }
}
