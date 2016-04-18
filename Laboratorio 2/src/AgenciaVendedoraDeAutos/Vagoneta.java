package AgenciaVendedoraDeAutos;

public class Vagoneta extends Vehiculo{
    private int cantPasajeros;

    public Vagoneta(int noSerie, double precio, int año, String marca, int cantPasajeros) {
        super("Vagoneta", noSerie, precio, año, marca);
        this.cantPasajeros = cantPasajeros;
    }
    
    public int getCantPas(){
        return cantPasajeros;
    }
    
    public String toSrtring(){
        return this.tipo+"\t   "+this.noSerie+"\t   ";
    }
}      