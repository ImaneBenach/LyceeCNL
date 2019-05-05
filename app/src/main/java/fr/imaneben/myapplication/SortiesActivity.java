package fr.imaneben.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class SortiesActivity extends AppCompatActivity {

    CardView expo, expo2, expo3,expo4 ;
    Button retour ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorties);
        // Pour masquer l'actionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        expo = (CardView) findViewById(R.id.expo) ;
        expo2 = (CardView) findViewById(R.id.expo2) ;
        expo3 = (CardView) findViewById(R.id.expo3) ;
        expo4 = (CardView) findViewById(R.id.expo4) ;
        retour = (Button) findViewById(R.id.button) ;
    }

    public void expo(View view) {
        expo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SortiesActivity.this,ExpoGioActivity.class) ;
                startActivity(intent);
            }
        });
    }

    public void expo2(View view) {
        expo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SortiesActivity.this,MangaActivity.class) ;
                startActivity(intent);
            }
        });
    }

    public void expo3(View view) {
        expo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SortiesActivity.this,BasiliqueActivity.class) ;
                startActivity(intent);
            }
        });
    }

    public void expo4(View view) {
        expo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SortiesActivity.this,ChampionnatActivity.class) ;
                startActivity(intent);
            }
        });
    }

    public void retour(View view) {
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SortiesActivity.this,VieLyceenneActivity.class) ;
                startActivity(intent);
            }
        });
    }
}
