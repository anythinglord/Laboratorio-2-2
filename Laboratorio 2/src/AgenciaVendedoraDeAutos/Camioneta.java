package AgenciaVendedoraDeAutos;

public class Camioneta extends Vehiculo{
    private double capacCarga;
    private int cantEjes;
    private int cantRod;

    public Camioneta(int noSerie, double precio, int año, String marca, double capacCarga, int cantEjes, int cantRod){
        super("Camioneta", noSerie, precio, año, marca);
        this.capacCarga = capacCarga;
        this.cantEjes = cantEjes;
        this.cantRod = cantRod;
    }

    public double getCarga() {
        return capacCarga;
    }

    public int getCantEjes() {
        return cantEjes;
    }

    public int getCantRod() {
        return cantRod;
    }
}