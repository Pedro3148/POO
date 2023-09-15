package encapsulamento;

import java.net.PortUnreachableException;

public class ContaCorrente {
    private Integer numero;
    private Double saldo;

    public ContaCorrente(){

    }

    public ContaCorrente(Integer numero){
        this.numero = numero;
    }

    public ContaCorrente(Integer numero, Double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public Integer getNumero(){
        return this.numero;
    }

    public void setNumero(Integer n) throws Exception{
        if (n > 0){
            this.numero = n;
        }else{
            throw new Exception("Número inválido");
        }
    }

    public Double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    public void transferir(ContaCorrente contaDestino, Double valorTransferencia){
        if (getSaldo() >= valorTransferencia){
            this.saldo = getSaldo() - valorTransferencia;
            contaDestino.despositar(valorTransferencia);            
        }
    }

    public void despositar(Double valorDeposito){
        if (valorDeposito > 0){
            this.saldo = getSaldo() + valorDeposito;
        }
    }

    public static void transferir(ContaCorrente cOrigem, ContaCorrente cDestino, Double valorTransferencia){
        cOrigem.transferir(cDestino, valorTransferencia);
    }

    @Override
    public String toString() {
        return "{" +
            " numero='" + getNumero() + "'" +
            ", saldo='" + getSaldo() + "'" +
            "}";
    }
    
}
