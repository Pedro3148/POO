package collections;
import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Integer> inteiros = new HashSet<>();

        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);
        inteiros.add(3);
        inteiros.add(4);

        for (Integer inteiro : inteiros) {
            System.out.println(inteiro);
        }
    }
}
