/*10.Ingresar un número y validar que sea positivo. Si no lo es continuar
solicitándolo al usuario hasta que ingrese un número correcto.
*/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        double nroPositivo;

/*
            do {
                System.out.println("Ingrese un nro positivo por favor...");
                nroPositivo = scan.nextDouble();
            } while (nroPositivo < 1);

            System.out.println("El nro ingresado es el..." + nroPositivo);
*/ // Opcion 1;

        System.out.println("Ingrese un nro positivo por favor...");
        nroPositivo = scan.nextDouble();

        while(nroPositivo<1)
        {
            System.out.println("Ingrese un nro positivo por favor...");
            nroPositivo = scan.nextDouble();

        }

        System.out.println("El nro ingresado es el..." + nroPositivo);

        // Opcion 2;

    }
}