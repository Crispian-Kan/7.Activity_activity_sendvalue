package com.example.project_activity_send_value;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_B();
    }
    public void intentAtoB(View v){

        EditText input_A = (EditText)findViewById(R.id.input_a);

        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("T", input_A.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
    private void text_B(){
        int B1 = 0;
        Bundle bundle = this.getIntent().getExtras();
        if(bundle != null) {
            B1 = Integer.parseInt(bundle.getString("R"));

            TextView B_value = (TextView) findViewById(R.id.valueStr);
            B_value.setText(Integer.toString(B1));
        }
    }
}