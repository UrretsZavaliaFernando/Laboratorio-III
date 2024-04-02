

import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Ingrese una frase por favor...");
        String frase=scan.nextLine();


            String fraseIntermedia= frase.substring(2,6);
            System.out.println("Las letras buscadas son..." + fraseIntermedia);


    }
}