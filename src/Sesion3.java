// Realizado por Alejandro Rico García bu0219 IWSIM12

import java.util.Scanner;

public class Sesion3 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    int base = leerNumero(5, 30);
                    char caracter = leerCaracter();
                    //dibujarTriangulo(base, caracter);
                    Sesion4.dibujarTrianguloRecursivo(base,caracter);
                    break;
                case 2:
                    int lado = leerNumero(10, 35);
                    char signo = leerCaracter();
                    dibujarCuadrado(lado, signo);
                    break;
                case 3:
                    int numero1 = leerNumero(0, 20);
                    int numero2 = leerNumero(0, 20);
                    //multiplicarIterativo(numero1, numero2);
                    Sesion4.multiplicarRecursivo(numero1,numero2);
                    break;
                case 4:
                    int numero = leerNumero(0, 10);
                    //tablaDeMultiplicar(numero);
                    Sesion4. tablaDeMultiplicarRecursiva(numero);
                case 5:
                    System.out.println("Programa finalizado");
            }
        } while (opcion != 5);
    }

    public static int menu() {
        System.out.println("\n1. Dibuja un triangulo rectangulo.");
        System.out.println("2. Dibuja un cuadrado.");
        System.out.println("3. Multiplicar dos numeros.");
        System.out.println("4. Escribir una tabla de multiplicar.");
        System.out.println("5. Finalizar ejecucion.");
        return leerNumero(1, 5);
    }

    public static int leerNumero(int minimo, int maximo) {
        int numero;
        do {
            System.out.print("Escribe un numero comprendido entre " + minimo + " y " + maximo + ": ");
            numero = teclado.nextInt();
            if ((numero < minimo) || (numero > maximo)) {
                System.out.println("Numero incorrecto");
            }
        } while ((numero < minimo) || (numero > maximo));
        System.out.println("El numero introducido es " + numero);
        return numero;
    }

    public static char leerCaracter() {
        System.out.print("Introduce un caracter no alfabetico ni numerico: ");
        char caracter = teclado.next().charAt(0);
        while (Character.isAlphabetic(caracter) || Character.isDigit(caracter)) {
            System.out.println("Numero incorrecto, introduce un caracter que no sea ni numero ni letra");
            caracter = teclado.next().charAt(0);
        }
        return caracter;
    }

    public static void dibujarTriangulo(int base, char caracter) {
        for (int i = 1; i <= base; i++)
        //Este for sirve para escribir saltar las lineas que indica el numero
        {
            for (int j = 1; j <= i; j++) {
                System.out.print(caracter);
                //Va sumando un asteriscos por cada fila que va saltando
            }
            System.out.println();
        }
    }

    public static void dibujarCuadrado(int lado, char caracter) {
        for (int i = 1; i <= lado; i++) {
            //Saltar de fila
            for (int j = 1; j <= lado; j++) {
                System.out.print(caracter);
                //Añade asteriscos
            }
            System.out.println();
        }
    }

    public static int multiplicarIterativo(int numero1, int numero2) {
        int resultado = 0;
        for (int i = 0; i < numero1; i++) {
            resultado += numero2;
            //La multiplicacion es sumar n veces un numero, por lo que repetimos i veces (numero1) la suma de numero2
        }
        System.out.println("La multipliacion de " + numero1 + " * " + numero2 + " = " + resultado);
        return resultado;
    }
    public static void tablaDeMultiplicar(int numero) {
        for (int i = 0; i <= 10; i++) {
            int multiplicacion = numero * i;
            System.out.printf("%3d X %3d = %3d\n", numero, i, multiplicacion);
        }
    }
}

