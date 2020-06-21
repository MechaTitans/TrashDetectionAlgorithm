package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.opencv.core.Core;

public class Main extends Application {
    /**
     * This Application is created using JavaFx and OpenCv
     */

    static{ System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }
    /**
     *   start function
     *   Starts the program and loads the GUI
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            primaryStage.setTitle("Pollux");
            primaryStage.setScene(new Scene(root, 1280, 800));
            primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
