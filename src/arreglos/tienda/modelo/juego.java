package arreglos.tienda.modelo;

public class juego {
    private String nombre;
    private String categoria;
    private int memoria;
    private double precio;
    private int licenciasDisponibles;
    private int licenciasVendidas;

    public juego(String categoria, int licenciasDisponibles, double precio, int memoria, String nombre) {
        this.categoria = categoria;
        this.licenciasDisponibles = licenciasDisponibles;
        this.precio = precio;
        this.memoria = memoria;
        this.nombre = nombre;
        licenciasVendidas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getMemoria() {
        return memoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.trim().isEmpty())
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        if(categoria !=null && !categoria.trim().isEmpty())
        this.categoria = categoria;
    }

    public void setMemoria(int memoria) {
        if(memoria > 0)
        this.memoria = memoria;
    }

    public void setPrecio(double precio) {
        if(precio > 0)
        this.precio = precio;
    }
}
