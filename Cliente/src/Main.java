import cliente.general.Cliente;
import cuenta.general.Cuenta;
import cuenta.general.TipoCuenta;

public class Main {
    public static void main(String[] args) {
       Cuenta cuenta = new Cuenta(123, "Activo", TipoCuenta.DEBITO, null);
        Cliente cliente = new Cliente("Odalis", cuenta, (cuenta.getDebito() - cuenta.getCredito()));
        System.out.println(cliente);
    }
}