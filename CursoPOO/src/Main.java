import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Mel", "Preto/Amarelo", 55, 36.5, 22, "Nada");
        Gato gato1 = new Gato("Felix", "Preto", 15, 4.5, "nada");
        Passaro passaro1 = new Passaro("Piu Piu", "amarelo", 5, 0.5, "nada");

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
    }
}