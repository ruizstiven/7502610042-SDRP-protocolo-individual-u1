import Cuenta.CuentaBancaria;

public static void main(String[] args) {
    // Probando el constructor 1 (Por defecto)
    CuentaBancaria cuenta1 = new CuentaBancaria();

    // Probando el constructor 2 (Dos parámetros)
    CuentaBancaria cuenta2 = new CuentaBancaria("987654", "Corriente");

    // Probando el constructor 3 (Tres parámetros)
    CuentaBancaria cuenta3 = new CuentaBancaria("123456", 1500.50, "Ahorros");

    // Mostramos resultados en consola
    cuenta1.mostrarInfo();
    cuenta2.mostrarInfo();
    cuenta3.mostrarInfo();
}


