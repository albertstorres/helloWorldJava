// Ler o nome de dois times e a quantidade de gols marcados na partida (para cada time).
// Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.

package ListaExercicio2;
import java.util.Scanner;

public class Quinto {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);
        String time1, time2;
        int gols_time1, gols_time2;

        System.out.printf("Digite o nome do primeiro time: ");
        time1 = ler.nextLine();
        System.out.printf("Digite o nome do segundo time: ");
        time2 = ler.nextLine();
        System.out.printf("Gols marcados pelo " + time1 + ": ");
        gols_time1 = ler.nextInt();
        System.out.printf("Gols marcados pelo " + time2 + ": ");
        gols_time2 = ler.nextInt();

        if (gols_time1 == gols_time2) {
            System.out.printf("EMPATE");
        } else if (gols_time1 > gols_time2) {
            System.out.printf(time1 + " VENCEDOR");
        } else {
            System.out.printf(time2 + " VENCEDOR");
        }
    }
}
