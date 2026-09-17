package Libro;

public class libro {
    // Atributos
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // 1. Constructor por defecto (valores predeterminados)
    public libro() {
        this.titulo = "Sin título";
        this.autor = "Anónimo";
        this.numeroPaginas = 0;
    }

    // 2. Constructor parametrizado (valores específicos)
    public libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // 3. Métodos
    public void mostrarDetalles() {
        System.out.println("Detalles del Libro");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numeroPaginas);
    }
    @Override
    public String toString() {
        return "Libro [Título: " + this.titulo + ", Autor: " + this.autor + ", Páginas: " + this.numeroPaginas + "]";
    }
}