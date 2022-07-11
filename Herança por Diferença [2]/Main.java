package heranca;
public class Main {
    public static void main(String[] args) {
        Aluno v1 = new Aluno();
        v1.setIdade(19);
        v1.setNome("John Doe");
        v1.setSexo('M');
        System.out.println(v1.toString());
        v1.pagarMensalidade();
    }
    
}
