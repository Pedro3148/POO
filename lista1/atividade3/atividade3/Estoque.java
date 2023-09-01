package atividade3;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    ArrayList<Objeto> objetos;

    Estoque(){
        this.objetos = new ArrayList<Objeto>();
    }

    public void adicionarObjeto(Objeto o){
        this.objetos.add(o);
    }

    public void removerObjeto(Objeto o){
         this.objetos.remove(o);
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
            if (nome == o.nome) {
                o.qtd = qtdNova;
                return;
            }
        }
        System.out.println("Nao tem esse objeto no estoque");
    }

    public List<Objeto> acharObjeto(){
        return objetos; 
    }
}
