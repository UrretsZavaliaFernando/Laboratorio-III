

import java.util.*;
public class Main
{

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Ingrese la 1er cadena por favor...");
        String cadena1=scan.nextLine();

        System.out.println("Ingrese la 2da cadena por favor...");
        String cadena2 = scan.nextLine();


        if (esAnagrama(cadena1,cadena2))
        {
            System.out.print("Las dos cadenas son...anagramas");
        }
        else
        {
            System.out.print("Las dos cadenas NO son...anagramas");
        }

    }

    public static boolean esAnagrama(String cadena1, String cadena2)
    {

        if (cadena1.length() != cadena2.length())
        {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < cadena1.length(); i++)
        {

            if (map.containsKey(cadena1.charAt(i))) {

                map.put(cadena1.charAt(i),
                        map.get(cadena1.charAt(i)) + 1);
            }
            else
            {

                map.put(cadena1.charAt(i), 1);
            }
        }



        for (int i = 0; i < cadena2.length(); i++)
        {

            if (map.containsKey(cadena2.charAt(i)))
            {

                map.put(cadena2.charAt(i),
                        map.get(cadena2.charAt(i)) - 1);
            }
            else
            {
                return false;
            }
        }

        Set<Character> keys = map.keySet();

        for (Character key : keys)
        {
            if (map.get(key) != 0)
            {
                return false;
            }
        }

        return true;
    }

}