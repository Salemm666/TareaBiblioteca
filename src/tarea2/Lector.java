package tarea2;

public class Lector {
    private String nombre;

    public Lector(String nombre){
        this.nombre=nombre;
    }

    public void prestar(Libro libro, Recibo recibo){
        recibo.imprimir(nombre + " se prestó el libro: " + libro.getTitulo());
    }
}
