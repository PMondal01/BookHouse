package com.example.bookhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    EditText editText_emailLogin, editText_passLogin;
    Button button_signUp,button_LOGin;
    TextView tvSignIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText_emailLogin=findViewById(R.id.email_log);
        editText_passLogin=findViewById(R.id.pass_log);
       /* button_signUp=findViewById(R.id.signup);*/
        button_LOGin=findViewById(R.id.btn_login);
        tvSignIn=findViewById(R.id.tvSignIn);

       /* button_signUp.setOnClickListener(this);*/
        button_LOGin.setOnClickListener(this);
        tvSignIn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Intent intent = null;
        if(view.getId()==R.id.btn_login)
        {
            intent =new Intent(LoginActivity.this,MainActivity.class);

        }
       else if(view.getId()==R.id.tvSignIn)
        {
            intent=new Intent(this,SignupActivity.class);

        }
        startActivity(intent);


    }
}
