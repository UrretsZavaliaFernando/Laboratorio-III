/*2. Hacer un programa que ingrese el precio de un artículo a la venta y calcule el
precio con IVA.*/

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese el precio del articulo por favor...");
        double precio= scan.nextDouble();

        double porcentaje=(precio*21)/100;
        System.out.println((precio+porcentaje));
        scan.close();
    }
}