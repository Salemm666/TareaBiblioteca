package tarea2;

public class Biblioteca {
    private String nombre;
     Catalogo catalogo;

    public Biblioteca(String nombre){
        this.nombre=nombre;
        catalogo = new Catalogo();
    }

}
