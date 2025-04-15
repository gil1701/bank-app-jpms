package cliente.general;

import cuenta.general.Cuenta;

public class Cliente {
    private String nombre;
    private Cuenta cuenta;
    private double saldo;

    public Cliente(String nombre, Cuenta cuenta, double saldo) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", cuenta=" + cuenta +
                ", saldo=" + saldo +
                '}';
    }
}
