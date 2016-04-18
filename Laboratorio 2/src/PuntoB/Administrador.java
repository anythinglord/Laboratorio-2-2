package PuntoB;
public class Administrador extends Empleado {
    private String[]puesto;
    public Administrador(String[] nombre, String[] domicilio, String[] horario,String[]puesto) {
        super(nombre, domicilio, horario);
        this.puesto=puesto;
    }
    public void Administrar(){}
}
