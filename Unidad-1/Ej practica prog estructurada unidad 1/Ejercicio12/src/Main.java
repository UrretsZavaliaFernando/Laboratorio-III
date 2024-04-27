/* 12.Desarrollar un programa que permita ingresar la antigüedad los autos
de una concesionaria de usados. Finalizar la carga cuando se ingrese 0. Por cada
auto ingresado mostrar por pantalla un mensaje adecuado con el siguiente
criterio: si el auto tiene entre 1 y 5 años mostrar el texto “NUEVO”, si tiene
entre 6 y 10 mostrar “POCO USO”, si tiene entre 11 y 20 “MUCHO USO” y si
tiene más de 20 “MUY ANTIGUO”.
Luego de finalizada la carga calcular y mostrar los siguientes resultados:
        • Cantidad total de autos.
        • Cantidad de autos con poco uso.
        • Promedio de antigüedad de los autos que no sean muy antiguos.
*/

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int contAutos=0,contPocoUso=0,contNuevo=0,contMuchoUso=0,antiguedad=0,modelo;
         int sumaNuevo=0,sumaPocoUso=0,sumaMuchoUso=0;
         double promNuevo=0,promPocoUso=0,promMuchoUso=0;


        System.out.println("Ingrese antiguedad del vehiculo por favor...'0' para finalizar");
        modelo=scan.nextInt();

        while(modelo!=0)
        {

            contAutos++;
            int anio=2024;
            antiguedad= anio-modelo;

            if(antiguedad<=5)
            {
                System.out.println("Nuevo");
                contNuevo++;
                sumaNuevo+= modelo;
                promNuevo= calcularPromedio(sumaNuevo,contNuevo);

            }
            if(antiguedad>=6 && antiguedad<=10)
            {
                System.out.println("Poco Uso");
                contPocoUso++;
                sumaPocoUso+= modelo;
                promPocoUso= calcularPromedio(sumaPocoUso,contPocoUso);
            }
            if(antiguedad>=11 && antiguedad<=20)
            {
                System.out.println("Mucho Uso");
                contMuchoUso++;
                sumaMuchoUso+= modelo;
                promMuchoUso= calcularPromedio(sumaMuchoUso,contMuchoUso);
            }
            if(antiguedad>20)
            {
                System.out.println("Muy Antiguo");
            }

            System.out.println("Ingrese antiguedad del vehiculo por favor...'0' para finalizar");
            modelo=scan.nextInt();

        }

        System.out.println("La cantidad total de autos es..." + contAutos);
        System.out.println("La cantidad de autos con poco uso es..." + contPocoUso);
        System.out.println("El promedio de años de autos nuevos es..." + promNuevo);
        System.out.println("El promedio de años de autos de poco uso es..." + promPocoUso);
        System.out.println("El promedio de años de autos de mucho uso es..." + promMuchoUso);
    }

    private static final double calcularPromedio(int suma,int cantidad)
    {
    double promedio=suma/cantidad;
    return promedio;
    }

}