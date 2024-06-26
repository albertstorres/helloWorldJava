//  Desenvolva um programa para bilheteria de teatro. Leia a idade de uma pessoa, indique
// o valor do ingresso segundo as regras:
// a) Entrada para menores de 4 anos e maiores de 60 é gratuita;
// b) Entrada para qualquer pessoa com idade entre 4 e 18 anos é R$ 20,00;
// c) Entrada para maiores de 18 anos custa R$ 30,00.

public class Main {
    public static void main (String[] args) {
        int idade = 3;

        if (idade < 0) {
            System.out.println("Idade inválida");
        }

        if ((idade < 4) || (idade > 60)) {
            System.out.println("Entrada gratuita.");
        } else if ((idade >= 4) && (idade <= 60)) {
            System.out.println("Entrada R$ 20,00");
        } else {
            System.out.println("Entrada R$ 30,00");
        }
    }
}