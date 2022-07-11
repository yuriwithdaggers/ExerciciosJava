
package heranca;
public class Pessoa {
    protected int idade;
    protected char sexo;
    protected String nome;
    
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "idade=" + idade + ", sexo=" + sexo + ", nome=" + nome + '}';
    }
    
    
    
}
