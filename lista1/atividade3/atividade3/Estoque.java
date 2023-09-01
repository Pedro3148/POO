package atividade3;
import java.util.ArrayList;

public class Estoque {
    ArrayList<Objeto> objetos;

    Estoque(){
        this.objetos = new ArrayList<Objeto>();
    }

    public void adicionarObjeto(Objeto o){
        for (Objeto obj : objetos) {
            if(obj.nome.equals(o.nome)){
                System.out.println("Objeto ja cadastrado");
                return;
            }
        }
        
        this.objetos.add(o);
    }

    public void removerObjeto(String nome){
         for (Objeto o : objetos) {
            if (o.nome.equals(nome)) {
                objetos.remove(o);
                System.out.println("Objeto removido");
                return;
            }
         }
         System.out.println("Objeto nao cadastrado");
    }

    public String listarEstoque(){
        String listaObjetos = "";

        for (Objeto o : this.objetos) {
            listaObjetos += o.nome + "\tQtd: " + o.qtd + "\n"; 
        }

        return listaObjetos;
    }

    public void atualizarQtd(String nome, int qtdNova){
        for (Objeto o : this.objetos) {
            if (o.nome.equals(nome)) {
                o.qtd = qtdNova;
                return;
            }
        }
        System.out.println("Nao tem esse objeto no estoque");
    }
}
