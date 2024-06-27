// Um programa de vida saudável quer dar pontos para atividades físicas, os quais poderão ser trocados
// por dinheiro.

// O sistema funciona assim, cada hora de atividade física no mês vale pontos:
// - até 10h de atividade no mês: ganha 2 pontos por hora;
// - de 11h até 20h de atividade no mês: ganha 5 pontos por hora;
// - acima de 20h de atividade no mês: ganha 10 pontos por hora.

// Faça um programa que leia quantas horas de atividade uma pessoa teve por mês, calcule e mostre quantos pontos
// ela obteve.

package ListaExercicio2;
import java.util.Scanner;

public class Primeiro {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        double horas_atividade, pontos;

        System.out.printf("Digite o total de horas de atividade física no mês: ");
        horas_atividade = ler.nextDouble();

        if (horas_atividade < 0) {
            System.out.printf("Tempo negativo inválido.");
            return;
        }

        if (horas_atividade <= 10) {
            pontos = horas_atividade * 2;
        } else if ((horas_atividade > 10) && (horas_atividade <= 20)) {
            pontos = horas_atividade * 5;
        } else {
            pontos = horas_atividade * 10;
        }

        System.out.printf("Total de pontos obtidos: " + pontos);
    }
}
