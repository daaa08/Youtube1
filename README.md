# Youtube

- Youtube API 추가 [안드로이드 Youtube API](https://developers.google.com/youtube/android/player/downloads/?hl=ko)
- Activity에 YouTubeBaseActivity 상속 받기
- xml에 YoutubePlayerView 추가 
```xml
    <view
        android:id="@+id/youtubeView"
        class="com.google.android.youtube.player.YouTubePlayerView"
        id="@+id/view"
        layout_marginTop="16dp"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```
- Youtube player 이벤트 처리
```java
YouTubePlayer.OnInitializedListener listener; // 이벤트 처리
```
- listener
```java
listener = new YouTubePlayer.OnInitializedListener(){
            // 초기화 및 player 재생 
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("k24UEMaLwEk");   // 영상이 보여지도록 함  ,("")에는 재생시킬 영상의 아이디(https://www.youtube.com/watch?v=k24UEMaLwEk)
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
```
- btn으로 player 재생 
```java
 youtubeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                youtubeView.initialize("AIzaSyAEkohC01b3wLgVJuv5gaTx3fd5JYgB8_4",listener);   // 키 값 넣어줌, 초기화
            후 player 세팅
          }
        });
```
