package Animais;

public class Cachorro {
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;

    public String estadoDeEspirito;

    public void comer() {

    }

    public void latir() {
        System.out.println("Ruf ruf ruf");
    }

    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {
        if (acao.equals("carinho")) {
            this.estadoDeEspirito = "Feliz";
        } else if (acao.equals("surra")) {
            this.estadoDeEspirito = "Triste";
        } else {
            this.estadoDeEspirito = "Neutro";
        }

        return estadoDeEspirito;
    }
}
