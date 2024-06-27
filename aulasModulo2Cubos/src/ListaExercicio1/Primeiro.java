// Desenvolva um programa que leia a altura e largura de uma parede, calcule e
// mostre a área a ser pintada e a quantidade de tinta necessária para o serviço, sabendo que
// cada litro de tinta pinta uma área de 2m^2


package ListaExercicio1;
import java.util.Scanner;

public class Primeiro {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);
        double altura, largura, area;

        System.out.printf("Digite a altura da parede: ");
        altura = ler.nextDouble();
        System.out.printf("Digite a largura da parede: ");
        largura = ler.nextDouble();

        area = altura * largura;
        double litros_tinta = area / 2;

        System.out.printf("Para pintar uma área de " + area + "m², serão necessários " + litros_tinta + "l de tinta.");
    }
}
