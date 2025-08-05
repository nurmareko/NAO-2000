package id.nurmareko;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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
        VBox results = new VBox(new Label("NAO-2000"));
        return results;
    }
}
