//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro gol = new Carro("Preto", "Volkswagem", "Gol", 2010);
        Aluno albert = new Aluno("Albert", "076.657.804-66");
        Professor anthony = new Professor ("Anthony", "077.655.804-77", 10000);

        gol.ligar();
        gol.acelerar("forte");
        gol.acelerar("fraca");
        gol.acelerar();
        gol.frear();
        gol.frear("forte");
        gol.frear("fraca");
        gol.acelerar("forte");
        gol.desligar();
        gol.acelerar();

        gol.setCor("Branco");

        albert.calcularPontos(10);
        albert.calcularPontos(15);
        anthony.calcularPontos(30);

        System.out.println(gol.getLigado());
        System.out.println(gol.getIdade());
        System.out.println(gol.getCor());
        System.out.println(albert.getCpf());
        anthony.setNome("Anthony Sevy");
        System.out.println(anthony.getNome());
        System.out.println("Pontos Albert: "+ albert.getPontos());
        System.out.println("Pontos Anthony: "+ anthony.getPontos());
        System.out.println(albert.imprimirSaudacao());
        System.out.println(anthony.imprimirSaudacao());
    }
}