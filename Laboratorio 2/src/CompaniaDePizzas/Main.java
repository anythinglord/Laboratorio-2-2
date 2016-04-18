package CompaniaDePizzas;

public class Main {
    public static void main (String[]args){
        java.util.Scanner lectura=new java.util.Scanner(System.in);
        String Digi;
        do{
            System.out.println("Desea crear una pizza? Escriba si o no");
            Digi=lectura.next();
            if (Digi.equals("si")){
                Pizza pizza;
                System.out.println("MENU DE PIZZAS: \n1\tvegetariana\n2\tQueso\n3\tPepperoni\nPor favor ingrese el numero de la pizza que desea");
                int opc=lectura.nextInt();
                if(opc == 1) {
                    pizza = new Vegetariana();
                } else if(opc == 2) {
                    pizza = new Queso();
                } else pizza = new Pepperoni();
                pizza.preparar();
                pizza.hornear();
                pizza.cortar();
                pizza.empacar();
            } else {
                System.out.println("Gracias por su compra");
            }
        }while(Digi.equals("si"));
    }
}
