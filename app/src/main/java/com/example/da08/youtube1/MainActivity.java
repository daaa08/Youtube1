package com.example.da08.youtube1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity {

    YouTubePlayerView youtubeView; // youtube 재생이 가능하도록 해 줌
    Button youtubeBtn;

    YouTubePlayer.OnInitializedListener listener; // 이벤트 처리

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        youtubeBtn = (Button) findViewById(R.id.youtubeBtn);
        youtubeView = (YouTubePlayerView) findViewById(R.id.youtubeView);
        listener = new YouTubePlayer.OnInitializedListener(){

            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("E6ty_g0xJEA");   // 영상이 보여지도록 함  ,("")에는 재생시킬 영상의 아이디
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        youtubeBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                youtubeView.initialize("AIzaSyAEkohC01b3wLgVJuv5gaTx3fd5JYgB8_4",listener);
            }
        });
    }
}
