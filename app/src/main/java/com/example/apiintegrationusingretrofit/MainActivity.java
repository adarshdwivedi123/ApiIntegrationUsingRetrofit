package com.example.apiintegrationusingretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView loginlink;
    EditText name,email,password;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.etname);
        email=findViewById(R.id.etemaill);
        password=findViewById(R.id.etpassword);
        register=findViewById(R.id.btnregister);
        loginlink=findViewById(R.id.btnlogin);

        //hide action bar
        getSupportActionBar().hide();
        //hide status window
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            
            case R.id.btnregister:
                Toast.makeText(this, "register", Toast.LENGTH_SHORT).show();
                break;
            case R.id.loginlink:
                switchOnLogin();

        }
    }

    private void switchOnLogin() {
        Intent intent=new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}