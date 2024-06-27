package Scanner;

import java.util.Scanner;

public class LeituraDados {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);
        int n;
        double preco;
        String palavra;
        String frase;

        System.out.println("Digite um número para a tabela: ");
        n = ler.nextInt();
        System.out.println("Digite o preço da mercadoria: ");
        preco = ler.nextDouble();
        System.out.println("Digite uma palavra: ");
        palavra = ler.next();
        ler.nextLine(); //Limpar o cache do teclado após leitura de String.
        System.out.println("Digite uma frase: ");
        frase = ler.nextLine();

        System.out.println("Número digitado: " + n);
        System.out.println("Preço digitado: R$ " + preco);
        System.out.println("Palavra digitada: " + palavra);
        System.out.println("Frase digitada: " + frase);
    }
}
