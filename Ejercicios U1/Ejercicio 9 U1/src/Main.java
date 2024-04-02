import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int acumulador=0;

        System.out.println("Ingrese 1er entero por favor...");
        int a= scan.nextInt();

        System.out.println("Ingrese 2do entero por favor...");
        int b= scan.nextInt();

        System.out.println("Ingrese 3er entero por favor...");
        int n= scan.nextInt();

        for(int i=0;i<n;i++)
        {
            int potencia= (int)Math.pow(2,i);


            int resultado= (potencia*b);
            System.out.print("(S"+(i+1) +  "="+ (a+resultado+acumulador) +")...");
           acumulador+=resultado;
        }

    }
}







