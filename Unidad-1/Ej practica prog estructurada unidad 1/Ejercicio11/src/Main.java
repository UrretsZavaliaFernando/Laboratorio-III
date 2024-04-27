/* 11.Ingresar el tiempo en segundos que realizó el ganador de la clasificación de
una carrera de F1. Luego ingresar los tiempos de los otros 9 corredores e
informar cuántos disputarán la carrera. Para que un corredor pueda participar
su tiempo de clasificación no puede superar en 15 % al del ganador. */


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
      int contador=1;

        Scanner scan=new Scanner(System.in);

        System.out.println("Ingrese en segundos el tiempo del ganador!!!");
        double tiempoGanador= scan.nextDouble();

            for(int i=1;i<10;i++)
            {
             System.out.println("Ingrese en segundos el tiempo de clasificacion de corredor nro..." + (i+1));
             double tiempo=scan.nextDouble();
             boolean x= porcentajeTiempo(tiempoGanador,tiempo);
             if(x)
             {
                 contador++;
             }

            }
            scan.close();

        System.out.println("El total de corredores que participan de la carrera son..." + contador + "!!!");

    }

    private static boolean  porcentajeTiempo(double tiempoGanador,double tiempo)
    {
        boolean z;
        double porcG=(tiempoGanador*15)/100;

        double x= tiempoGanador+porcG;

        if(tiempo>x)
        {
            z=false;
        }
        else
        {
            z=true;
        }

    return z;

    }

}