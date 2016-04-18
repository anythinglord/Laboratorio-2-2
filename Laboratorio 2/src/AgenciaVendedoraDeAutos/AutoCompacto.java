package AgenciaVendedoraDeAutos;

public class AutoCompacto extends Vehiculo{
    private int cantPasajeros;

    public AutoCompacto(int noSerie, double precio, int año, String marca, int cantPasajeros) {
        super("Auto compacto", noSerie, precio, año, marca);
        this.cantPasajeros = cantPasajeros;
    }
    
    public int getCantPas(){
        return cantPasajeros;
    }
    
    public String toSrtring(){
        return this.tipo+"\t   "+this.noSerie+"\t   ";
    }
}
