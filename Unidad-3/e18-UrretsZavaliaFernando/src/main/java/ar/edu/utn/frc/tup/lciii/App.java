package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;
import java.util.Stack;

/**
 * Hello Stack!
 *
 */
public class App 
{

    /**
     * This is the main program
     * 
     */
    public static void main( String[] args ) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {

            // AGREGAR LO SIGUIENTE!!!! 1ERO VERIFICAR SI LA CADENA ES PAR O IMPAR...ESO YA LO SIMPLIFICA, SI ES IMPAR YA NO ES BALANCEADO!!!


            String caracteres= scanner.nextLine();
            boolean resultado= Balanceado(caracteres);

            if(resultado){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }




    }

    public static boolean Balanceado(String caracteres) {
        Stack<Character> pila = new Stack<>();


        for (char caract : caracteres.toCharArray()) {

            if (caract == '(' || caract == '[' || caract == '{') {
                pila.push(caract);
            }

            else if (caract == ')' || caract == ']' || caract == '}') {

                if (pila.isEmpty()) {
                    return false;
                }

                char apertura = pila.pop();
                if ((caract == ')' && apertura != '(') || (caract == ']' && apertura != '[') || (caract == '}' && apertura != '{')) {
                    return false;
                }
            }
        }


        return pila.isEmpty();
    }
}
