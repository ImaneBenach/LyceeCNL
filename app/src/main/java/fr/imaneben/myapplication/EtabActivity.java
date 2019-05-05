package fr.imaneben.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;

public class EtabActivity extends AppCompatActivity {

    CardView formation, cdi ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etab);
        // Pour masquer l'actionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        formation = (CardView) findViewById(R.id.formation) ;
        cdi = (CardView) findViewById(R.id.cdi) ;


    }


    public void formation(View view) {
        formation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EtabActivity.this,BACActivity.class) ;
                startActivity(intent);
            }
        });
    }

    public void cdi(View view) {
        cdi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EtabActivity.this,CDIActivity.class) ;
                startActivity(intent);
            }
        });
    }
}
