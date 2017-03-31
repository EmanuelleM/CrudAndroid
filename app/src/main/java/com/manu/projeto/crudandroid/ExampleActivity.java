package com.manu.projeto.crudandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Pesquisador04 on 31/03/2017.
 */
public class ExampleActivity extends Activity {

        @BindView(R.id.editText)
        EditText toastEditText;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout_butter);

            // Initializes Butter Knife and Bind the Views to our Activity
            ButterKnife.bind(this);
        }
        @OnClick(R.id.button)
        public void submit(Button button) {

            Toast.makeText(getApplicationContext(), "Hello " + toastEditText.getText().toString(), Toast.LENGTH_SHORT).show();

        }
    }
