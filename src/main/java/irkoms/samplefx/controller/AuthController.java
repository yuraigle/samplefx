package irkoms.samplefx.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class AuthController {
    @FXML
    TextField txLogin;
    @FXML
    PasswordField txPassword;
    @FXML
    Button btnSubmit;

    private final Logger log = LoggerFactory.getLogger(getClass().getName());

    public void onSubmit() {
        log.debug("Authentication goes here");

        Stage primaryStage = (Stage)btnSubmit.getScene().getWindow();
        ClassLoader cl = getClass().getClassLoader();
        try {
            Parent root = FXMLLoader.load(cl.getResource("app.fxml"));
            primaryStage.setTitle("SampleFX");
            primaryStage.setScene(new Scene(root, 450, 400));
            primaryStage.centerOnScreen();
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
