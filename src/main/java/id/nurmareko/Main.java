package id.nurmareko;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
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

    private Region createContent() {
        BorderPane results = new BorderPane();
        results.setTop(createTop());
        results.setBottom(createBottom());
        return results;
    }

    private Node createBottom() {
        Label fileType = new Label("FLAC");
        Label bitrate = new Label("1058 kbps");
        Label frequency = new Label("44100 Hz");
        Label trackProgress = new Label("0:03 / 4:57");
        HBox results = new HBox(20, fileType, bitrate, frequency, trackProgress);
        return results;
    }

    private Node createTop () {
        Button addFiles = new Button("Add Files");
        Button stop = new Button("⏹");
        Button play = new Button("▶");
        Button pause = new Button("⏸");
        Button prev = new Button("⏮");
        Button next = new Button("⏭");
        ToggleButton shuffle = new ToggleButton("Shuffle");

        Region visualizer = new Region();
        visualizer.setPrefHeight(80);
        visualizer.setStyle("-fx-background-color: black;");

        Slider progressBar = new Slider();

        Slider volume = new Slider(0, 100, 50);

        HBox controls = new HBox(10, addFiles, prev, play, pause, stop, next, shuffle);
        HBox results = new HBox(10, controls, visualizer, progressBar, volume);
        return results;
    }
}
