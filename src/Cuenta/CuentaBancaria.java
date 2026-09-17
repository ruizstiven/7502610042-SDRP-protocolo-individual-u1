package Cuenta;

public class CuentaBancaria {
    // Propiedades o atributos
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // 1. Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorros"; // Tipo por defecto
    }

    // 2. Constructor parametrizado con dos parámetros
    // El saldo se inicia automáticamente en cero
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.tipoCuenta = tipoCuenta;
    }

    // 3. Constructor sobrecargado con tres parámetros
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Método auxiliar para mostrar los datos de la cuenta
    public void mostrarInfo() {
        System.out.println("Cuenta: " + this.numeroCuenta +
                " | Tipo: " + this.tipoCuenta +
                " | Saldo: $" + this.saldo);
    }
    @Override
    public String toString() {
        return "Cuenta Bancaria [Número: " + this.numeroCuenta + ", Tipo: " + this.tipoCuenta + ", Saldo: $" + this.saldo + "]";
    }
}



