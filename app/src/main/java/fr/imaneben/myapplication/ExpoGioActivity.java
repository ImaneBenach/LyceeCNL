package fr.imaneben.myapplication;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

import java.util.SimpleTimeZone;

public class ExpoGioActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Pour masquer l'actionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //setContentView(R.layout.activity_app_intro);

        addSlide(AppIntroFragment.newInstance("Exposition Gio Ponti au musée des arts décoratifs de Paris", "Lycée Claude Nicolas Ledoux",
                R.drawable.gioponti, ContextCompat.getColor(getApplicationContext(), R.color.gris)));
        addSlide(AppIntroFragment.newInstance("Exposition Gio Ponti au musée des arts décoratifs de Paris", "Lycée Claude Nicolas Ledoux",
                R.drawable.gio2, ContextCompat.getColor(getApplicationContext(), R.color.gris)));
        addSlide(AppIntroFragment.newInstance("Exposition Gio Ponti au musée des arts décoratifs de Paris", "Lycée Claude Nicolas Ledoux",
                R.drawable.gio3, ContextCompat.getColor(getApplicationContext(), R.color.gris)));
    }


    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent=new Intent(getApplicationContext(),SortiesActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent=new Intent(getApplicationContext(),VieLyceenneActivity.class);
        startActivity(intent);
        finish();
    }
}
