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
        System.out.println("Ingrese el primer byte...");
        byte byte1= scanner.nextByte();
        System.out.println("Ingrese el segundo byte...");
        byte byte2= scanner.nextByte();
        System.out.println("Ingrese el tercer byte...");
        byte byte3= scanner.nextByte();

        scanner.close();
        System.out.println();
        System.out.println("Resultado...");
        System.out.println();
        System.out.println("El 1er byte es..."+ byte1);
        System.out.println("El 2do byte es..."+ byte2);
        System.out.println("El 3er byte es..."+ byte3);


    }
}