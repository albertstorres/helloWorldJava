public abstract class Pessoa {
    private String nome;
    private String cpf;
    private int pontos;

    public Pessoa (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.pontos = 0;
    }

    public String getNome () {
        return this.nome;
    }
    public String getCpf () {
        return this.cpf;
    }
    public int getPontos () {
        return this.pontos;
    }

    public void setNome (String novo_nome) {
        this.nome = novo_nome;
    }

    public void setPontos (int pontos) {
        this.pontos += pontos;
    }
    public String imprimirSaudacao () {
        return "Olá pessoa: "+ this.nome;
    }

    public abstract void calcularPontos (int minutos);
}
