package com.manu.projeto.crudandroid;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by emanu on 11/02/2017.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    //defining firebaseauth object
    private FirebaseAuth firebaseAuth;

    EditText editLogin;
    EditText editPassword;
    Button btnLoginRegister;
    ProgressDialog progressLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        //initializing firebase auth object
        firebaseAuth = FirebaseAuth.getInstance();

        editLogin = (EditText) findViewById(R.id.email);
        editPassword = (EditText) findViewById(R.id.password);
        btnLoginRegister = (Button) findViewById(R.id.email_sign_in_button);
        btnLoginRegister.setText(R.string.action_sign_in);

        progressLogin = new ProgressDialog(this);

        btnLoginRegister.setOnClickListener(this);
    }


        @Override
    public void onClick(View view) {

    }
}
