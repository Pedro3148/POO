package exption;

import exption.banco.ContaCorrente;
import exption.banco.Banco;

public class Main{
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.abrirConta("Joao", 123);        
        ContaCorrente c = banco.pesquisarConta("Joao");
        
        System.out.println(c);
        try {
            banco.depositar(123, 10.0);
        } catch (Exception e) {
            System.out.println("Não foi possivel depositar");
        }
    }
}