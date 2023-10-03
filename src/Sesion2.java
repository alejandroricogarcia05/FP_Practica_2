// Realizado por Alejandro Rico García bu0219 IWSIM12
import java.util.Scanner;
public class Sesion2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1. Dibuja un triangulo rectangulo.");
        System.out.println("2. Dibuja un cuadrado.");
        System.out.println("3. Multiplicar dos numeros.");
        System.out.println("4. Escribir una tabla de multiplicar.");
        System.out.println("5. Finalizar ejecucion.");
        System.out.print("Introduzca la opcion deseada ");
        int opcion = teclado.nextInt();
        if (opcion < 6 && opcion > 0) {
            System.out.println("Ha elegido la opción "+opcion);
        }
        else {
            System.out.println("Opcion incorrecta");
        }

                System.out.print("Escribe un número entero numero mayor que cinco y menor que 30  ");

                int numero = teclado.nextInt();
                //Esto sirve para leerlo la primera vez, como haria un do while,
                while (numero <= 5 || numero >= 30) {
                    System.out.println("Numero incorrecto");
                    System.out.print("Escribe un número entero numero mayor que cinco y menor que 30 ");
                    numero = teclado.nextInt();
                    //Verfica si el numero es correcto y si sigue siendon incorrecto vuelve a ejecutarlo
                }

                //TRIANGULO
                for (int i = 1; i <= numero; i++)
                //Este for sirve para escribir saltar las lineas que indica el numero
                {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                        //Va sumando un asteriscos por cada fila que va saltando
                    }
                    System.out.println();
                }

                //CUADRADO
                System.out.println("Introduce un numero mayor o igual que 10 y menor o igual que 35");
                numero = teclado.nextInt();
                //Esto sirve para leerlo la primera vez, como haria un do while
                while ((numero < 10) || (numero > 35)) {
                    System.out.print("Introduce un numero mayor o igual que 10 y menor o igual que 35");
                    numero = teclado.nextInt();
                    //Verfica si el numero es correcto y si sigue siendon incorrecto vuelve a ejecutarlo
                }
                for (int i = 1; i <= numero; i++) {
                    //Saltar de fila
                    for (int j = 1; j <= numero; j++) {
                        System.out.print("*  ");
                        //Añade asteriscos
                    }
                    System.out.println();
                }



                //Multiplicacion
                System.out.println("Escribe dos numeros comprendidos entre 0 y 20 ");
                int numero1 = teclado.nextInt();
                int numero2 = teclado.nextInt();
                //Introduzco los dos numeros
                while (((numero1 < 0) || (numero1 > 20)) || ((numero2 < 0) || (numero2 > 20)))
                //Compruebo que ninguno de los numeros son incorrectos
                {
                    if (((numero1 < 0) || (numero1 > 20))) {
                        System.out.print("Introduce un numero comprendido entre 0 y 20");
                        numero1 = teclado.nextInt();
                        //Numero1 incorrecto
                    } else if ((numero2 < 0) || (numero2 > 20)) {
                        System.out.println("Introduce un numero comprendido entre 0 y 20");
                        numero2 = teclado.nextInt();
                        //Numero2 incorrecto
                    }
                }
                int resultado = 0;
                for (int i = 0; i < numero1; i++) {
                    resultado += numero2;
                    //La multiplicacion es sumar n veces un numero, por lo que repetimos i veces (numero1) la suma de numero2
                }
                System.out.println("El resultado de la multiplicacion de " + numero1 + " * " + numero2 + " es " + resultado);


                System.out.print("Escribe un número entero del 1 al 10");
                numero = teclado.nextInt();
                //Esto sirve para leerlo la primera vez, como haria un do while,
                while (numero <= 1 || numero >= 10) {
                    System.out.println("Numero incorrecto");
                    System.out.print("Escribe un número entero del 1 al 10");
                    numero = teclado.nextInt();
                    //Verfica si el numero es correcto y si sigue siendon incorrecto vuelve a ejecutarlo
                }

                for (int i = 0; i <= 10; i++) {
                    int multiplicacion = numero * i;
                    System.out.printf("%3d X %3d = %3d\n", numero, i, multiplicacion);
                }

        }
    }


