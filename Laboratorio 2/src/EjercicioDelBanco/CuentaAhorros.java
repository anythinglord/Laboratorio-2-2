package EjercicioDelBanco;

public class CuentaAhorros extends Cuenta{
    private int[] fechaDeVencimiento;
    private double interes;
    
    public boolean depositarIntereses(int[] fecha, double cant){
        if(fecha[0]==1&&cant==interes*saldo/100){
            return true;
        }return false;
    }
    
    @Override
    public boolean retirar(double cant, int[] fecha) {
        if(fechaDeVencimiento == fecha && cant<=this.saldo){
            this.saldo-=cant;
            return true;
        } return false;
    }

    public CuentaAhorros(double interes, int[] fecha, double saldoInicial, String nombre, int noCuenta) {
        this.interes = interes;
        this.fechaDeVencimiento = fecha;
        this.saldo = saldoInicial;
        this.nombre = nombre;
        this.noCuenta = noCuenta;
    }
}
