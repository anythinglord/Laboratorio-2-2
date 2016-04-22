package EjercicioDelBanco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean exit = false;
        boolean contin = true;
        Scanner sc = new Scanner(System.in);
        while(!exit){
            System.out.println("MENÚ DE BANCO\n1\tCrear cuenta de ahorros\n2\tCrear cuenta de cheques\nCualquier otro número para salir");
            byte opc = sc.nextByte();
            if(opc == 1){
                System.out.println("Igrese el interés");
                double interes = sc.nextDouble();
                int[] fecha = new int[3];
                System.out.println("Ingrese el día");
                fecha[0] = sc.nextInt();
                System.out.println("Ingrese el número del mes");
                fecha[1] = sc.nextInt();
                System.out.println("Ingrese el año");
                fecha[2] = sc.nextInt();
                System.out.println("Ingrese el saldo inicial");
                double saldoI = sc.nextDouble();
                System.out.println("Ingrese su nombre");
                String nombre = sc.next();
                System.out.println("Ingrese el número de cuenta");
                int noCuenta = sc.nextInt();
                CuentaAhorros cuenta = new CuentaAhorros(interes, fecha, saldoI, nombre, noCuenta);
                while(contin){
                System.out.println("Usted puede realizar las siguientes acciones con su cuenta: \n1\tRetirar dinero\n2\tDepositar dinero\n3\tConsultar su saldo\n4\tDepositar intereses\nIngrese cualquier otro número para salir");
                    switch (sc.nextInt()){
                        case 1: System.out.println("Ingrese la cantidad de dinero que desea retirar");
                            double retirar = sc.nextDouble();
                            System.out.println("Ingrese el día");
                            fecha[0] = sc.nextInt();
                            System.out.println("Ingrese el número del mes");
                            fecha[1] = sc.nextInt();
                            System.out.println("Ingrese el año");
                            fecha[2] = sc.nextInt();
                            cuenta.retirar(retirar, fecha);
                            break;
                        case 2: System.out.println("Ingrese la cantidad de dinero que desea depositar");
                            double depositar = sc.nextDouble();
                            cuenta.depositar(depositar);
                            break;
                        case 3: System.out.println("Su saldo actual es: $"+cuenta.getSaldo());
                            break;
                        case 4: System.out.println("Ingrese la cantidad de dinero que desea consignar, equivalente a sus intereses");
                            double intereses = sc.nextDouble();
                            System.out.println("Ingrese el día");
                            fecha[0] = sc.nextInt();
                            System.out.println("Ingrese el número del mes");
                            fecha[1] = sc.nextInt();
                            System.out.println("Ingrese el año");
                            fecha[2] = sc.nextInt();
                            cuenta.depositarIntereses(fecha, intereses);
                            break;
                    }
                    System.out.println("Ingrese 1 si desea continuar");
                    if(sc.nextInt() != 1) contin = false;
                }
                contin = true;
            } else if (opc == 2){
                System.out.println("Igrese la comisión por el uso de chequera");
                double comisionCheq = sc.nextDouble();
                System.out.println("Ingrese la comisión por saldo insuficiente");
                double comisionSaldoI = sc.nextDouble();
                System.out.println("Ingrese el saldo inicial");
                double saldoI = sc.nextDouble();
                System.out.println("Ingrese su nombre");
                String nombre = sc.next();
                System.out.println("Ingrese el número de cuenta");
                int noCuenta = sc.nextInt();
                CuentaDeCheques cuenta = new CuentaDeCheques(comisionCheq, comisionSaldoI, saldoI, nombre, noCuenta);
                while(contin){
                    System.out.println("Usted puede realizar las siguientes acciones con su cuenta:\n1\tExpedir cheques\n2\tRetirar dinero\n3\tDepositar dinero\n4\tConsultar su saldo\nIngrese cualquier otro numero para salir");
                    switch(sc.nextInt()){
                        case 1: System.out.println("Ingrese la cantidad de dinero que desea expedir en su cheque");
                            cuenta.expedirCheque(sc.nextDouble());
                            break;
                        case 2: System.out.println("Ingrese la cantidad de dinero que desea retirar");
                            cuenta.retirar(sc.nextDouble());
                            break;
                        case 3: System.out.println("Ingrese la cantidad de dinero que desea ingresar");
                            cuenta.depositar(sc.nextDouble());
                            break;
                        case 4: System.out.println("Su saldo actual es: $"+cuenta.getSaldo());
                            break;
                    }
                    System.out.println("Ingrese 1 si desea continuar");
                    if(sc.nextInt() != 1) contin = false;
                }
                contin = true;
            }
        }
    }
}
