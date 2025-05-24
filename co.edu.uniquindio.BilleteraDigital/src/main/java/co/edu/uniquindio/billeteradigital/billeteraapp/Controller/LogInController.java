package co.edu.uniquindio.billeteradigital.billeteraapp.Controller;

import co.edu.uniquindio.billeteradigital.billeteraapp.Mapping.Record.UsuarioDto;
import co.edu.uniquindio.billeteradigital.billeteraapp.ModelFactory.ModelFactory;
import co.edu.uniquindio.billeteradigital.billeteraapp.Proxy.Proxy;
import co.edu.uniquindio.billeteradigital.billeteraapp.Util.Util;

public class LogInController {
    ModelFactory modelFactory = ModelFactory.getInstance();
    Usuariocontroller usuarioController = new Usuariocontroller();
    public LogInController() {
        modelFactory = ModelFactory.getInstance();
    }
    //AdministradorController administradorController;

    public void validarContrasena(String contrasena,String tipo){
    if (tipo.equalsIgnoreCase("usuario")){
        VerificarContrasenaUsuario(contrasena,tipo);
    }
}

    private void VerificarContrasenaUsuario(String contrasena,String tipo) {
        UsuarioDto usuarioSeleccionado = Proxy.ValidarContrasena(contrasena);
        if ( usuarioSeleccionado== null ){
            Util.NotificarContrasenaIncorrecta();
        }else {
            usuarioController.SetUsuarioDto(usuarioSeleccionado);
            usuarioController.CambiarPantalla("/co/edu/uniquindio/billeteradigital/billeteraapp/Usuario.fxml");

        }
    }



}
