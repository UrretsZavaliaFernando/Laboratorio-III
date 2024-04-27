/*. Hacer un programa que ingrese los datos de una factura en la cual haya tres
artículos vendidos. De cada artículo ingresar el precio unitario y la cantidad.
Finalmente imprimir el total de la factura*/

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        double acu=0;
        Scanner scan=new Scanner(System.in);

        for(int i=0;i<3;i++)
        {
            System.out.println("Ingrese nro articulo nro..."+ (i+1));

           int articulo= scan.nextInt();

            System.out.println("Ingrese precio articulo nro..."+ (i+1));
            double precio= scan.nextInt();

            System.out.println("Ingrese cantidad articulo nro..."+ (i+1));
            int cantidad= scan.nextInt();
            acu+=precio*cantidad;
        }

        scan.close();

        System.out.println("El total de la factura en pesos son...$"+acu);

    }
}