/*9. Ingresar un número n y a continuación n números positivos. Informar la
cantidad de mayores a 5 que se hayan ingresado.*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int contador=0;
        int nro;


         do
        {
            System.out.println("Ingrese un nro que sea >= a 10...");
            nro=scan.nextInt();
        } while (nro>10);




            for (int i = 0; i < nro; i++)
            {
                System.out.println("Ingrese el nro..." + (i + 1));
                int nroI = scan.nextInt();
                if (nroI > 5)
                {
                    contador++;
                }
            }
            System.out.println("La cantidad de nros mayores a '5' es..."+ contador);



    }
}