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

        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Mel");
        cachorro1.setCor("Preto/Amarelo");
        cachorro1.setAltura(55);
        cachorro1.setPeso(36.5);
        cachorro1.setTamanhoDoRabo(22);

        cachorro1.latir();
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());

        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir!"));
        System.out.println("O cachorro está " + cachorro1.interagir("pisar na patinha"));
        System.out.println("O cachorro está " + cachorro1.interagir("chamar"));
    }
}