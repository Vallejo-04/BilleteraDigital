package co.edu.uniquindio.billeteradigital.billeteraapp.model;

import java.util.ArrayList;

public class Usuario {
    private String Contrasena;
    private String nombre;
    private String Correo;
    private String NumeroCelular;
    private String Id;
    private double saldoTotal;
    private ArrayList<Cuenta> CuentasAsociadas;
    private ArrayList<Presupuesto> PresupuestosAsociados;
    private ArrayList<Categoria> CategoriasAsociadas;

    public Usuario() {

    }

    public Usuario(String contrasena,
                   String nombre,
                   String correo,
                   String numeroCelular,
                   String id,
                   double saldoTotal,
                   ArrayList<Cuenta> cuentasAsociadas,
                   ArrayList<Presupuesto> presupuestosAsociados,
                   ArrayList<Categoria> categoriasAsociadas) {
        Contrasena = contrasena;
        this.nombre = nombre;
        Correo = correo;
        NumeroCelular = numeroCelular;
        Id = id;
        this.saldoTotal = saldoTotal;
        CuentasAsociadas = cuentasAsociadas;
        PresupuestosAsociados = presupuestosAsociados;
        CategoriasAsociadas = categoriasAsociadas;
    }

    public Usuario(String Nombre, String Correo, String NumeroCelular, String Id, String contrasena, double saldoTotal ) {
        this.nombre = Nombre;
        this.Correo = Correo;
        this.NumeroCelular = NumeroCelular;
        this.Id = Id;
        this.saldoTotal = saldoTotal;
        this.CuentasAsociadas = new ArrayList<>();
        this.PresupuestosAsociados = new ArrayList<>();
        this.CategoriasAsociadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getNumeroCelular() {
        return NumeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        NumeroCelular = numeroCelular;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public ArrayList<Cuenta> getCuentasAsociadas() {
        return CuentasAsociadas;
    }

    public void EliminarCuenta(Cuenta cuenta) {
        CuentasAsociadas.remove(cuenta);
    }

    public void  AgregarCuenta(Cuenta cuenta) {
        CuentasAsociadas.add(cuenta);
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public ArrayList<Presupuesto> getPresupuestosAsociados() {
        return PresupuestosAsociados;
    }

    public void RemovePresupuestos (Presupuesto presupuesto) {
        PresupuestosAsociados.add(presupuesto);
    }

    public ArrayList<Categoria> getCategoriasAsociadas() {
        return CategoriasAsociadas;
    }

    public void setCategoriasAsociadas(ArrayList<Categoria> categoriasAsociadas) {
        CategoriasAsociadas = categoriasAsociadas;
    }
}
