package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);
        Button login =(findViewById(R.id.login));

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if (username.getText().toString().equals("Wyclife") && password.getText().toString().equals("wyclife@2000")){
                    Toast.makeText(MainActivity.this, "YOUR LOGIN SUCCESSFULLY", Toast.LENGTH_SHORT).show();

                }else
                    Toast.makeText(MainActivity.this,"WRONG PASSWORD OR USER NAME", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
