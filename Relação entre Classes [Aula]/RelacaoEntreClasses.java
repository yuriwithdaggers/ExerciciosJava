
package relacao.entre.classes;


public class RelacaoEntreClasses {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[3];
        Livro[] livros = new Livro[3];
        
        pessoas[0] = new Pessoa("John Doe", 19, 'M');
        pessoas[1] = new Pessoa("Balaclava", 7, 'F');
        pessoas[2] = new Pessoa("BRTT", 40, 'M');
        
        livros[0] = new Livro("Crime e Castigo", "Fiodor Dostoievski", 500, pessoas[0]);
        livros[1] = new Livro("Sailor Moon", "Naoko Takeuchi", 200, pessoas[1]);
        livros[2] = new Livro("Em busca do tempo perdido", "Marcel Proust", 2700, pessoas[2]);
        
        livros[0].abrir();
        livros[0].folhear(400);
        System.out.println(livros[0].detalhes());
        
    }
    
}
