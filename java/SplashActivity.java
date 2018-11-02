package mathewdocker.com.saffoldingapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by Mathew on 20/10/2016.
 */
public class SplashActivity extends AppCompatActivity {

    Animation animation;
    MediaPlayer splashSound;
    MediaController mediaC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        getSupportActionBar().hide();


        final VideoView videoView = (VideoView)findViewById(R.id.videoView);
        mediaC = new MediaController(this);
        //ImageView image = (ImageView) findViewById(R.id.splash_ic);
        //Animation anim = AnimationUtils.loadAnimation(this,R.anim.fadeout);
        //videoView.setAnimation(anim);
        //splashSound = MediaPlayer.create(this, R.raw.splash_intro1);
        //splashSound.start();




        Thread myThread = new Thread(){
            @Override
            public void run(){

                String videopath = "android.resource://mathewdocker.com.saffoldingapplication/"+ R.raw.intro;
                Uri uri = Uri.parse(videopath);
                videoView.setVideoURI(uri);
                videoView.setMediaController(mediaC);
                mediaC.setAnchorView(videoView);
                videoView.start();


                //Intent splashIntent = new Intent(getApplicationContext(), MainActivity.class);
                //startActivity(splashIntent);
                //finish();
                try {
                    sleep(8000);
                    Intent mainActivity = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(mainActivity);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        };
        myThread.start();




    }


}
