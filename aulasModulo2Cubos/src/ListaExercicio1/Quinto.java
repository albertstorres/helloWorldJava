// Uma fábrica de camisetas produz os tamanhos: pequeno, médio e grande.
// Cada uma está sendo vendida por 10, 12 e 15 reais, respectivamente. Construa um algoritmo
// em que o usuário forneça a quantidade de camisetas pequenas, médias e grandes referentes a uma venda,
// e a máquina informe quanto será o valor arrecadado.

package ListaExercicio1;
import java.util.Scanner;

public class Quinto {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);
        int quantidade_p, quantidade_m, quantidade_g;
        double total_p, total_m, total_g, total_compra;

        System.out.printf("Digite a quantidade de camisas P vendidas: ");
        quantidade_p = ler.nextInt();
        System.out.printf("Digite a quantidade de camisas M vendidas: ");
        quantidade_m = ler.nextInt();
        System.out.printf("Digite a quantidade de camisas G vendidas: ");
        quantidade_g = ler.nextInt();

        total_p = quantidade_p * 10;
        total_m = quantidade_m * 15;
        total_g = quantidade_g * 20;
        total_compra = total_g + total_m + total_p;

        System.out.printf("Total da compra: R$ " + total_compra);
    }
}
