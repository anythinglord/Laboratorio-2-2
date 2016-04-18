package AgenciaVendedoraDeAutos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList <AutoCompacto> autosCompactos = new ArrayList <>();
        ArrayList <AutoDeLujo> autosDeLujo = new ArrayList <>();
        ArrayList <Camioneta> camionetas = new ArrayList <>();
        ArrayList <Vagoneta> vagonetas = new ArrayList <>();
        Scanner sc = new Scanner(System.in);
        boolean exit=false;
        do{
            System.out.println("Ingrese 1 para ingresar un auto, 2 para buscar lo datos de un auto o cualquier otro numero para salir");
            int opc = sc.nextInt();
            switch (opc){
                case 1: int cantPas;
                    System.out.println("Ingrese el No de Serie");
                    int noSerie = sc.nextInt();
                    System.out.println("Ingrese el precio");
                    double precio = sc.nextDouble();
                    System.out.println("Ingrese el año");
                    int año = sc.nextInt();
                    System.out.println("Ingrese la marca");
                    String marca = sc.next();
                    System.out.println("Ingrese:\n1 si es un auto compacto\n2 si es un auto de lujo\n3 si es una camioneta\n4 si es una vagoneta");
                    int opc1 = sc.nextInt();
                    switch(opc1){
                        case 1: System.out.println("Ingrese la cantidad de pasajeros");
                            cantPas = sc.nextInt();
                            AutoCompacto autoCompacto = new AutoCompacto(noSerie, precio, año, marca, cantPas);
                            autosCompactos.add(autoCompacto);
                            break;
                        case 2: System.out.println("Ingrese la cantidad de pasajeros");
                            cantPas = sc.nextInt();
                            AutoDeLujo autoDeLujo = new AutoDeLujo(noSerie, precio, año, marca, cantPas);
                            autosDeLujo.add(autoDeLujo);
                            break;
                        case 3: System.out.println("Ingrese la capacidad de carga en Kg");
                            double capCarga = sc.nextDouble();
                            System.out.println("Ingrese la canidad de ejes");
                            int cantEjes = sc.nextInt();
                            System.out.println("Ingrese la catidad de rodadas");
                            int cantRod = sc.nextInt();
                            Camioneta camioneta = new Camioneta(noSerie, precio, año, marca, capCarga, cantEjes, cantRod);
                            camionetas.add(camioneta);
                            break;
                        case 4:System.out.println("Ingrese la cantidad de pasajeros");
                            cantPas = sc.nextInt();
                            Vagoneta vagoneta = new Vagoneta(noSerie, precio, año, marca, cantPas);
                            vagonetas.add(vagoneta);
                            break;
                    }
                    System.out.println("Su vehiculo se agrego satisfactoriamente");
                    break;
                case 2: System.out.println("MENU DE BUSQUEDA\n1\tBuscar por No de Serie\n5\tMostrar todos los autos de un mismo tipo");
                    int opc2 = sc.nextInt();
                    if(opc2==1){
                        System.out.println("Ingrese el No de Serie");
                        int noSerie1 = sc.nextInt();
                        buscarNoSerie(noSerie1, autosCompactos, autosDeLujo, camionetas, vagonetas);
                    }else if(opc2==2){
                        System.out.println("Ingrese segun el tipo que desea buscar:\n1 Autos compactos\n2 Autos de lujo\n3 Camionetas\n4 Vagonetas");
                        int opc3 = sc.nextInt();
                        switch (opc3){
                            case 1:
                                System.out.println("Autos compactos:\n\nNo Serie\tPrecio\t  Año\t  Marca\t  Pasajeros");
                                for(int i=0; i<autosCompactos.size(); i++){
                                System.out.println(autosCompactos.get(i).toString()+"\t  "+autosCompactos.get(i).getCantPas());
                                }
                            case 2:
                                System.out.println("Autos de lujo:\n\nNo Serie\tPrecio\t  Año\t  Marca\t  Pasajeros");
                                for(int i=0; i<autosDeLujo.size(); i++){
                                System.out.println(autosDeLujo.get(i).toString()+"\t  "+autosDeLujo.get(i).getCantPas());
                                }
                            case 3:
                                System.out.println("Camionetas:\n\nNo Serie\tPrecio\t  Año\t  Marca\t  Carga\t  Ejes\t  Rodadas");
                                for(int i=0; i<camionetas.size(); i++){
                                System.out.println(camionetas.get(i).toString()+"\t  "+camionetas.get(i).getCarga()+"\t  "+camionetas.get(i).getCantEjes()+"\t  "+camionetas.get(i).getCantRod());
                                }    
                            case 4:
                                System.out.println("Vagonetas:\n\nNo Serie\tPrecio\t  Año\t  Marca\t  Pasajeros");
                                for(int i=0; i<vagonetas.size(); i++){
                                System.out.println(vagonetas.get(i).toString()+"\t  "+vagonetas.get(i).getCantPas());
                                }    
                        }
                    }
                    break; 
                default: exit = true;
                    break;
            } 
        }while(!exit);
    }
    
        private static void buscarNoSerie(int noSerie, ArrayList<AutoCompacto> autosCompactos, ArrayList<AutoDeLujo> autosDeLujo, ArrayList<Camioneta> camionetas, ArrayList<Vagoneta> vagonetas){
        System.out.println("Los autos con el No de serie "+noSerie+" son:");
        System.out.println("No Serie\tPrecio\t  Año\t  Marca\t  Tipo");
        for(int i=0; i<autosCompactos.size(); i++){
            if(noSerie==autosCompactos.get(i).getNoSerie())System.out.println(autosCompactos.get(i).toString()+"Auto Compacto");
        }
        for(int i=0; i<autosDeLujo.size(); i++){
            if(noSerie==autosDeLujo.get(i).getNoSerie())System.out.println(autosDeLujo.get(i).toString()+"Auto de Lujo");
        }
        for(int i=0; i<camionetas.size(); i++){
            if(noSerie==camionetas.get(i).getNoSerie())System.out.println(camionetas.get(i).toString()+"Camioneta");
        }
        for(int i=0; i<vagonetas.size(); i++){
            if(noSerie==vagonetas.get(i).getNoSerie())System.out.println(vagonetas.get(i).toString()+"Vagoneta");
        }
    }
}