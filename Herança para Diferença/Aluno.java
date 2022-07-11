public class Aluno extends Pessoa{
  private int mat;
  private String curso;

  public void cancelarMat(){
    System.out.println("Sua matrícula será cancelada.");
  }
  
  public void setMat(int mat){
    this.mat = mat;
  }

  public void setCurso(String curso){
    this.curso = curso;
  }

  public String getCurso(){
    return this.curso;
  }

  public int getMat(){
    return this.mat;
  }
}