package com.wearable;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    private TextView text;
    private Button btnclick;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        btnclick = findViewById(R.id.btnclick);
        editText = findViewById(R.id.et1);

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(editText.getText().toString());
            }
        });

        // Enables Always-on
        setAmbientEnabled();
    }
}
