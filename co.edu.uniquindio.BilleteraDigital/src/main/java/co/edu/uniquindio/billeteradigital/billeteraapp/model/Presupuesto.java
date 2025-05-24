package co.edu.uniquindio.billeteradigital.billeteraapp.model;

import java.util.ArrayList;

public class Presupuesto {
    private String nombre;
    private double Saldo;
    private double SaldoGastado;
    private ArrayList<Categoria> categorias;

    public Presupuesto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void BorrarCategorias(Categoria categoria) {
        categorias.remove(categoria);
    }
    public void AgregarCategorias(Categoria categoria) {
        categorias.add(categoria);
    }
}
