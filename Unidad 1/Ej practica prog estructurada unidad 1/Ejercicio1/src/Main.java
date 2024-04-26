/*1. Declarar dos variables enteras y cargar sus valores por teclado. Informar su
suma, diferencia, producto y cociente.*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese 1er entero...");
       int a= scanner.nextInt();
        System.out.println("Ingrese 2do entero...");
       int b= scanner.nextInt();
       scanner.close();

        System.out.println("La suma de los 2 es..."+ (a+b));
        System.out.println("La diferencia de los 2 es..."+ (a-b));
        System.out.println("El multiplo de los 2 es..."+ (a*b));
        System.out.println("La division de los 2 es..."+ (a/b));


    }
}