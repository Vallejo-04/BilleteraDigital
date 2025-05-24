package co.edu.uniquindio.billeteradigital.billeteraapp.ModelFactory;

import co.edu.uniquindio.billeteradigital.billeteraapp.Mapping.Mapper;
import co.edu.uniquindio.billeteradigital.billeteraapp.Mapping.Record.UsuarioDto;
import co.edu.uniquindio.billeteradigital.billeteraapp.model.Billetera;
import co.edu.uniquindio.billeteradigital.billeteraapp.model.Usuario;
import co.edu.uniquindio.billeteradigital.billeteraapp.service.IBilleteraMapping;

public class ModelFactory {
    private Billetera billetera;
    private static ModelFactory modelFactory;
    private IBilleteraMapping Mapper;
    private ModelFactory() {
        billetera = new Billetera();
        Mapper = new Mapper();
    }
    public static ModelFactory getInstance() {
        if (modelFactory == null){
            modelFactory = new ModelFactory();
            return modelFactory;
        }else {
            return modelFactory;
        }
    }

    public UsuarioDto ValidarContrasena(String contrasena) {
        return Mapper.UsuarioToUsuarioDto(billetera.buscarUsuario(contrasena));
    }

    public void AgregarUsuario(Usuario usuario) {
        billetera.agregarUsuario(usuario);
    }
}
