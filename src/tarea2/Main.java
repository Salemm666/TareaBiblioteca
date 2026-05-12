package tarea2;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Grimorios");

        Autor autor1 = new Autor("Gabriel García");
        Autor autor2 = new Autor("Ana Frank");

        Libro libro1 = new Libro("El coronel no tiene quien le escriba");
        libro1.asignarAutor(autor1);

        Libro libro2 = new Libro("El Diario de Ana Frank");
        libro2.asignarAutor(autor2);

        Libro libro3 = new Libro("Cien años de seriedad xd");
        libro3.asignarAutor(autor1);

        biblioteca.catalogo.agregarLibro(libro1);
        biblioteca.catalogo.agregarLibro(libro2);
        biblioteca.catalogo.agregarLibro(libro3);

        Lector lector1 = new Lector("Salem");

        Recibo recibo1 = new Recibo();

        lector1.prestar(libro3, recibo1);
    }
}
