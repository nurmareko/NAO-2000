package id.nurmareko;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
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
        results.setCenter(createCenter());
        results.setBottom(createBottom());
        return results;
    }

    private Node createTop() {
        HBox results = new HBox(10, createControl(), createProgressBar(), createVolume());
        return results;
    }

    private Node createCenter() {
        TableView<Track> table = new TableView<>();
        TableColumn<Track, String> artistCol = new TableColumn<>("Artist/Album");
        artistCol.setCellValueFactory(data -> data.getValue().artistAlbumProperty());
        TableColumn<Track, Number> trackNoCol = new TableColumn<>("Track #");
        trackNoCol.setCellValueFactory(data -> data.getValue().trackNumberProperty());
        TableColumn<Track, String> titleCol = new TableColumn<>("Title");
        titleCol.setCellValueFactory(data -> data.getValue().titleProperty());
        TableColumn<Track, String> durationCol = new TableColumn<>("Duration");
        durationCol.setCellValueFactory(data -> data.getValue().durationProperty());
        table.getColumns().addAll(artistCol, trackNoCol, titleCol, durationCol);

        table.getItems().addAll(
                new Track("Daft Punk / Discovery", 1, "One More Time", "5:20"),
                new Track("Daft Punk / Discovery", 2, "Aerodynamic", "3:27"),
                new Track("Daft Punk / Discovery", 3, "Digital Love", "4:58"),
                new Track("Porter Robinson / Nurture", 1, "Look at the Sky", "4:45"),
                new Track("Porter Robinson / Nurture", 2, "Musician", "4:11"),
                new Track("Hiroyuki Sawano / OST", 12, "Vogel im Käfig", "6:23"),
                new Track("RADWIMPS / Your Name.", 7, "Sparkle", "7:16"));

        VBox results = new VBox(table);
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

    private Node createControl() {
        Button addFiles = new Button("Add Files");
        Button stop = new Button("⏹");
        Button play = new Button("▶");
        Button pause = new Button("⏸");
        Button prev = new Button("⏮");
        Button next = new Button("⏭");
        ToggleButton shuffle = new ToggleButton("Shuffle");
        HBox results = new HBox(10, addFiles, prev, play, pause, stop, next, shuffle);
        return results;
    }

    private Node createProgressBar() {
        return new Slider();
    }

    private Node createVolume() {
        return new Slider(0, 100, 50);
    }
}
