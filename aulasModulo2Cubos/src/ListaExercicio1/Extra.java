// Leia um número e indique se ele é maior, menor ou igual a zero

package ListaExercicio1;
import java.util.Scanner;

public class Extra {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);
        double numero;

        System.out.printf("Digite um número: ");
        numero = ler.nextDouble();

        if (numero > 0) {
            System.out.printf(numero + " é MAIOR que zero.");
        } else if (numero < 0) {
            System.out.printf(numero + " é MENOR que zero.");
        } else {
            System.out.printf(numero + "é IGUAL a zero.");
        }
    }
}
