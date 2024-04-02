import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Ingrese un numero, letras o frase por favor...");
        String cadena= scan.nextLine();
        String revesCadena="";

        int largoCadena = cadena.length();

        for (int i = (largoCadena - 1); i >=0; --i) {
            revesCadena = revesCadena + cadena.charAt(i);
        }

        if (cadena.toLowerCase().equals(revesCadena.toLowerCase())) {
            System.out.println(cadena + " es una cadena Palindrome!!!");
        }
        else {
            System.out.println(cadena + " NO es una cadena Palindrome");
        }
    }
}


