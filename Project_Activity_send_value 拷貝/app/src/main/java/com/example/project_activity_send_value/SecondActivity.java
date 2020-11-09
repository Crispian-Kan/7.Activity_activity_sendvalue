package com.example.project_activity_send_value;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text_A();
    }
    public void intentBtoA(View v){

        EditText input_B = (EditText)findViewById(R.id.input_b);

        Intent intent = new Intent(this, MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("R", input_B.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
    private void text_A() {
        int A1= 0;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null) {
            A1 = Integer.parseInt(bundle.getString("T"));

            TextView A_value = (TextView)findViewById(R.id.valueStr);
            A_value.setText(Integer.toString(A1));
        }
    }
}
