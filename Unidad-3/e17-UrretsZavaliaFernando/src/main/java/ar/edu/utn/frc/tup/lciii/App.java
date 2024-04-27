package ar.edu.utn.frc.tup.lciii;
import java.util.Scanner;
import java.util.HashMap;
/**
 * Hello Map!
 *
 */
public class App 
{
    /**
     * This is the main program
     * 
     */
    public static void main( String[] args ) {
        Scanner scan= new Scanner(System.in);
        HashMap<String,String>map=new HashMap<>();
        int cantidad= scan.nextInt();
        scan.nextLine();
        boolean validar = Validar(cantidad);
        if(validar) {
            for (int i = 0; i < cantidad; i++) {

                String nombre = scan.nextLine();

                String telefono = scan.nextLine();

                //if (telefono.length() == 8 && telefono.matches("[1-9][0-9]{7}")) {

                map.put(nombre, telefono);
               //}
            }
        }
        while (scan.hasNextLine()) {

            String nombre = scan.nextLine();
            if (map.containsKey(nombre)) {
                System.out.println(nombre + "=" + map.get(nombre));
            } else {
                System.out.println("Not found");
            }
        }
    }
    private static boolean Validar(int x){
        return x >= 1 && x <= 100000;
    }
}
