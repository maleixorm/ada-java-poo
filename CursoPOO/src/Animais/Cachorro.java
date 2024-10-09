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
        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "Feliz";
                break;
            case "vai dormir!":
                this.estadoDeEspirito = "Bravo";
                break;
            case "pisar na patinha":
                this.estadoDeEspirito = "Triste";
                break;
            default:
                this.estadoDeEspirito = "Neutro";
                break;
        }

        return estadoDeEspirito;
    }
}
