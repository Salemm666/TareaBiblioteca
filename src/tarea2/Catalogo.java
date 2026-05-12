package tarea2;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Libro> libros;
    private int cantidad = 0;

    public Catalogo(){
        libros= new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
}
