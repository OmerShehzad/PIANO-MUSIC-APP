package com.example.piano;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

     // HELP CONSTANTS
    private final int NR_of_SIMULTANEOUS_SOUND = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME =1.0f;
    private final int NO_LOOP =0;
    private final int PRIORITY =0;
    private final float NORMAL_PLAY_RATE =1.0f;

    // To Add member variable here
    private SoundPool mSoundpool;
    private int mCSoundid;
    private int mDSoundid;
    private int mESoundid;
    private int mFSoundid;
    private int mGSoundid;
    private int mASoundid;
    private int mBSoundid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Create New SoundPool Here

        mSoundpool= new SoundPool(NR_of_SIMULTANEOUS_SOUND, AudioManager.STREAM_MUSIC,0);


        // Load and Get The IDs To Identify the Sounds
        mCSoundid = mSoundpool.load(getApplicationContext(), R.raw.note1_c,1);
        mDSoundid = mSoundpool.load(getApplicationContext(), R.raw.note2_d,1);
        mESoundid = mSoundpool.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundid = mSoundpool.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundid = mSoundpool.load(getApplicationContext(),R.raw.note5_g,1);
        mASoundid = mSoundpool .load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundid =mSoundpool.load(getApplicationContext(),R.raw.note7_b,1);

    }

       // Add The Play Mathods To Triggered by the Button
    public  void playC(View V) {

        Log.d("Xlophone" ,"Red Button Clicked!");
        mSoundpool.play(mCSoundid,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void  playD(View V){

        Log.d("Xlophone","Button 1 pressed");
        mSoundpool.play(mDSoundid,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void  playE(View V){

        Log.d("Xlophone","Button 2 pressed");
        mSoundpool.play(mESoundid,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void  playF(View V){

        Log.d("Xlophone","Button 3 pressed");
        mSoundpool.play(mFSoundid,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void  playG(View V){

        Log.d("Xlophone","Button 4 pressed");
        mSoundpool.play(mGSoundid,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void  playA(View V){

        Log.d("Xlophone","Button 5 pressed");
        mSoundpool.play(mASoundid,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void  playB(View V){

        Log.d("Xlophone","Button 6 pressed");
        mSoundpool.play(mBSoundid,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }

}
