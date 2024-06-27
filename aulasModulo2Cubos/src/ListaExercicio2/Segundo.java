// Precisa-se desenvolver um sistema para verificar se um aluno foi aprovado na disciplina.
// Pede-se que o professor insira as duas notas do aluno e sua frequência em porcentagem.
// Primeiro verifica-se se o aluno possui no mínimo 75% de frequência, caso seja verdadeiro, verifica-se a média
// do aluno é maior ou igual a 7, mostrando a mensagem "Aprovado por média". Se não, mostrar a mensagem
// "Reporvado por média".
// Mas, se a frequência for abaixo de 75%, apresenta a mensagem "Reprovado por falta"

package ListaExercicio2;
import java.util.Scanner;

public class Segundo {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);
        double nota1, nota2, porcentagem_frequencia;

        System.out.printf("Digite a primeira nota: ");
        nota1 = ler.nextDouble();
        System.out.printf("Digite a segunda nota: ");
        nota2 = ler.nextDouble();
        System.out.printf("Digite a porcentagem de freqência do aluno: ");
        porcentagem_frequencia = ler.nextDouble();

        if (porcentagem_frequencia < 75) {
            System.out.printf("Reprovado por falta");
            return;
        }

        double media = ((nota1 + nota2)/2);
        String resposta = (media > 7) ? "Aprovado por média" : "Reprovado por média";

        System.out.printf(resposta);
    }
}
