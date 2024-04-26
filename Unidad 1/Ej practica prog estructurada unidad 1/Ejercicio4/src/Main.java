/*4. Ingresar nombre y altura de dos personas, informar el nombre de
la más alta.*/

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);

       /* System.out.println("Ingrese nombre primer persona...");
        String nombre1=scanner.next();
        System.out.println("Ingrese altura de "+ nombre1);
        double altura1=scanner.nextDouble();

        System.out.println("Ingrese nombre segunda persona...");
        String nombre2=scanner.next();
        System.out.println("Ingrese altura de "+ nombre2);
        double altura2=scanner.nextDouble();

        scanner.close();

        if(altura1>altura2)
        {
            System.out.println("La persona mas alta es..."+ nombre1);
        }
        else
        {
            System.out.println("La persona mas alta es..."+ nombre2);
        }*/
        boolean bandera=true;
        String nomAlto="";
        double masAlto=0;
        for(int i=0;i<2;i++)
        {

            System.out.println("Ingrese nombre persona "+ (i+1));
            String nombre=scanner.next();

            System.out.println("Ingrese altura de "+ nombre);
            double altura=scanner.nextDouble();

            if(bandera==false)
            {
                if(altura>masAlto)
                {
                    nomAlto=nombre;
                    masAlto=altura;
                }
            }
            else
            {
                nomAlto=nombre;
                masAlto=altura;
                bandera=false;
            }

        }

        System.out.println("La persona mas alta es... " + nomAlto + " con..." + masAlto + "mts");
    }
}