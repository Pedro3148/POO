package collections;
import java.util.Vector;

public class VetorEx {
    public static void main(String[] args) {
        Vector<String> frutas = new Vector<>();
        frutas.add("Maca");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Pera");

        System.out.println(frutas.get(0));
        if (frutas.contains("Banana")) {
            System.out.println("Tem banana!");
        }

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        frutas.remove("maca");
        if (!frutas.contains("maca")) {
            System.out.println("nao tem maca");
        }

        if (frutas.isEmpty()) {
            System.out.println("vetor vazia");
        }
    }
}
