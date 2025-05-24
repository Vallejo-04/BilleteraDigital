package co.edu.uniquindio.billeteradigital.billeteraapp.model;

import java.util.ArrayList;

public class Cuenta {
    private static int IdCuenta;
    public static int IdIncrementable = 0;
    private String NombreBanco;
    private String numeroCuenta;
    private String tipoCuenta;
    public Cuenta() {}
    public Cuenta(String NombreBanco, String numeroCuenta, String tipoCuenta) {
        IdIncrementable ++;
        this.IdCuenta = IdIncrementable;
        this.NombreBanco = NombreBanco;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;

    }
    public static int getIdCuenta() {
        return IdCuenta;
    }

    public static void setIdCuenta(int idCuenta) {
        IdCuenta = idCuenta;
    }

    public String getNombreBanco() {
        return NombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        NombreBanco = nombreBanco;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}
