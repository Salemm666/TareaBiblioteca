package tarea3;

public class Estudiante {
    private String nombre;
    private int codigo;
    private double promedio;

    public Estudiante(String nombre, int codigo, double promedio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return "[" + codigo + "] " + nombre + " - Promedio: " + promedio;
    }
}
