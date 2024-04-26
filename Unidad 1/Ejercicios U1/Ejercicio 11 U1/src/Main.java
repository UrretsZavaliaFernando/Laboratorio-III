import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escriba una frase por favor...");
        String frase = scan.next();

        System.out.println("Escriba un nro entero por favor...");
        int nro = scan.nextInt();

        if(frase.length()<nro)
        {
            System.out.println("Ingrese un numero menor a la cadena por favor...");
            nro = scan.nextInt();
        }

        String subfrase = getMasCortoMasLargo(frase,nro);

        System.out.println("Las subfrases son..." + subfrase);

    }


    public static String getMasCortoMasLargo(String cadena, int nro) {
        String masCorto = "";
        String masLargo = "";

        masCorto = cadena.substring(0, nro);
        masLargo = cadena.substring(0, nro);

        int i = 0;

        while (i + nro <= cadena.length()) {
            if (cadena.substring(i, i + nro).compareTo(masCorto) < 0) {
                masCorto = cadena.substring(i, i + nro);
            }

            if (cadena.substring(i, i + nro).compareTo(masLargo) > 0) {
                masLargo = cadena.substring(i, i + nro);
            }

            i++;
        }

        return masCorto + "\n y " + masLargo;

    }
}