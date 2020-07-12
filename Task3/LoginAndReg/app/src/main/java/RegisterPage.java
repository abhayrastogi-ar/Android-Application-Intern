package com.example.loginandreg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class RegisterPage extends AppCompatActivity{
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        et1=findViewById(R.id.editTextTextPassword3);
        et2=findViewById(R.id.editTextTextPassword4);
    }

    public void submit(View view) {
        if(et1.getText().toString().equals(et2.getText().toString()))
        {
            Toast.makeText(this,"Details submitted successfully",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"Invalid Password",Toast.LENGTH_LONG).show();
        }
    }
}
