package co.edu.uniquindio.billeteradigital.billeteraapp.model;

import java.util.ArrayList;

public class Billetera {
    private ArrayList<Cuenta> cuentas;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Transaccion> transacciones;
    private ArrayList<Administrador> administradores;
    public Billetera() {
        this.cuentas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.transacciones = new ArrayList<>();
        this.administradores = new ArrayList<>();
    }
    public Usuario buscarUsuario (String contrasena) {
        for (Usuario usuario : usuarios) {
            if (usuario.getContrasena().equals(contrasena)) {
                return usuario;
            }
        }return null;
    }


    public Cuenta buscarCuenta(String idCuenta) {
        for (Cuenta c : cuentas) {
            if (c.getNumeroCuenta().equalsIgnoreCase(idCuenta)) {
                return c;
            }
        }
        return null;
    }
    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public boolean removeCuentas(Cuenta cuenta) {
        if (buscarCuenta(cuenta.getNumeroCuenta()) != null) {
            cuentas.remove(cuenta);
        }
        return true;
    }
    public boolean agregarCuentas(Cuenta cuenta) {
        if (buscarCuenta(cuenta.getNumeroCuenta()) != null ) {
            return false;
        }else {
            cuentas.add(cuenta);
            return true;
        }

    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public boolean addTransaccion(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
        return true;
    }

    public ArrayList<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(ArrayList<Administrador> administradores) {
        this.administradores = administradores;
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
