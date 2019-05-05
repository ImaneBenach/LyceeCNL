package fr.imaneben.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;

public class VieLyceenneActivity extends AppCompatActivity {

    CardView clubs ;
    CardView integration, sortie ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vie_lyceenne);

        // Pour masquer l'actionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        clubs = (CardView) findViewById(R.id.clubCV);

        integration = (CardView) findViewById(R.id.integration);

        sortie = (CardView) findViewById(R.id.sortie);
    }


    public void clubs(View view) {
        clubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VieLyceenneActivity.this,ClubActivity.class) ;
                startActivity(intent);
            }
        });
    }

    public void integration(View view) {
        integration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VieLyceenneActivity.this,JIntegrationActivity.class) ;
                startActivity(intent);
            }
        });
    }

    public void sorties(View view) {
        sortie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VieLyceenneActivity.this,SortiesActivity.class) ;
                startActivity(intent);
            }
        });
    }
}
