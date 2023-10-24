public class CuentaBancaria {
    private double saldo;
    private String numeroCuenta;

    public CuentaBancaria(double saldo, String numeroCuenta) {
        this.saldo = 0.0;
        this.numeroCuenta = numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    /*11. Define métodos para depositar y retirar dinero de la cuenta.*/

    // Método para depositar dinero en la cuenta
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se depositaron " + cantidad + " en la cuenta.");
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que 0.");
        }
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Se retiraron " + cantidad + " de la cuenta.");
        } else if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor que 0.");
        } else {
            System.out.println("Saldo insuficiente para realizar la operación.");
        }
    }
}
