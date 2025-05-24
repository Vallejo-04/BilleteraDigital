package co.edu.uniquindio.billeteradigital.billeteraapp.Util;

import co.edu.uniquindio.billeteradigital.billeteraapp.ModelFactory.ModelFactory;
import co.edu.uniquindio.billeteradigital.billeteraapp.model.Usuario;
import javafx.print.JobSettings;

import javax.swing.*;

public class Util {
    public static void notificarCampoVacio (){
       JOptionPane.showMessageDialog(null, "Aun Hay Campos Vacios,\n Debes Llenar Todos", "Error", JOptionPane.ERROR_MESSAGE);    }

    public static void NotificarContrasenaIncorrecta(){
        JOptionPane.showMessageDialog(null, "CONTRASENÑA INCORRECTA", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void initDatosPrueba(){
        Usuario usuario = new Usuario();
        usuario.setContrasena("1");
        ModelFactory.getInstance().AgregarUsuario(usuario);
    }
}
