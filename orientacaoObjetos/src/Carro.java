public class Carro {
    private int aceleracao, ano, idade;
    private String cor, marca, modelo;
    private boolean ligado;

    //Método construtor
    public Carro (String cor, String marca, String modelo, int ano) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
        this.aceleracao = 0;
        this.setIdade();
    }

    //Funcionalidades (Métodos)
    public void ligar () {
        if (this.ligado) {
            return;
        }

        this.ligado = true;
    }

    public void desligar () {
        if (!this.ligado) {
            return;
        }
        this.aceleracao = 0;
        this.ligado = false;
    }

    public void acelerar (String tipoAceleracao) {
        if (!this.ligado) {
            System.out.println("Carro desligado.");
            return;
        }
        switch (tipoAceleracao) {
            case "forte" :
                this.aceleracao += 1000;
                break;
            case "fraca" :
                this.aceleracao += 500;
                break;
        }
    }
    public void acelerar () {
        if (!this.ligado) {
            System.out.println("Carro desligado.");
            return;
        }
        this.aceleracao += 750;
    }

    public void frear (String tipoFreada) {
        if (!this.ligado) {
            return;
        }

        switch (tipoFreada) {
            case "forte" :
                if (this.aceleracao <= 1000) {
                    this.aceleracao = 0;
                    break;
                }
                this.aceleracao -= 1000;
                break;
            case "fraca" :
                if (this.aceleracao <= 500) {
                    this.aceleracao = 0;
                    break;
                }
                this.aceleracao -= 500;
        }
    }
    public void frear () {
        if (!this.ligado) {
            return;
        }
        if (this.aceleracao <= 750) {
            this.aceleracao = 0;
            return;
        }
        this.aceleracao -= 750;
        return;
    }
    private void setIdade () {
        this.idade = 2024 - this.ano;
    }

    //Encapsulamento - Getters e Setters
    public String getCor () {
        return this.cor;
    }
    public String getMarca () {
        return this.marca;
    }
    public String getModelo () {
        return this.modelo;
    }
    public int getAno () {
        return this.ano;
    }
    public int getAceleracao () {
        return this.aceleracao;
    }
    public boolean getLigado () {
        return this.ligado;
    }
    public int getIdade () {
        return this.idade;
    }

    public void setCor (String cor) {
        this.cor = cor;
    }
}
