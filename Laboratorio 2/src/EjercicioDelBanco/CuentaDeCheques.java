package EjercicioDelBanco;

public class CuentaDeCheques extends Cuenta{
    private double comisionChequera;
    private double comisionSaldoIns;
    
    public boolean expedirCheque(double cant){
        if(cant>=saldo){
            comisionSaldoInsuficiente();
        }
        this.saldo -=cant;
        return true;
    }
    
    //Si el saldo queda negativo, éste será descontado de la próxima consignación
    public void comisionSaldoInsuficiente(){
        this.saldo -= comisionSaldoIns*this.saldo/100;
    }
    
    @Override
    public boolean retirar(double cant){
        if(cant<=this.saldo){
            this.saldo -= cant;
            return true;
        } return false;
    }
    
    
    public CuentaDeCheques(double comisionCheq, double comisionSaldoI,double saldoInicial, String nombre, int noCuenta){
        this.comisionChequera = comisionCheq;
        this.comisionSaldoIns = comisionSaldoI;
        this.saldo = saldoInicial;
        this.nombre = nombre;
        this.noCuenta = noCuenta;
    }
}
