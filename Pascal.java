package pascal;

/**
 *
 * @author cdiaz
 */
public class Pascal {

    public static void main(String[] args) {
        // TODO code application logic here
        int numRows=5;
        PascalInit pascal =new PascalInit(numRows);
        pascal.Generar();
        pascal.Mostrar();
        
    }

   

}
