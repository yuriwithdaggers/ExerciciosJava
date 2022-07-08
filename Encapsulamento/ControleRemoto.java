public class ControleRemoto implements Controller{
  private int volume;
  private boolean ligado;
  private boolean tocando;


  @Override
  public void ligar(){
    this.setLigado(true);
  }  

    @Override
  public void desligar(){
    this.setLigado(false);
  }  

  @Override
  public void abrirMenu(){
    System.out.println("Ligado: " + (this.getLigado() ? "Sim" : "Não"));
    System.out.println("Tocando: " + (this.getTocando() ? "Sim" : "Não"));
    System.out.print("Volume: " + this.getVolume());
    for(int i = 0; i < getVolume(); i+=10){
      System.out.print("|");
    }
  }  

    @Override
  public void fecharMenu(){

    
    
  } 

  @Override
  public void aumentarVolume(){
    if(getLigado() && getVolume() <= 95){
      setVolume(getVolume() + 5);
    }
  }  

  @Override
  public void diminuirVolume(){
    if(getLigado() && getVolume() >= 5){
      setVolume(getVolume() - 5);
    }
  }  

  @Override
  public void colocarMudo(){
    if(getLigado() && getVolume() > 0){
      setVolume(0);
    }
  }  

  @Override
  public void tirarMudo(){
    if(getLigado() && getVolume() == 0){
      setVolume(5);
    }
  }  

  @Override
  public void play(){
    if(getLigado() && !getTocando()){
      setTocando(true);
    }
  }  

  @Override
  public void pause(){
    if(getLigado() && getTocando()){
      setTocando(false);
    }
  }  


  public ControleRemoto(){
    this.volume = 50;
    this.ligado = false;
    this.tocando = false;
  }
  
  private int getVolume(){
    return this.volume;
  }

  private void setVolume(int vol){
    this.volume = vol;
  }

  private boolean getLigado(){
    return this.ligado;
  }

  private void setLigado(boolean state){
    this.ligado = state;
  }

  private boolean getTocando(){
    return this.tocando;
  }

  private void setTocando(boolean tocando){
    this.tocando = tocando;
  }
}