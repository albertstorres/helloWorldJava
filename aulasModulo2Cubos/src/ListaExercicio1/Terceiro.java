// Desenvolva um programa que leia um número inteiro. Na sequência, mostre na tela verdadeiro
// ou falso se o número digitado quando a ele somado mais 7, se torna um valor par.

package ListaExercicio1;
import java.util.Scanner;

public class Terceiro {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);
        int numero;

        System.out.printf("Digite um número inteiro: ");
        numero = ler.nextInt();

        int modulo = numero % 2;
        String resposta = (modulo != 0) ? "Verdadeiro" : "Falso"; //Condição ternária.

        System.out.printf(resposta);
    }
}
