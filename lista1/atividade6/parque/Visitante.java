package atividade6.parque;

public class Visitante {

  protected String nome;
  protected Integer cpf;
  protected Integer telefone;

  public Visitante() {
  }

  public Visitante(String nome, Integer cpf, Integer telefone){
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    
  }
   public String getNome(){
      return this.nome;
    }

  public void setNome(String nome){
      this.nome = nome;
    }
  public Integer getCpf(){
      return this.cpf;
    }
  public void setCpf(Integer cpf){
      this.cpf = cpf;
    }
  public Integer getTelefone(){
      return this.telefone;
    }
  public void setTelefone(Integer telefone){
      this.telefone = telefone;
    }
}
