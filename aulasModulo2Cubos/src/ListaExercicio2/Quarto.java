// Uma loja de roupas está em promoção. Acima de 2 peças de roupas compradas e fazendo o pagamento
// à vista, o cliente tem 20% de desconto no valor total. Faça um algoritmo que receba:

        // - A quantidade de peças compradas;
        // - O valor total da compra;
        // - O código referente a condição de pagamento:
        //   i. 1 - Á vista;
        //  ii. 2 - Crédito;
        // iii. 3 - Crédito parcelado.

        // Por fim, o algoritmo deverá apresentar uma mensagem informando se o desconto foi aplicado, e em caso
        // positivo, o novo valor da compra.

package ListaExercicio2;
import java.util.Scanner;

public class Quarto {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);
        int quantidade_pecas, codigo_pagamento;
        double total_compra, total_compra_desconto;

        System.out.printf("Digite o total de peças do pedido: ");
        quantidade_pecas = ler.nextInt();
        System.out.printf("Digite  o total do pedido: ");
        total_compra = ler.nextDouble();
        System.out.println("");
        System.out.println("1 - Á vista");
        System.out.println("2 - Crédito");
        System.out.println("3 - Crédito parcelado");
        System.out.println("");
        do {
            System.out.printf("Digite a opção de pagamento: ");
            codigo_pagamento = ler.nextInt();
        } while ((codigo_pagamento < 1) || (codigo_pagamento > 3));

        if ((quantidade_pecas > 2) && (codigo_pagamento == 1)) {
            total_compra_desconto = total_compra * 0.8;
            System.out.println("Desconto aplicado");
            System.out.println("Valor da compra: R$ " + total_compra);
            System.out.println("Valor da compra com desconto: R$ " + total_compra_desconto);
        } else {
            System.out.println("Desconto não aplicado.");
            System.out.println("Valor total da compra: R$ " + total_compra);
        }

    }
}
