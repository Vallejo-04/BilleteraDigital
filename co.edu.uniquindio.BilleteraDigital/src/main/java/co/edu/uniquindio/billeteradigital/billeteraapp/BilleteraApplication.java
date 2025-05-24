package co.edu.uniquindio.billeteradigital.billeteraapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BilleteraApplication extends Application {
    private static Stage stagePrimario;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BilleteraApplication.class.getResource("Log.in.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stagePrimario = stage;
        stage.setScene(scene);
        stage.show();
    }

    public static void cerrarStage() {
        stagePrimario.close();
    }


    public static void main(String[] args) {
        launch();
    }
}