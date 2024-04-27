import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Ingrese una cadena por favor...");
        String a= scan.next();

        System.out.println("Ingrese otra cadena por favor...");
        String b= scan.next();

        int x= a.length();
        int y= b.length();
        int suma= x+y;

        System.out.println("La suma de ambas cadenas es de..." + suma);

        if(a.compareTo(b)<0)
        {
            System.out.println("SI");

        }
        else
        {
            System.out.println("NO");
        }



        String cadena1 = a.substring(0, 1).toUpperCase() + a.substring(1);
        String cadena2 = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(cadena1+"..."+cadena2);

    }
}