package com.example.passwordrecovery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView ivImage;
    private TextView tvPassword_recovery, tvEnter_email;
    private EditText etEmail;
    private Button btn1;
    private TextView tvRobot;
    private Button btnRecover;


    private String email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivImage = findViewById(R.id.ivImage);
        tvPassword_recovery = findViewById(R.id.tvPassword_recovery);
        tvEnter_email = findViewById(R.id.tvEnter_email);
        etEmail = findViewById(R.id.etEmail);
        btn1 = findViewById(R.id.btn1);
        tvRobot = findViewById(R.id.tvRobot);
        btnRecover = findViewById(R.id.btnRecover);

        btnRecover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = etEmail.getText().toString().trim();

                validate();
            }
        });


    }

    private void validate() {
        if (email.isEmpty()) {
            etEmail.setError("email cannot be empty");

        } else {
            Toast.makeText(getApplicationContext(),  "Verification email is sent sucessfully", Toast.LENGTH_LONG).show();
        }


    }


}