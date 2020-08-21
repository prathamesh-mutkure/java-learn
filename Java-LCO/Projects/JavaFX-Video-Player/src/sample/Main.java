package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Stores the path of the video file
        String filepath = "file:///home/prathamesh/Desktop/Java/Java-LCO/Projects/JavaFX-Video-Player/intro.mp4";

        // Setting scene
        Group root = new Group();
        Scene scene = new Scene(root, 720, 1080, Color.BLACK);

        VideoPlayer videoPlayer = new VideoPlayer(filepath);

        root.getChildren().add(videoPlayer);    // Doesn't work

        primaryStage.setTitle("Video Player Project");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
