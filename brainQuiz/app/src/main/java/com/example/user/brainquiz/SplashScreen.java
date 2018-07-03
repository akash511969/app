package com.example.user.brainquiz;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import static java.lang.Thread.sleep;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);                    //MO TITLE
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);   //FULL SCREEN MODE
        setContentView(R.layout.activity_splash_screen);
        logo_Launcher logo_launcher=new logo_Launcher();                //OBJECT OF lOGO_LAUNCHER
        logo_launcher.start();                                          //RUN CLASS logo_Launcher
    }
    private class logo_Launcher extends Thread
    {
        public void run()
        {
            try{
                sleep(3000);                                     //DELAY OF 3sec
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                Intent intent=new Intent(SplashScreen.this,MainActivity.class);        //goto to MainActivity
                startActivity(intent);
            }
            }
    }
}