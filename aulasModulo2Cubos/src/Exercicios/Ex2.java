package Exercicios;
import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        int inicio, fim, soma = 0;

        System.out.printf("Digite o intervalo inicial: ");
        inicio = ler.nextInt();
        System.out.printf("Digite o intervalo final: ");
        fim = ler.nextInt();

        for (int i = inicio; i <= fim; i++) {
            int modulo = i % 2;
            if (modulo == 0) {
                soma += i;
            }
        }

        System.out.printf("Soma dos pares no intervalo " + inicio + " - " + fim + ": " + soma);
    }
}
