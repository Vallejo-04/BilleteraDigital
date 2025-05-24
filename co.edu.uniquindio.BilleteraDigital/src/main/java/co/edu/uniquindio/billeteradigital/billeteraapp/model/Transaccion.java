package co.edu.uniquindio.billeteradigital.billeteraapp.model;

import java.time.LocalDate;



public class Transaccion {
    private int monto;
    private LocalDate fecha;
    private String tipo;
    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;
    public Transaccion () {

    }
    public Transaccion(int monto, String tipo, Cuenta cuentaOrigen, Cuenta cuentaDestino) {
        this.monto = monto;
        this.fecha = LocalDate.now();
        this.tipo = tipo;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cuenta getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(Cuenta cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public Cuenta getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(Cuenta cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }
}
