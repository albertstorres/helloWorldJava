// Uma revendedora de carros paga a seus funcionários vendedores um salário fixo por mês, mais uma
// comissão também fixa para cada carro vendido de mais 5% do valor das vendas por ele efetuadas.
// Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas,
// o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário fixo e o valor
// que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.

package ListaExercicio1;
import java.util.Scanner;

public class Quarto {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);
        double salario_fixo, comissao, total_vendas, valor_carro_vendido;
        int carros_vendidos;

        System.out.printf("Digite o número de carros vendidos: ");
        carros_vendidos = ler.nextInt();
        System.out.printf("Digite o valor total de vendas: ");
        total_vendas = ler.nextDouble();
        System.out.printf("Digite o salário fixo: ");
        salario_fixo = ler.nextDouble();
        System.out.printf("Digite o valor recebido por carro vendido: ");
        valor_carro_vendido = ler.nextDouble();

        comissao = total_vendas * 0.05;
        double adicional_carros_vendidos = valor_carro_vendido * carros_vendidos;
        double salario_final = salario_fixo + comissao + adicional_carros_vendidos;

        System.out.println("Salário fixo: R$ " + salario_fixo);
        System.out.println("Valor recebido por carros vendidos: R$ " + adicional_carros_vendidos);
        System.out.println("Salário final: R$ " + salario_final);

    }
}
