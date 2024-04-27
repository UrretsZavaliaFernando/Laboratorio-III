//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println();
        System.out.println("Bienvenido");
        System.out.println();
        System.out.println(("Ingrese el primer entero..."));
        int miEntero1= scanner.nextInt();

        System.out.println(("Ingrese el segundo entero..."));
        int miEntero2= scanner.nextInt();

        System.out.println(("Ingrese el tercer entero..."));
        int miEntero3= scanner.nextInt();

        scanner.close();
        System.out.println();
        System.out.println("Resultado...");
        System.out.println();
        System.out.println(("Mi 1er entero es..."+ miEntero1));
        System.out.println(("Mi 2do entero es..."+ miEntero2));
        System.out.println(("Mi 3er entero es..."+ miEntero3));



    }
}