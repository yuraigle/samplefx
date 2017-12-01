package irkoms.samplefx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main extends Application {

    // Real programmers use logging, not System.out.println
    private final Logger log = LoggerFactory.getLogger(getClass().getName());

    @Override
    public void start(Stage primaryStage) throws Exception{
        log.info("Program Begins");

        ClassLoader cl = getClass().getClassLoader();
        Parent root = FXMLLoader.load(cl.getResource("auth.fxml"));
        primaryStage.setTitle("Вход в систему");
        primaryStage.setScene(new Scene(root, 320, 190));
        primaryStage.setOnCloseRequest(e -> System.exit(0));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
