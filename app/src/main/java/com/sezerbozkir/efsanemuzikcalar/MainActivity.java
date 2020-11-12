package com.sezerbozkir.efsanemuzikcalar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton ibPlay, ibPause, ibNext, ibList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ibPlay = findViewById(R.id.ibPlay);
        ibPause = findViewById(R.id.ibPause);
        ibNext = findViewById(R.id.ibNext);
        ibList = findViewById(R.id.ibMusicList);

        ibPlay.setOnClickListener(this);
        ibPause.setOnClickListener(this);
        ibNext.setOnClickListener(this);
        ibList.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ibPlay: {
                Log.d("butonKesfet", "onClick: Play ");
                break;
            }
            case R.id.ibNext: {
                Log.d("butonKesfet", "onClick: Next ");
                break;
            }
            case R.id.ibPause: {
                Log.d("butonKesfet", "onClick: Pause ");
                break;
            }
            case R.id.ibMusicList: {
                Log.d("butonKesfet", "onClick: MusicList ");
                break;
            }
            default: {
                Log.d("butonKesfet", "onClick: Unkown ");
                break;
            }
        }

    }
}