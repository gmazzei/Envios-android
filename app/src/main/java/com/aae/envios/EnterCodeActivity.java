package com.aae.envios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnterCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_code);

        final EditText codeEditText = (EditText) findViewById(R.id.enterCodeEditText);
        Button submitButton = (Button) findViewById(R.id.enterCodeSubmitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String code = codeEditText.getText().toString();
                EnterCodeActivity.this.submitCode(code);
            }
        });

    }


    public void submitCode(String code) {
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }
}
