package fr.imaneben.myapplication;

import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;
import android.support.v7.app.ActionBar;


public class MainActivity extends AppCompatActivity {

    CardView etabCV, vielyceenneCV, alerteCV, cantine,info ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Pour masquer l'actionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        etabCV = (CardView) findViewById(R.id.etabCV) ;
        vielyceenneCV= (CardView) findViewById(R.id.vielyceenneCV) ;
        alerteCV= (CardView) findViewById(R.id.alerteCV) ;
        cantine = (CardView) findViewById(R.id.cantine1) ;
        info = (CardView) findViewById(R.id.infos) ;
    }


    public void etab(View view) {
        etabCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,EtabActivity.class) ;
                startActivity(intent);
            }
        });

    }

    public void vielyceenne(View view) {
        vielyceenneCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,VieLyceenneActivity.class) ;
                startActivity(intent);
            }
        });
    }

    public void alerteCV(View view) {
        alerteCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AlerteActivity.class) ;
                startActivity(intent);
            }
        });
    }

    public void cantine(View view) {
        cantine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CantineActivity.class) ;
                startActivity(intent);
            }
        });
    }

    public void infos(View view) {
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,InfoActivity.class) ;
                startActivity(intent);
            }
        });
    }
}
