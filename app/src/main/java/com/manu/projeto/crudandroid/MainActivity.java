package com.manu.projeto.crudandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by emanu on 11/02/2017.
 */

public class MainActivity extends AppCompatActivity {

    TextView txtSejaBemVindo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activituy_main);

        txtSejaBemVindo = (TextView) findViewById(R.id.txtSejaBemVindo);

        Bundle bundle = getIntent().getExtras();
        final String nomePessoa = (String) bundle.get("nome");
        txtSejaBemVindo.setText("Seja bem vind@ " + nomePessoa);

    }
}
