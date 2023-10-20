package collections;
import java.util.HashMap;

public class MapEx {
    public static void main(String[] args) {
        HashMap<String, String> capitais = new HashMap<>();
        capitais.put("Brasil", "Brasilia");
        capitais.put("Alemanha", "Munique");
        capitais.put("Espanha", "Madrid");
        capitais.put("Inglaterra", "Londres");
        capitais.put("Franca", "Paris");

        for (String chave : capitais.keySet()) {
            System.out.println(chave + " - " + capitais.get(chave));
        }


    }
}
