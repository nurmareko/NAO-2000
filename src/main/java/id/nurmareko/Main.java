package id.nurmareko;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(createContent(), 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Node createBottom() {
        Label fileType = new Label("FLAC");
        Label bitrate = new Label("1058 kbps");
        Label frequency = new Label("44100 Hz");
        Label trackProgress = new Label("0:03 / 4:57");
        HBox results = new HBox(20, fileType, bitrate, frequency, trackProgress);
        return results;
    }

    private Region createContent() {
        BorderPane results = new BorderPane();
        results.setBottom(createBottom());
        return results;
    }
}
