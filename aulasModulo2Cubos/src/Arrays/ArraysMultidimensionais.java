package Arrays;

public class ArraysMultidimensionais {
   public static void main (String[] args) {
       String [][][] nomes = {
               {
                       {"Guido"},
                       {"João"}
               },
               {
                       {"Maria"},
                       {"Antonia"}
               }
       };

       System.out.println(nomes[0][1][0]);
       System.out.println(nomes[1][0][0]);

       String [][][] matrizNomes = new String [2][2][1];
       matrizNomes [0][0][0] = "Guido";
       matrizNomes [0][1][0] = "João";
       matrizNomes [1][0][0] = "Maria";
       matrizNomes [1][1][0] = "Antonia";

       System.out.println(matrizNomes[0][0][0]);
       System.out.println(matrizNomes[1][1][0]);
   }
}
