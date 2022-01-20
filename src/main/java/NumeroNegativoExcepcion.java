public class NumeroNegativoExcepcion extends Exception{

    public NumeroNegativoExcepcion(){
        super();
    }

    public NumeroNegativoExcepcion(String mensaje){
        super(mensaje);
    }

    public NumeroNegativoExcepcion(String mensaje, Throwable causa){
        super(mensaje, causa);
    }

}
