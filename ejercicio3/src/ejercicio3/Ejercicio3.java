public class Ejercicio3
{
   public static void main(String[] args)
   {
            int i = 0;
            int freesp = 87;
            int valorhora = 1500;
            int a = 0;
            int prec = 0;
            int[] v = new int[87];
            int[] m = new int[87];
            int[] p = new int[87];
            int[] n = new int[87];


            for ( i = 0 ; i < 87 ; i = i + 1 )
            {
               v[i] = 0 ;
               n[i] = 0 ;
            }//End  For


            for ( i = 0 ; i < 87 ; i = i + 1 )
            {
               System.out.println("dinero recogido:"+ prec);
               System.out.println("puestos libres:"+ freesp);
               System.out.println("digite la hora de llegada");
               Scanner input = new Scanner(System.in);
               m[i] = input.nextInt();
               System.out.println("digite la hora de salida");
               n[i] = input.nextInt();
               a = 0 ;

               if (m[i] < 20 && m[i] > 6 )
               {

                  if (v[i] == 0 )
                  {
                     System.out.println("digite la placa del carro");
                     p[i] = input.nextInt();
                     System.out.println("te correspondio el puesto numero:" + (i + 1));
                     freesp = freesp - 1 ;
                  }//End  If
                  else 
                  {
                     i = i + 1 ;
                     freesp = freesp - 1 ;
                  }//End  Else


                  while (a < 6 )
                  {

                     if (m[i] == n[a] )
                     {
                        System.out.println("el carro de la placa #:" + p[i] + "debe pagar:" + valorhora * ( n[a] - m[a] ));
                        v[i] = 0 ;
                        prec = prec + valorhora * (n[a] - m[a]);
                        a = 6 ;
                     }//End  If
                     else 
                     {
                     }//End  Else

                     a = a + 1 ;
                  }//End While

               }//End  If
               else 
               {
                  System.out.println("el parqueadero no esta en funcionamiento");
               }//End  Else

            }//End  For


   }//End Main
