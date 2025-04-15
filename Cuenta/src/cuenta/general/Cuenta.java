package cuenta.general;

import java.util.Objects;

public class Cuenta {
    private String nombre;
    private final int numero;
    private double debito;
    private double credito;
    private TipoCuenta tipo;

    public Cuenta(String nombre, int numero, double debito, double credito, TipoCuenta tipo, Cuenta cuentaPadre) {
        this.nombre = nombre;
        this.numero = numero;
        this.debito = debito;
        this.credito = credito;
        this.tipo = tipo;
    }

    public Cuenta(int numero, String nombre, TipoCuenta tipo, Cuenta cuentaPadre) {
        this.numero = numero;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Cuenta() {
        numero = 0;
        nombre = "";
        debito = 0;
        credito = 0;
        tipo = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public TipoCuenta getTipo() {
        return tipo;
    }

    public void setTipo(TipoCuenta tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", debito=" + debito +
                ", credito=" + credito +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cuenta cuenta = (Cuenta) o;
        return numero == cuenta.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numero, debito, credito, tipo);
    }
}

