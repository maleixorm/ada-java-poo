import Animais.Cachorro;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        byte variavelByte = 120;
        System.out.println(variavelByte);

        int variavelInt = 2147483;
        System.out.println(variavelInt);

        Cachorro cachorro1 = new Cachorro("Mel", "Preto/Amarelo", 55,36.5, 22, "Nada");
        System.out.println(cachorro1.getNumeroDeCachorros());
        Cachorro cachorro2 = new Cachorro("Puppy", "Marrom", 25,6.5, 5, "Nada");
        System.out.println(cachorro2.getNumeroDeCachorros());
        System.out.println(cachorro1.getNumeroDeCachorros());
        Cachorro cachorro3 = new Cachorro("Thor", "Cinza", 35,18.5, 12, "Nada");
        Cachorro cachorro4 = new Cachorro("Puppy", "Marrom", 25,6.5, 5, "Nada");

        System.out.println(cachorro2.toString());
        System.out.println(cachorro4.toString());

        System.out.println(cachorro1.getNome());
        System.out.println(cachorro2.getPeso());
        System.out.println(cachorro3.getTamanhoDoRabo());

        cachorro1.latir();
        System.out.println(cachorro1.getNome() + " pegou uma " + cachorro1.pegar());

        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir!"));
        System.out.println("O cachorro está " + cachorro1.interagir("pisar na patinha"));
        System.out.println("O cachorro está " + cachorro1.interagir("chamar"));
    }
}