class Main {
  public static void main(String[] args) {
    Funcionario p1 = new Funcionario();
    p1.setNome("John Doe");
    p1.setTrabalhando(true);
    p1.mudarTrabalho();
    System.out.println(p1.getTrabalhando());
  }
}