package AgenciaVendedoraDeAutos;

public class AutoDeLujo extends Vehiculo{
    private int cantPasajeros;

    public AutoDeLujo(int noSerie, double precio, int año, String marca, int cantPasajeros) {
        super("Auto de lujo", noSerie, precio, año, marca);
        this.cantPasajeros = cantPasajeros;
    }
    
    public int getCantPas(){
        return cantPasajeros;
    }
    
    public String toSrtring(){
        return this.tipo+"\t   "+this.noSerie+"\t   ";
    }
}
