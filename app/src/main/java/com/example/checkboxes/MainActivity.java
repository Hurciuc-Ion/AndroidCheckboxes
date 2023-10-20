package com.example.checkboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {

        CheckBox checkBox = (CheckBox) view;
        TextView selection = findViewById(R.id.selection);

        if(checkBox.isChecked()) {
            selection.setText("ON");
            checkBox.setText("Turn off");
        }
        else {
            selection.setText("OFF");
            checkBox.setText("Turn on");
        }
    }
}