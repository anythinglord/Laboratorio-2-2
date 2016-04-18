package EjercicioDelBanco;

public class Cuenta {
    protected int noCuenta;
    protected String nombre;
    protected double saldo;
    public double getSaldo(){
        return saldo;
    }
    public int getNoCuenta(){
        return noCuenta;
    }
    public String getNombre(){
        return nombre;
    }
    public boolean retirar(double cant, int[] fecha) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public boolean retirar(double cant) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public boolean depositar(double cant){
        if(cant>=0){
            noCuenta += cant;
            return true;
        }return false;
    }
}