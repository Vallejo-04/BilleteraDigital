package co.edu.uniquindio.billeteradigital.billeteraapp.ViewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.billeteradigital.billeteraapp.Controller.LogInController;
import co.edu.uniquindio.billeteradigital.billeteraapp.Util.Util;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

import javafx.scene.control.TextField;

public class Log_inViewController {
    LogInController LogInController;
    @FXML
    private ResourceBundle resources;
    @FXML
    private ChoiceBox<String> CboxOpcion;

    @FXML
    private URL location;

    @FXML
    private TextField TXTContraseña;

    @FXML
    private TextField TXTNumeroAsociado;

    @FXML
    private Button BTNIngresar;

    @FXML
    void OnIngresar() throws IOException {
        ValidarCampoVacio ();

    }

    private void ValidarCampoVacio() {
        if (TXTContraseña.getText().isEmpty()||
                TXTNumeroAsociado.getText().isEmpty() ||
                CboxOpcion.getSelectionModel().getSelectedItem() == null) {
            Util.notificarCampoVacio();
        }else {
            validarContrasena();
        }
    }

    private void validarContrasena() {
    LogInController.validarContrasena(TXTContraseña.getText(),CboxOpcion.getValue());
    }


    @FXML
    void initialize() {
    CboxOpcion.getItems().addAll("Usuario", "Administrador");
    Util.initDatosPrueba();
    LogInController = new LogInController();
    }
}

