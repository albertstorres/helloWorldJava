// Desenvolva um programa que leia a área em m² de um terreno retangular. Ao final, o programa deverá
// mostrar a classificação desse terreno, de acordo com a lista abaixo:
// - Abaixo de 100 m² = Terreno Popular;
// - Entre 100 e 500 m² = Terreno Master;
// - Acima de 500 m² = Terreno Vip.

package ListaExercicio2;
import java.util.Scanner;

public class Terceiro {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);
        double area;

        System.out.printf("Digite a área do terreno em m²: ");
        area = ler.nextDouble();
        while (area <= 0) {
            System.out.println("Área negativa ou igual a zero é inválida.");
            System.out.printf("Digite novamente a área do terreno em m²: ");
            area = ler.nextDouble();
        }

        if (area < 100) {
            System.out.printf("Terreno Popular.");
        } else if ((area >= 100) && (area <= 500)) {
            System.out.printf("Terreno Master.");
        } else {
            System.out.printf("Terreno Vip.");
        }
    }
}
