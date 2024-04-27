/*7. Una empresa de alquiler de autos cobra $300 por día si no se superan los 200
km de uso diario. Por cada km extra hasta los 1000 km cobra $5 adicionales,
y a partir de los 1000 cobra $10 adicionales. Hacer un programa que solicite
la cantidad de km realizados por un cliente e indique el importe que se le debe
cobrar*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese los kms realizados por favor...");
        long kms = scan.nextLong();

        System.out.println("Ud. realizo..." + kms + " kms");
        scan.close();

        if (kms < 200)
        {
            System.out.println("Ud. debe pagar $300,00");
            return;
        }

        if((kms>200)&&(kms<1000))
        {
            System.out.println("Ud. debe pagar...$"+ calcular1(kms));
            return;
        }

        if(kms>1000)
        {
            System.out.println("Ud. debe pagar...$"+ calcular2(kms));

        }

    }

    private  static  double calcular1(long kms)
    {
        long kmExtra=kms-200;
        long acu= 300+(kmExtra*5);
        return acu;
    }

    private  static  double calcular2(long kms)
    {
        long kmExtra=kms-200;
        long acu= 300+(kmExtra*10);
        return acu;
    }
}