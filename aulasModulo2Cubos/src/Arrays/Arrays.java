package Arrays;

public class Arrays {
    public static void main (String[] args) {
        int [] array = {1, 234, 987};
        int []array2 = {1, 234, 987};
        int array3[] = {1, 234, 987};

        int [] array4 = new int[5];
        array4[0] = 1;
        array4[1] = 2;
        array4[2] = 3;
        array4[3] = 4;
        array4[4] = 5;

        System.out.println(array4[3]);

        System.out.println(array[1]);
        System.out.println(array2[0]);
        System.out.println(array3[2]);
//        System.out.println(array[3]); Erro porque o tamanho do array fica definido.
    }
}
