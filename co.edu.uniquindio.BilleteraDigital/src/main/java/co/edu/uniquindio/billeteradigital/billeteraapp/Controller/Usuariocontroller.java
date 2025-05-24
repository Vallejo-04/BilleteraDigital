package co.edu.uniquindio.billeteradigital.billeteraapp.Controller;

import co.edu.uniquindio.billeteradigital.billeteraapp.BilleteraApplication;
import co.edu.uniquindio.billeteradigital.billeteraapp.Mapping.Record.UsuarioDto;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Usuariocontroller {
    UsuarioDto usuario;
    public Usuariocontroller() {}

    public void CambiarPantalla(String fxmlFIle) {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFIle));
            Scene nuevaScene = new Scene(loader.load());
            Stage nuevoStage = new Stage();
            nuevoStage.setTitle("Usuario");
            nuevoStage.setScene(nuevaScene);
            nuevoStage.show();
            BilleteraApplication.cerrarStage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void SetUsuarioDto(UsuarioDto usuarioSeleccionado) {
        this.usuario = usuarioSeleccionado;
    }
}
