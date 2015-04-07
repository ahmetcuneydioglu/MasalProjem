package com.example.sony.masalprojem.Sesli;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sony.masalprojem.R;

import java.util.concurrent.TimeUnit;

/**
 * Created by sony on 06.04.2015.
 */
public class Sesli9 extends Activity {

    public TextView songName,startTimeField,endTimeField;
    //private MediaPlayer mediaPlayer,mediaPlayer2;
    public double startTime = 0;
    public double finalTime = 0;
    public Handler myHandler = new Handler();
    public SeekBar seekbar;
    public ImageButton playButton,pauseButton;
    public static int oneTimeOnly = 0;
    MediaPlayer media1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesli9);
        songName= (TextView) findViewById(R.id.textView4);
        startTimeField= (TextView) findViewById(R.id.textView1);
        endTimeField= (TextView) findViewById(R.id.textView2);
        seekbar= (SeekBar) findViewById(R.id.seekBar1);
        playButton= (ImageButton) findViewById(R.id.imageButton1);
        pauseButton= (ImageButton) findViewById(R.id.imageButton2);
        songName.setText("Pamuk Prenses");
        media1=MediaPlayer.create(this,R.raw.pamuk_prenses);
        seekbar.setClickable(false);
        pauseButton.setEnabled(false);

    }

    public void play(View view){
        Toast.makeText(getApplicationContext(), "Hikaye Ba�lat�ld�",
                Toast.LENGTH_SHORT).show();

        media1.start();
        finalTime = media1.getDuration();
        startTime = media1.getCurrentPosition();
        if(oneTimeOnly == 0){
            seekbar.setMax((int) finalTime);
            oneTimeOnly = 1;
        }

        endTimeField.setText(String.format("%d min, %d sec",
                        TimeUnit.MILLISECONDS.toMinutes((long) finalTime),
                        TimeUnit.MILLISECONDS.toSeconds((long) finalTime) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.
                                        toMinutes((long) finalTime)))
        );
        startTimeField.setText(String.format("%d min, %d sec",
                        TimeUnit.MILLISECONDS.toMinutes((long) startTime),
                        TimeUnit.MILLISECONDS.toSeconds((long) startTime) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.
                                        toMinutes((long) startTime)))
        );
        seekbar.setProgress((int)startTime);
        myHandler.postDelayed(UpdateSongTime,100);
        pauseButton.setEnabled(true);
        playButton.setEnabled(false);
    }

    public Runnable UpdateSongTime = new Runnable() {
        public void run() {
            startTime = media1.getCurrentPosition();
            startTimeField.setText(String.format("%d min, %d sec",
                            TimeUnit.MILLISECONDS.toMinutes((long) startTime),
                            TimeUnit.MILLISECONDS.toSeconds((long) startTime) -
                                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.
                                            toMinutes((long) startTime)))
            );
            seekbar.setProgress((int)startTime);
            myHandler.postDelayed(this, 100);
        }
    };
    public void pause(View view){
        Toast.makeText(getApplicationContext(), "Hikaye Durduruldu",
                Toast.LENGTH_SHORT).show();

        media1.pause();
        pauseButton.setEnabled(false);
        playButton.setEnabled(true);
    }
    public void forward(View view){
        int temp = (int)startTime;
        int forwardTime = 5000;
        if((temp+ forwardTime)<=finalTime){
            startTime = startTime + forwardTime;
            media1.seekTo((int) startTime);
        }
        else{
            Toast.makeText(getApplicationContext(),
                    "Cannot jump forward 5 seconds",
                    Toast.LENGTH_SHORT).show();
        }

    }
    public void rewind(View view){
        int temp = (int)startTime;
        int backwardTime = 5000;
        if((temp- backwardTime)>0){
            startTime = startTime - backwardTime;
            media1.seekTo((int) startTime);
        }
        else{
            Toast.makeText(getApplicationContext(),
                    "Cannot jump backward 5 seconds",
                    Toast.LENGTH_SHORT).show();
        }

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        media1.stop();
    }
}
