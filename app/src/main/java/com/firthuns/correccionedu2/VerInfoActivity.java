package com.firthuns.correccionedu2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class VerInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_info);

        TextView  txtInfo = findViewById(R.id.txtInfo);
        int idTextp = getIntent().getExtras().getInt("TEXTO");
        txtInfo.setText(idTextp);
    }
}