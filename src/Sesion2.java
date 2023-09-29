import java.util.Scanner;
public class Sesion2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Escribe un número entero numero mayor que cinco y menor que 30");
        numero = teclado.nextInt();
        while((numero < 5) || (numero > 30)){
            System.out.println("Escribe un número entero numero mayor que cinco y menor que 30");
            numero = teclado.nextInt();
        }
            for (int i = 1; i <= numero; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();

        }

    }
}
