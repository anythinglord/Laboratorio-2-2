package CompaniaDePizzas;

import java.util.ArrayList;

public abstract class Pizza {
    protected String nombre;
    protected String masa;
    protected String salsa;
    protected ArrayList<String> ingredientes= new ArrayList();
    
    public void preparar(){
        System.out.println("Preparando y amasando la masa...");
        System.out.println("Tipo de Masa: " + masa);
        System.out.println("Tipo de salsas: " + salsa);
        System.out.println("Ingredientes: "+ingredientes.get(0));
        for(int i=1;i<ingredientes.size();i++){
            System.out.print(", "+ingredientes.get(i));
        }
    }
    
    public void hornear(){
        System.out.println("El proceso de hornear tarda de 15 a 50 minutos.");
    }
    public void cortar(){
        System.out.println("El corte de la pizza se realizara en porciones triangulares del mismo tamaño.");
    }
    public void empacar(){
        System.out.println("Su caja es proporcional al tamaño de la pizza y de caracter cubico.");
    }     

    public String getNombre() {
        return nombre;
    }
 }