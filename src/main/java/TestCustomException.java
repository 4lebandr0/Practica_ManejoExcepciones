import java.util.Scanner;
public class TestCustomException {

    static void validar(double n) throws NumeroNegativoExcepcion{
        if (n < 0){
            throw new NumeroNegativoExcepcion("No hay raiz cuadrada del numero.",
                    new Throwable("Numero = " + n));
        }else{
            System.out.println("Raiz cuadrada de " + n + " = " + Math.sqrt(n));
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero para obtener su raiz cuadrada.");
        double n = entrada.nextDouble();
        try{
            validar(n);
        } catch (NumeroNegativoExcepcion ex) {
            System.out.println("Caught the exception");
            System.out.println("Exception occured: " + ex);
        }

    }

}
