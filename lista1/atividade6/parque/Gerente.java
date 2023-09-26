package atividade6.parque;

import java.math.BigDecimal;
//import java.math.RoundingMode;

public class Gerente extends Funcionario {
  private Integer qtdGerenciados;

  public Gerente(String nome, Integer cpf, Integer qtdGerenciados, Integer telefone) {
    super(nome, cpf,telefone);
    this.qtdGerenciados = qtdGerenciados;
  }

  public Integer getqtdGerenciados() {
    return this.qtdGerenciados;
  }

  public void setqtdGerenciados(Integer qtdGerenciados) {
    this.qtdGerenciados = qtdGerenciados;
  }

  @Override
  public BigDecimal getSalario(){
      return new BigDecimal(20000.00);
  }
  
  //@Override
  //public BigDecimal getBonificacao(){
   //   return getSalario().multiply(new BigDecimal(0.1));

  //}
  @Override
  public String toString() {
      return "{" +
          " nome='" + getNome() + "'" +
          ", cpf='" + getCpf() + "'" +
          ", telefone='" + getTelefone() + "'" +
          ", quantidadeGerenciados='" + getqtdGerenciados() + "'" +
          ", salario= '" + getSalario() + "'" +
          //", bonificacao='" + getBonificacao().setScale(2, RoundingMode.HALF_UP) + "'" +
          "}";
  }
}
