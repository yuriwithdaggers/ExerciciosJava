public class Pessoa{
  private String nome;
  private int idade;
  private char sexo;

  public void fazerAniver(){
    this.setIdade(this.getIdade() + 1);
  }

  public String getNome(){
    return this.nome;
  }

  public int getIdade(){
    return this.idade;
  }

  public char getSexo(){
    return this.sexo;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public void setIdade(int idade){
    this.idade = idade;
  }

  public void setSexo(char sexo){
    this.sexo = sexo;
  }
}