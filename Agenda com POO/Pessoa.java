public class Pessoa {

    private String nome;
    private double altura;
    private int nascimento;

    public Pessoa(String nome, double altura, int nascimento){
        this.nome = nome;
        this.altura = altura;
        this.nascimento = nascimento;
    }

    public void mostraPessoa(){
        System.out.println("---------------------------------------");
        System.out.println("Nome da pessoa: " + this.nome);
        System.out.println("Altura da pessoa: " + this.altura + "m");
        System.out.println("Data de nascimento da pessoa: " + this.nascimento);
        System.out.println("Idade da pessoa: " + this.calculaIdade());
        System.out.println("---------------------------------------");
    }

    public void mudaNome(String novoNome){
        this.nome = novoNome;
    }

    public int calculaIdade(){
        int idade = 2022 - this.nascimento;
        return idade;
    }

    public String getNome(){
        return this.nome;
    }

}
