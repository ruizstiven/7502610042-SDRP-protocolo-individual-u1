package Estudiante;

public class Estudiante {
    // Propiedades o atributos
    private String nombre;
    private int edad;
    private String curso;

    // 1. Constructor por defecto (valores genéricos)
    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.curso = "Ninguno";
    }

    // 2. Constructor con dos parámetros (nombre y edad)
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "No asignado"; // Valor por defecto para el curso
    }

    // 3. Constructor con todos los parámetros usando this()
    public Estudiante(String nombre, int edad, String curso) {
        // Llama al constructor número 2 (el que recibe nombre y edad)
        this(nombre, edad);

        // Ahora solo asignamos la propiedad que faltaba
        this.curso = curso;
    }

    // Método para mostrar los datos del estudiante
    public void mostrarDatos() {
        System.out.println("Estudiante: " + this.nombre +
                " | Edad: " + this.edad + " años" +
                " | Curso: " + this.curso);
    }
    @Override
    public String toString() {
        return "Estudiante [Nombre: " + this.nombre + ", Edad: " + this.edad + " años, Curso: " + this.curso + "]";
    }
}
