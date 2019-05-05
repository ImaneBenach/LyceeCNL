package fr.imaneben.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class BACActivity extends AppCompatActivity {

    Button retour ;
    CardView pro,cap,general ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bac);

        // Pour masquer l'actionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        retour = (Button) findViewById(R.id.button) ;
        pro = (CardView) findViewById(R.id.pro) ;
        cap = (CardView) findViewById(R.id.cap) ;
        general = (CardView) findViewById(R.id.general) ;

    }

    public void general(View view) {
        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BACActivity.this,bacGeneralActivity.class) ;
                startActivity(intent);
            }
        });
    }

    public void pro(View view) {
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BACActivity.this,BacProActivity.class) ;
                startActivity(intent);
            }
        });

    }

    public void cap(View view) {
        cap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BACActivity.this,CAPActivity.class) ;
                startActivity(intent);
            }
        });
    }

    public void retour(View view) {
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BACActivity.this,EtabActivity.class) ;
                startActivity(intent);
            }
        });
    }
}
