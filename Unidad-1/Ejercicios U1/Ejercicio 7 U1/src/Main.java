/*
Dado un número entero n, realice las siguientes acciones condicionales:

Si n es impar, imprima Raro
Si n es par y está en el rango inclusivo de 2 a 5, imprima No raro
Si n es par y está en el rango inclusivo de 6 a 20, imprima Raro
Si n es par y mayor que 20, imprima No raro
Complete el código auxiliar proporcionado en su editor para imprimir si n es extraño o no.
 */

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Ingrese un numero por favor...");
        int nro= scan.nextInt();


        if(nro%2==0)
        {
            if(nro>1&&nro<6)
            {
                System.out.println("No Raro");
            }
            if(nro>5&&nro<21)
            {
                System.out.println("Raro");
            }
            if(nro>20)
            {
                System.out.println("No Raro");
            }
        }
        else
        {
            System.out.println("Raro");
        }


    }
    

}