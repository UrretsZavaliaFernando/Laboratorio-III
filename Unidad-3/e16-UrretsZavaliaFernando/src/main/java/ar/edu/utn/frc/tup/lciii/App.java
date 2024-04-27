package ar.edu.utn.frc.tup.lciii;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;

/**
 * Hello List!
 *
 */
public class App {

    /**
     * This is the main program
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamArreglo = scan.nextInt();


        List<Integer> arreglo = new ArrayList<Integer>();


        boolean validar = Validar(tamArreglo);
        if (validar) {


            for (int i = 0; i < tamArreglo; i++) {

                arreglo.add(scan.nextInt());

            }


            for (int i : arreglo) {

                System.out.print(i + " ");
            }

            int nroConsulta = scan.nextInt();



            for(int i=0;i<nroConsulta;i++){
                String funcion = scan.next();
                if (funcion.equals("Insert")) {
                    int posicion = scan.nextInt();
                    int valor = scan.nextInt();
                    arreglo.add(posicion, valor);
                }
                if(funcion.equals("Delete")){
                    int eliminar = scan.nextInt();
                    arreglo.remove(eliminar);
                }
            }


            System.out.println(arreglo);

        }
    }

    private static boolean Validar(int x) {
        return x >= 1 && x <= 100000;
    }

    
}




