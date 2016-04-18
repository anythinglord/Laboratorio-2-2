package ClaseAbstractaShape;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("Ingrese 1 para crear un triángulo, 2 para crear un rectángulo, cualquier otro numero para salir");
            int opc = sc.nextInt();
            System.out.println("Ingrese la altura");
            double height = sc.nextDouble();
            System.out.println("Ingrese el ancho");
            double width = sc.nextDouble();
            if(opc == 1) {
                Triangle figure = new Triangle(height, width);
                System.out.println("Area: "+figure.getArea());
                System.out.println("Perimetro: "+figure.getPerimeter());
            } else if(opc==2){
                Rectangle figure = new Rectangle(height, width);
                System.out.println("Area: "+figure.getArea());
                System.out.println("Perimetro: "+figure.getPerimeter());
            } else exit = true;
        }
    }   
}