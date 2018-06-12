package br.com.makinfunapps.funapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.professor.medlist.MainActivity;
import com.example.professor.medlist.R;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarMainActivity();
            }
        }, 4000);
    }

    private void mostrarMainActivity() {
        Intent intent = new Intent(
                SplashScreen.this,MainActivity.class
        );
        startActivity(intent);
        finish();
    }
}