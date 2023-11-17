package poo;

import poo.dao.PessoaDao;
import poo.model.Pessoa;

public class Main {
    public static void main(String[] args) {
        PessoaDao dao = new PessoaDao();
        
        Pessoa p1 = new Pessoa("Lorem ipsum", "lore@ipsum.com");
        Pessoa p2 = new Pessoa("Foo123", "foo@123.com");

        dao.deletarPessoa(p1);
        dao.deletarPessoa(p2);
    }
}
