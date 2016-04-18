package EjercicioJuegosDePC;

public class Alienigena {
    private String idioma;
    private String piel;
    private String nombre;
    private String especie;
    private int numojos;
    private String planet;
    private String region;

    public Alienigena(String nombre, String idioma, String especie, String piel, int numojos, String planet, String region) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.especie = especie;
        this.piel = piel;
        this.numojos = numojos;
        this.planet= planet;
        this.region = region;
    }
    
    public String toString(){
        return "Nombre: "+nombre+"\nPlaneta: "+planet+"\nRegion: "+region+"\nEspecie: "+especie+"\nIdioma: "+idioma+"\nTipo de piel: " +piel+ "\nNumero de ojos: " + numojos;
    }
}
