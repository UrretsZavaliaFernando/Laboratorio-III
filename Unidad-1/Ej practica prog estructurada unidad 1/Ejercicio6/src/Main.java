/*6. Ingresar un año e indicar si ese año es bisiesto. Un año es bisiesto si es
múltiplo de 4 y no es múltiplo de 100 o si es múltiplo de 400.*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese el año por favor...");
       double anio=scan.nextDouble();



       if(((anio%4==0)&&(anio%400==0)) || (anio%100!=0))
       {
           System.out.println("El año ingresado 'Si' es bisiesto");
       }
       else
       {
           System.out.println("El año ingresado 'NO' es bisiesto");
       }
    }
}