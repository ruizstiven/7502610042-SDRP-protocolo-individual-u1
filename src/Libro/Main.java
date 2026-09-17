import Libro.libro;

public static void main(String[] args) {
    // Constructor por defecto
    var libro1 = new libro();

    // Constructor parametrizado
    var libro2 = new libro("Cien años de soledad", "Gabriel García Márquez", 496);

    // Mostrar los detalles de ambos
    libro1.mostrarDetalles();
    System.out.println();
    libro2.mostrarDetalles();
}

