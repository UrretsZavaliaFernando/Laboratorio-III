/*
Dado un número entero n, imprima sus primeros 10 múltiplos.
Cada múltiplo n x i (donde 1 <= i <= 10) debe imprimirse en una nueva línea en la
forma:n x i = resultado.
*/

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Ingrese un nro entero por favor...");
        int nro= scan.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(nro + " x " + i + " = " + nro*i);
        }
    }
}