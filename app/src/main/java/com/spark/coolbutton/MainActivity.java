package com.spark.coolbutton;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity; // ← używamy AndroidX

import com.spark.submitbutton.SubmitButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SubmitButton sb = findViewById(R.id.btn3);
        sb.setOnClickListener(new View.OnClickListener() {
            private static final String TAG = "onclick";

            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Submit");
            }
        });
    }
}
