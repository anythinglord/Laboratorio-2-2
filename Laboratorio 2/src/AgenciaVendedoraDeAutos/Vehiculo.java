package AgenciaVendedoraDeAutos;

public abstract class Vehiculo{
    protected String tipo;
    protected int noSerie;
    protected double precio;
    protected int año;
    protected String marca;

    public int getNoSerie() {
        return noSerie;
    }

    public double getPrecio() {
        return precio;
    }

    public int getAño() {
        return año;
    }

    public String getMarca() {
        return marca;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    
    @Override
    public String toString() {
        return this.noSerie + "\t   " + this.precio + "\t   " + this.año + "\t   " + this.marca + "\t   " + this.tipo;
    }
    
    Vehiculo(String tipo, int noSerie, double precio, int año, String marca){
        this.tipo = tipo;
        this.noSerie = noSerie;
        this.precio = precio;
        this.marca = marca;
        this.año = año;
    }
}
