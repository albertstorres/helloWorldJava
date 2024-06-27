// Faça um algoritmo para ler o salário de um funcionário e aumentá-lo em 15%. Após aumento,
// desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.

package ListaExercicio1;
import java.util.Scanner;

public class Sexto {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);
        double salario_inicial, salario_aumento, salario_final;

        System.out.printf("Digite o salário inicial: ");
        salario_inicial = ler.nextInt();

        salario_aumento = salario_inicial * 1.15;
        salario_final = salario_aumento * 0.92;

        System.out.println("Salário inicial: R$ " + salario_inicial);
        System.out.println("Salário com aumento: R$ " + salario_aumento);
        System.out.println("Salário final (com desconto de 8%): R$ " + salario_final);
    }
}
