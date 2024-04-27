import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);
        System.out.println();
        System.out.println("Bienvenido...");
        System.out.println();
        System.out.println("Ingrese la 1er cadena...");
        String s1=scanner.nextLine();
        System.out.println("Ingrese la 2da cadena...");
        String s2=scanner.nextLine();
        scanner.close();
        System.out.println();
        System.out.println("Resultado...");
        System.out.println();
        System.out.println("La primer cadena es..."+ s1);
        System.out.println(("La segunda cadena es..."+ s2));
        if(s1==s2)
        {
            System.out.println("Las cadenas son..."+ true);
        }
        else
        {
            System.out.println("Las cadenas son..."+ false);
        }

        if(s1.equals(s2))
        {
            System.out.println("Las cadenas son..."+ true);
        }
        else
        {
            System.out.println("Las cadenas son..."+ false);
        }

    }
}