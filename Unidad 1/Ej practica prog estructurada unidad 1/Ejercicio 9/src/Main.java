/*9. Ingresar 10 números por teclado, informar su suma y promedio.*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        double acu=0;

       for(int i=0;i<10;i++)
       {
          System.out.println("Por favor, ingrese el nro "+ (i+1));
          double nro=scan.nextDouble();
          acu+=nro;
       }
       scan.close();
        System.out.println("La suma total de los numeros ingresados es... "+ acu);
        System.out.println("El promedio es..."+ acu/10);
    }
}