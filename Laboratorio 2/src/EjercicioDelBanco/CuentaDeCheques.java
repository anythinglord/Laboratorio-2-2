package EjercicioDelBanco;

public class CuentaDeCheques extends Cuenta{
    private double comisionChequera;
    private double comisionSerPobre;
    
    public boolean expedirCheque(double cant){
        if(cant>=saldo){
            comisionSaldoInsuficiente();
        }
        this.saldo -=cant;
        return true;
    }
    
    public void comisionSaldoInsuficiente(){
    }
    
    @Override
    public boolean retirar(double cant){
        if(cant<=this.saldo){
            this.saldo -= cant;
            return true;
        } return false;
    }
}