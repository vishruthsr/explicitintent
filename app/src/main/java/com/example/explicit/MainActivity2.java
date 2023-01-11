package com.example.explicit;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
class secActivity2 extends AppCompatActivity {
    TextView t;
    String nameFromFirst="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t=findViewById(R.id.mytext);
        nameFromFirst=getIntent().getStringExtra("text");
        t.setText(nameFromFirst);
    }
}

