package Exercicios;
import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        int numero;

        System.out.printf("Digite um inteiro positivo: ");
        numero = ler.nextInt();

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
