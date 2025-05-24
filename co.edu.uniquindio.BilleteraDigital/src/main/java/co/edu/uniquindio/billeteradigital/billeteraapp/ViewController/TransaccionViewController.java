package co.edu.uniquindio.billeteradigital.billeteraapp.ViewController;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class TransaccionViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BTNRelizarTransaccion;

    @FXML
    private TableColumn<?, ?> TableFecha;

    @FXML
    private TableColumn<?, ?> TableCuentaOrigen;

    @FXML
    private TextField TXTCuentaDestino;

    @FXML
    private ChoiceBox<?> CVoxCuentaOrigen;

    @FXML
    private TableColumn<?, ?> TableTipoTransaccion;

    @FXML
    private TextField TXTidentificacion;

    @FXML
    private TableColumn<?, ?> TableCuentaDestino;

    @FXML
    private ChoiceBox<?> CVoxTipoTransaccion;

    @FXML
    private TableColumn<?, ?> TableMonto;

    @FXML
    void onRealizarTransaccion() {

    }

    @FXML
    void initialize() {

    }
}
