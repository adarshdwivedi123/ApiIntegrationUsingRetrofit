package com.example.apiintegrationusingretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    TextView registerlink;
    EditText email,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email=findViewById(R.id.etemaill);
        password=findViewById(R.id.etpassword);
        login=findViewById(R.id.btnlogin);
        registerlink=findViewById(R.id.Registerlink);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnlogin:
                startActivity(new Intent(LoginActivity.this,HomeActivity.class));

                Toast.makeText(this, "register", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Registerlink:
                switchOnRegister();

        }
    }

    private void switchOnRegister() {
        Intent i=new Intent(LoginActivity.this,MainActivity.class);
        startActivity(i);

    }
}