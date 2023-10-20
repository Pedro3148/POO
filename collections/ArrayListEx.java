package collections;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Alice");
        listaDeNomes.add("Bob");
        listaDeNomes.add("Carol");

        for (String nome : listaDeNomes) {
            System.out.println(nome);
        }

        if (listaDeNomes.contains("Carol")) {
            System.out.println("Carol esta na lista");
        }
        
        listaDeNomes.remove("Carol");

        if (!listaDeNomes.contains("Carol")) {
            System.out.println("Carol nao esta na lista");
        }

        listaDeNomes.clear();
        if(listaDeNomes.isEmpty()) {
            System.out.println("Lista vazia");
        }
    }
}
