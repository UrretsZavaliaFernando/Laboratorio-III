/*5. Ingresar la cantidad de horas trabajadas por un empleado y el sueldo que
cobra por hora. Indique el total a cobrar teniendo en cuenta que si trabajó más
de 180 horas las excedentes las cobra con un 50 % de aumento.
*/

import java.util.Scanner;

public class Main {

    private static double sueldoMinimo = 0;
    private static double sueldoExtra = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese cantidad de horas trabajadas...");
        int cantidadHoras = scan.nextInt();

        System.out.println("Ingrese cantidad $$$ por hora...");
        double sueldoHora = scan.nextDouble();

        if(cantidadHoras<180)
        {
            System.out.println("El sueldo total es de..." + calculoMinimo(cantidadHoras,sueldoHora));
        }
        else
        {

            double sueldo=calculoMinimo(180,sueldoHora);
            int horasExtras=cantidadHoras-180;
            double sueldoExtra= calculoExtra(horasExtras,sueldoHora);
            double acumulador=sueldo+sueldoExtra;
            System.out.println("El sueldo total es de..." + acumulador);

        }


    }

    private static final double calculoMinimo(int horas, double sueldo)
    {
        return sueldoMinimo = horas * sueldo;
    }
    private static final double calculoExtra(int horas, double sueldo)
    {
        return sueldoExtra = horas * (sueldo*1.5);
    }

}