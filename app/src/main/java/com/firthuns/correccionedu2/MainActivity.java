package com.firthuns.correccionedu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private ImageView img1, img3, img2;
    private ImageButton btn1, btn2, btn3;
    private Button btnVermas;
private  int idTextoMostrar=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btnVermas = findViewById(R.id.btnVerMas);

            btnVermas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (idTextoMostrar !=0){
                        Bundle bundle = new Bundle();
                        bundle.putInt("TEXTO",idTextoMostrar);
//                        Intent intent =
                    }
                }
            });

    }


    public  void  selectImg (View btn){
        img1.setVisibility(View.INVISIBLE);
        img2.setVisibility(View.INVISIBLE);
        img3.setVisibility(View.INVISIBLE);

        switch (btn.getId()){
            case R.id.btn1:
                img1.setVisibility(View.VISIBLE);
//                idTextoMostrar= R.string.desc1;
                break;
            case R.id.btn2:
                img2.setVisibility(View.VISIBLE);
//                idTextoMostrar= R.string.desc2;
                break;
            case R.id.btn3:
                img3.setVisibility(View.VISIBLE);
//                idTextoMostrar= R.string.desc3;
                break;
        }


    }

}