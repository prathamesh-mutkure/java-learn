package sample;

import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class VideoPlayer {

    Media media;                // Holds the file path
    MediaPlayer mediaPlayer;    // Responsible for playing the file
    MediaView mediaView;        // Responsible for displaying the file
    Pane pane;                  // Pane or view

    public VideoPlayer(String filepath)
    {
        media = new Media(filepath);
        mediaPlayer = new MediaPlayer(media);
        mediaView = new MediaView(mediaPlayer);
        pane = new Pane();

        pane.getChildren().add(mediaView);


        // Playing the video
        mediaPlayer.play();

    }

}
