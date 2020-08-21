package sample;

// JavaFX Libraries
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * This is our usual Main Java File
 * It is inheriting Application Class
 */

public class Main extends Application {

    /**
     * GUI can be designed using fxml as well programmatically
     * It is always recommended to do it with fxml
     */

    // Overriding Application class
    @Override
    // Declaring a new Stage - primaryStage
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        /** Programmatic way: */
//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setHgap(10);
//        root.setVgap(10);

//        Label hello = new Label("Hello World"); // Declaring an Object
//        root.getChildren().addAll(hello);


        primaryStage.setTitle("Hello World"); // Sets the top title on the top window bar
        primaryStage.setScene(new Scene(root, 800, 400)); // Sets Window Dimensions
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
