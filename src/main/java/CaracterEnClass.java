import java.util.Scanner;
public class CaracterEnClass {

    public static void main(String[] args) {

        Scanner lectTeclado = new Scanner(System.in);
        String cadena = lectTeclado.nextLine();

        try{
            caracterEn(cadena, 7);
        } catch (Exception e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occured: " + e);
        }

    }

    public static void caracterEn(String cadena, int n) throws Exception{

        if (n >= 0 && n < cadena.length()){
            System.out.println(cadena.charAt(n));
        }else{
            throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no existe");
        }

    }

}
