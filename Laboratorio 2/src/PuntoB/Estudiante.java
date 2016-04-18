package PuntoB;
public class Estudiante extends Persona {
    private int grado;
    private char grupo;
    public Estudiante(String[] nombre, String[] domicilio, String[] horario,int grado,char grupo) {
        super(nombre, domicilio, horario);
        this.grado=grado;
        this.grupo=grupo;
    }
    public void Estudiar(){}    
}
