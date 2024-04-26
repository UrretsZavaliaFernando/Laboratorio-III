import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println();
        System.out.println("Bienvenido...");
        System.out.println();
        System.out.println("Ingrese el 1er booleano...");
        boolean bool1= scanner.nextBoolean();
        System.out.println("Ingrese el 2do booleano...");
        boolean bool2= scanner.nextBoolean();

        scanner.close();

        System.out.println();
        System.out.println("Resultado...");
        System.out.println();
        System.out.println("El primer booleano es..."+ bool1);
        System.out.println("El segundo booleano es..."+ bool2);
        System.out.println("El opuesto del primer booleanos es..."+ !bool1);
        System.out.println("El opuesto del segundo booleanos es..."+ !bool2);
        if(bool1&&bool2)
        {
            System.out.println("La conjuncion de los dos booleanos es...TRUE");
        }
        else
        {
            System.out.println("La conjuncion de los dos booleanos es...FALSE");
        }

        if(bool1&&bool2)
        {
            System.out.println("La conjuncion de los dos booleanos es...FALSE");
        }
        else
        {
            System.out.println("La conjuncion de los dos booleanos es...TRUE");
        }

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}