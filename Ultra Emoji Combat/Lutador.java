public class Lutador{
  private String nome, nacionalidade, categoria;
  private int idade, vitorias, derrotas, empates;
  private double peso, altura;

  public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates){
    setNome(nome);
    setNacionalidade(nacionalidade);
    setIdade(idade);
    setAltura(altura);
    setPeso(peso);
    setDerrotas(derrotas);
    setVitorias(vitorias);
    setEmpates(empates);
  }
  
  public void apresentar(){
    System.out.println("-----------------");
    System.out.println("Nome do lutador: " + getNome());
    System.out.println("Nacionalidade: " + getNacionalidade());
    System.out.println("Idade: " + getIdade());
    System.out.println("Categoria: " + getCategoria());
    System.out.println("------------------");
  }

  public void status(){
    System.out.println("~~~~~~" + this.getNome() + "~~~~~~");
    System.out.println("Altura: " + getAltura() + "m");
    System.out.println("Peso: " + getPeso() + "kg");
    System.out.println("Vitorias: " + getVitorias());
    System.out.println("Derrotas: " + getDerrotas());
    System.out.println("Empates: " + getEmpates());
    System.out.println("~~~~~~~~~~~~~~");
  }

  public void ganharLuta(){
    setVitorias(getVitorias() + 1);
  }
  
  public void perderLuta(){
    setDerrotas(getDerrotas() + 1);
  }

  public void empatarLuta(){
    setEmpates(getEmpates() + 1); 
  }

  // Público para classe Luta
  public String getNome(){
    return this.nome;
  }

  private void setNome(String nome){
    this.nome = nome;
  }

  private String getNacionalidade(){
    return this.nacionalidade;
  }

  private void setNacionalidade(String nacionalidade){
    this.nacionalidade = nacionalidade;
  }

  // Público para classe Luta
  public String getCategoria(){
    return this.categoria;
  }

  private void setCategoria(){
    if(getPeso()<52.2){
      this.categoria = "Inválido";
    }else if(getPeso()<=73.3){
      this.categoria = "Leve";
    }else if(getPeso()<=83.9){
      this.categoria = "Médio";
    }else if(getPeso()<=120.2){
      this.categoria = "Pesado";      
    }else{
      this.categoria = "Inválido";
    }
  }

  private int getIdade(){
    return this.idade;
  }

  private void setIdade(int idade){
    this.idade = idade;
  }

  private int getVitorias(){
    return this.vitorias;
  }

  private void setVitorias(int vitorias){
    this.vitorias = vitorias;
  }

  private int getDerrotas(){
    return this.derrotas;
  }

  private void setDerrotas(int derrotas){
    this.derrotas = derrotas;
  }

  private int getEmpates(){
    return this.empates;
  }

  private void setEmpates(int empates){
    this.empates = empates;
  }

  private double getPeso(){
    return this.peso;
  }

  private void setPeso(double peso){
    this.peso = peso;
    this.setCategoria();
  }

  private double getAltura(){
    return this.altura;
  }

  private void setAltura(double altura){
    this.altura = altura;
  }
}