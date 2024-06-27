// Desenvolva um programa que seja capaz de calcular a média ponderada de um aluno. Inicialmente
// solicite:
        // o nome e as três notas do aluno, logo após, calcule e exiba na tela a média. Na média ponderada
        // considere os seguintes pesos nas notas: 2.3 e 5. Essa é a fórmula para calcular a média:
        // mediafinal = (((n1*2)+(n2*3)+(n3*5))/10)

package ListaExercicio1;
import java.util.Scanner;

public class Segundo {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);
        String nome;
        double n1, n2, n3, media_final;

        System.out.printf("Digite o nome do aluno: ");
        nome = ler.nextLine();
        System.out.printf("Digite a primeira nota do aluno " + nome + ": ");
        n1 = ler.nextDouble();
        System.out.printf("Digite a segunda nota do aluno " + nome + ": ");
        n2 = ler.nextDouble();
        System.out.printf("Digite a terceira nota do aluno " + nome + ": ");
        n3 = ler.nextDouble();

        media_final = (((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10);

        System.out.printf("Aluno: " + nome + "\nMédia final: " + media_final);
    }
}
