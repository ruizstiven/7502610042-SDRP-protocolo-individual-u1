import Estudiante.Estudiante;

public static void main(String[] args) {
    // Usando el constructor 1 (Por defecto)
    Estudiante est1 = new Estudiante();

    // Usando el constructor 2 (Nombre y edad)
    Estudiante est2 = new Estudiante("Daniela Jimenez", 17);

    // Usando el constructor 3 (Todos los parámetros con this())
    Estudiante est3 = new Estudiante("Stiven Ruiz", 17, "Programación A1");

    // Imprimir los resultados
    est1.mostrarDatos();
    est2.mostrarDatos();
    est3.mostrarDatos();
}
