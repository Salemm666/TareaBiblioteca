package tarea1;

public class Videojuego {
    private String titulo;
    private double precio;
    private int copias;
    private String estado;
    private boolean enOferta;
    private double precioOferta;

    public String getTitulo() { return titulo; }
    public double getPrecio() { return precio; }
    public int getCopias() { return copias; }
    public String getEstado() { return estado; }
    public boolean isEnOferta() { return enOferta; }
    public double getPrecioOferta() { return precioOferta; }

    public void activarOferta(double porcentaje) {
        if ((porcentaje < 5) || (porcentaje > 70))
            throw new IllegalArgumentException ("Porcentaje invalido");
        this.enOferta = true;
        this.precioOferta = precio - (precio * porcentaje / 100);

    }

    public void vender(){
        if (!estado.equals("Disponible") && !estado.equals("Agotado") && !estado.equals("Descontinuado"))
            throw new IllegalStateException ("Estado incorrecto");
        if (estado.equals("Descontinuado"))
            throw new IllegalStateException ("Videojuego descontinuado");
        if (copias<=0)
            throw new IllegalArgumentException("No hay copias");
        copias--;
        if (copias==0) estado = "Agotado";
    }

    public void descontinuar(){
        if (estado.equals("Descontinuado"))
            throw new IllegalStateException("Descontinuado") ;
        this.estado = "Descontinuado";
    }
}
