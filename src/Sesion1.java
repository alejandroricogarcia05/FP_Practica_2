// Realizado por Alejandro Rico García bu0219 IWSIM12

import java.util.Scanner;
public class Sesion1{
    public static void main(String [] args){
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
        System.out.print("Introduzca un numero entre 0 y 100 ");
        int numero = teclado.nextInt();
        if (numero < 100 && numero > 0) {
            System.out.println("Se ha introducido el "+numero);
        }
        else {
            System.out.println("Numero incorrecto");
        }
        System.out.print("Introduce dos numeros enteros ");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        if (numero1 <= numero2 && numero2%numero1==0){
            System.out.printf("El numero "+numero1+" es menor o igual que "+numero2+" y "+numero2+" es multiplo de "+numero1);
        }
        else {
            System.out.printf("El numero "+numero1+" no es menor o igual que "+numero2+" o "+numero2+" no es multiplo de "+numero1);
        }
    }
}