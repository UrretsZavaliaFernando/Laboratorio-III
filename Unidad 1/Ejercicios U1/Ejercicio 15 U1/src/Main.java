public class App
{
    protected String protectedVariable  = "Esta es una variable protegida";
    private static String privateStaticVariable = "Esta es una variable privada estatica";
    public static String publicStaticVariable = "Esta es una variable estatica publica";
    protected static String protectedStaticVariable = "Esta es una variable estatica protegida";
    private static final String privateStaticFinalVariable = "This is a private static final v";
    public static final String publicStaticFinalVariable = "This is a public static final variable";
    protected static final String protectedStaticFinalVariable = "This is a protected static final variable";

    public static void main( String[] args )
    {
        System.out.println("Playing with variables!");
    }

}
