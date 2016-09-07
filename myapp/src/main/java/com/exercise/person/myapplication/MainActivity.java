package com.exercise.person.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int MAIN_REQUEST_CODE = 0;
    private EditText user_name;
    private EditText user_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_name = (EditText) findViewById(R.id.username_edit);
        user_password= (EditText) findViewById(R.id.password_edit);

       /* Button b = (Button) findViewById(R.id.login);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivityForResult();
            }
        });*/
    }

    public void login(View v) {
        String userName = user_name.getText().toString();

        String UserPassword = user_password.getText().toString();
    }


    public void register(View v) {

        Intent intent = new Intent(this, LoginActivity.class);
        startActivityForResult(intent, MAIN_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode== Activity.RESULT_OK) {

            if (requestCode==MAIN_REQUEST_CODE) {
                String username =  data.getStringExtra("username");
                Toast.makeText(getApplicationContext(), "username", Toast.LENGTH_SHORT).show();
                user_name.setText(username);
            }
        }
    }

    public EditText getUser_name() {
        return user_name;
    }

    public void setUser_name(EditText user_name) {
        this.user_name = user_name;
    }

    public EditText getUser_password() {
        return user_password;
    }

    public void setUser_password(EditText user_password) {
        this.user_password = user_password;
    }


}
