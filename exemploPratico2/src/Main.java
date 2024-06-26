//   Desenvolva um programa que efetue a soma de dois números. Caso o resultado seja
// maior que 10, este deverá ser apresentado somando-se 5. Se for menor ou igual a 10,
// o resultado deve ser apresentado subtraindo-se 5.

public class Main {
    public static void main (String[] args) {
        int a = 5;
        int b = 6;
        int soma = a + b;
        int res;

//        if (soma <= 10) {
//            res = soma -= 5;
//        } else {
//            res = soma += 5;
//        }
        res = (soma <= 10) ? (soma -= 5) : (soma += 5);

        System.out.println(res);
    }
}