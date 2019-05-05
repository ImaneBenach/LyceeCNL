package fr.imaneben.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.model.ConfigSplash;
import android.view.WindowManager;
import com.viksaa.sssplash.lib.cnst.Flags;
import android.support.v7.app.ActionBar;
import com.daimajia.androidanimations.library.Techniques;
import android.content.Intent;

public class SplashActivity extends AwesomeSplash {

    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
    */

    @Override
    public void initSplash(ConfigSplash configSplash) {

        // Pour masquer l'actionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Animation du fond : la couleur.

        configSplash.setBackgroundColor(R.color.colorCNL);

        // Dans 3 seconde, je veux que l'effet s'affiche.
        configSplash.setAnimCircularRevealDuration(3000);
        configSplash.setRevealFlagX(Flags.REVEAL_LEFT);
        configSplash.setRevealFlagX(Flags.REVEAL_BOTTOM);

        // le logo
        configSplash.setLogoSplash(R.drawable.cnl_logo1);
        configSplash.setAnimLogoSplashDuration(5000);
        configSplash.setAnimLogoSplashTechnique(Techniques.Bounce);

        // Le titre
        configSplash.setTitleSplash("Chargement...");
        configSplash.setTitleTextColor(R.color.colorWhite);
        configSplash.setTitleTextSize(18f);
        configSplash.setAnimTitleDuration(3000);
        configSplash.setAnimTitleTechnique(Techniques.FlipInX);
    }

    @Override
    public void animationsFinished() {
        startActivity(new Intent(SplashActivity.this, MainActivity.class)) ;
    }
}
