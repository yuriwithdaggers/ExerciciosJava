import java.util.Random;

public class Luta{
  Lutador desafiado;
  Lutador desafiante;
  int rounds;
  boolean aprovada;

  public Luta(Lutador desafiado, Lutador desafiante){
    //Construtor das duas maneiras, ver class Luta e Lutador
    this.desafiado = desafiado;
    this.desafiante = desafiante;
    this.marcarLuta();
  }

  

  public Lutador getDesafiado(){
    return this.desafiado;
  }

  public void setDesafiado(Lutador desafiado){
    this.desafiado = desafiado;
  }

  public Lutador getDesafiante(){
    return this.desafiante;
  }

  public void setDesafiante(Lutador desafiante){
    this.desafiante = desafiante;
  }

  public int getRounds(){
    return this.rounds;
  }

  public void setRounds(int rounds){
    this.rounds = rounds;
  }

  public void setAprovada(boolean aprovada){
    this.aprovada = aprovada;
  }

  public void marcarLuta(){
    if(this.desafiante.getNome() != this.desafiado.getNome() && this.desafiante.getCategoria() == this.desafiado.getCategoria()){
      this.setAprovada(true);
    }else{
      this.setAprovada(false);
    }
  }

  public void lutar(){
    if(this.aprovada){
      this.desafiado.status();
      this.desafiante.status();
      Random rand = new Random();
      int vitoria = rand.nextInt(3);
      switch(vitoria){
        case 0:
          System.out.println("Empatou!");
          this.desafiante.empatarLuta();
          this.desafiado.empatarLuta();
          break;
        case 1:
          System.out.println(this.desafiado.getNome() + " ganhou!");
          this.desafiado.ganharLuta();
          this.desafiante.perderLuta();
          break;
        case 2:
          System.out.println(this.desafiante.getNome() + " ganhou!");
          this.desafiante.ganharLuta();
          this.desafiado.perderLuta();
          break;        
      }
      this.desafiado.status();
      this.desafiante.status();    
      
    }else{
      System.out.println("Luta não pode acontecer.");
    }
  }

  public boolean getAprovada(){
    return this.aprovada;
  }

  
}