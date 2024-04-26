import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println();
        System.out.println("Bienvenido...");
        System.out.println();
        System.out.println("Ingrese la cadena...");
        String s= scanner.nextLine();
        System.out.println("Ingrese un numero decimal...");
        double doble= scanner.nextDouble();
        System.out.println("Ingrese un numero entero...");
        int entero= scanner.nextInt();
        scanner.close();

        System.out.println();
        System.out.println("Resultado...");
        System.out.println();
        System.out.println("La cadena es..."+ s);
        System.out.println("El numero doble es..."+ doble);
        System.out.println("El numero entero es..."+ entero);



    }
}