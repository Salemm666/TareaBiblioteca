package tarea2;

public class Libro {
    private String titulo;
    private Autor autor;

    public Libro(String titulo){
        this.titulo= titulo;
    }

    public void asignarAutor(Autor autorLibro){
        autor=autorLibro;
    }
    public String getTitulo(){
        return titulo;
    }

    @Override
    public String toString(){
        return titulo + (autor != null ? "Autor: " + autor.getNombre():"");
    }
}
