import java.util.Scanner;
public class Sesion2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Escribe un número entero numero mayor que cinco y menor que 30");
            numero = teclado.nextInt();
            for (int i = 1; i <= numero; i++) {
                String asterisco = "";
                String asteriscos = asterisco+"*";
                System.out.println(asteriscos);
                asterisco += "*";
            }

            System.out.println();
        } while (numero > 5 && numero < 30);

    }
}
