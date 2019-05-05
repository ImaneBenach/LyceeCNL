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

public class ClubActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Pour masquer l'actionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //setContentView(R.layout.activity_app_intro);

        addSlide(AppIntroFragment.newInstance("Club Musique", "Si tu aimes la musique, ce club est fait pour toi!",
                R.drawable.music, ContextCompat.getColor(getApplicationContext(), R.color.colorMintDark)));
        addSlide(AppIntroFragment.newInstance("Club BD", "Si tu aimes les bds, ce club est fait pour toi!",
                R.drawable.bd, ContextCompat.getColor(getApplicationContext(), R.color.colorAquaDark)));
        addSlide(AppIntroFragment.newInstance("Club Echec", "Si tu aimes les échecs, ce club est fait pour toi!",
                R.drawable.echeclogo3, ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryDark)));
    }


    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
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
