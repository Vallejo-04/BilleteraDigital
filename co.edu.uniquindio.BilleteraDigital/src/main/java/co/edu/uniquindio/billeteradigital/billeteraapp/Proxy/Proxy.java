package co.edu.uniquindio.billeteradigital.billeteraapp.Proxy;

import co.edu.uniquindio.billeteradigital.billeteraapp.Mapping.Record.UsuarioDto;
import co.edu.uniquindio.billeteradigital.billeteraapp.ModelFactory.ModelFactory;
import co.edu.uniquindio.billeteradigital.billeteraapp.model.Usuario;

public class Proxy {
  public static UsuarioDto ValidarContrasena (String contrasena){
        UsuarioDto usuarioDto = ModelFactory.getInstance().ValidarContrasena(contrasena);
        if (usuarioDto != null) {
            return usuarioDto;
        }
      return null;
  }
}
