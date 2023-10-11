import java.util.Scanner;
import java.util.Scanner;
public class Sesion4 {

    private static void dibujarLineaRecursivo (int numero,char caracter){
        if (numero>0) {
            System.out.print(caracter+ "");
            dibujarLineaRecursivo(numero - 1, caracter);
        }
    }
    public static void dibujarTrianguloRecursivo (int base, char caracter){
            if(base>0){
                dibujarTrianguloRecursivo(base-1,caracter);
                System.out.print("\n");
                dibujarLineaRecursivo(base,caracter);
            }
            else
                System.out.println();
    }

    public static int multiplicarRecursivo (int numero1, int numero2){
        int resultado = 0;
        if(numero1>0){
            resultado += numero2 + multiplicarRecursivo(numero1-1,numero2);
        }
        return resultado;
    }
    public static void tablaDeMultiplicarRecursiva(int numero) {
        for (int i = 0; i <= 10; i++){
            int multiplicacion = multiplicarRecursivo(numero,i);
            System.out.printf("%3d X %3d = %3d\n", numero, i, multiplicacion);
        }
    }
}
