public class ManipulacaoStringsStartsWithEndsWith {
    public static void main (String[] args){
        String variavel1 = "Albert Sevy";
        boolean resultado1 = variavel1.startsWith("Al");
        boolean resultado2 = variavel1.startsWith("Al", 1);
        boolean resultado3 = variavel1.endsWith("evy");

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
    }
}
