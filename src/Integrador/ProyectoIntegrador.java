package Integrador;

import Libro.libro;
import Cuenta.CuentaBancaria;
import Estudiante.Estudiante;


import java.util.Scanner;

public class ProyectoIntegrador {
    public static void main(String[] args) {
        // Scanner para leer los datos que el usuario escriba en la consola
        Scanner teclado = new Scanner(System.in);

        System.out.println("===== BIENVENIDO AL PROYECTO INTEGRADOR =====\n");


        // 1. INGRESO DE DATOS POR CONSOLA (Para el Libro)

        System.out.println("--- Registro de un Nuevo Libro ---");
        System.out.print("Ingresa el título del libro: ");
        String tituloLibro = teclado.nextLine();

        System.out.print("Ingresa el autor del libro: ");
        String autorLibro = teclado.nextLine();

        System.out.print("Ingresa el número de páginas: ");
        int paginasLibro = teclado.nextInt();
        teclado.nextLine();

        // Inicializamos el objeto Libro usando el constructor parametrizado
        libro miLibro = new libro(tituloLibro, autorLibro, paginasLibro);
        System.out.println("¡Libro guardado con éxito!\n");



        // 2. INGRESO DE DATOS POR CONSOLA (Para la Cuenta Bancaria)
        System.out.println("--- Registro de Cuenta Bancaria ---");
        System.out.print("Ingresa el número de cuenta: ");
        String numCuenta = teclado.nextLine();

        System.out.print("Ingresa el tipo de cuenta (Ahorros/Corriente): ");
        String tipoCuenta = teclado.nextLine();

        // Inicializamos usando el constructor de 2 parámetros (el saldo empezará en $0.0 automáticamente)
        CuentaBancaria miCuenta = new CuentaBancaria(numCuenta, tipoCuenta);
        System.out.println("¡Cuenta bancaria creada con éxito con saldo inicial de $0.0!\n");



        // 3. INGRESO DE DATOS POR CONSOLA (Para el Estudiante)

        System.out.println("--- Registro de un Estudiante ---");
        System.out.print("Ingresa el nombre del estudiante: ");
        String nombreEst = teclado.nextLine();

        System.out.print("Ingresa la edad del estudiante: ");
        int edadEst = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Ingresa el curso del estudiante: ");
        String cursoEst = teclado.nextLine();

        // Inicializamos usando el constructor de 3 parámetros que hace uso de 'this()'
        Estudiante miEstudiante = new Estudiante(nombreEst, edadEst, cursoEst);
        System.out.println("¡Estudiante inscrito con éxito!\n");



        // 4. MOSTRAR DETALLES
        System.out.println(" RESULTADOS DE LOS OBJETOS CREADOS ");


        System.out.println(miLibro);
        System.out.println(miCuenta);
        System.out.println(miEstudiante);

        teclado.close();
    }
}