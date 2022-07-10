
package relacao.entre.classes;

public class Livro implements Interface {
    private String titulo, autor;
    private Pessoa leitor;
    private int totPaginas, pagAtual;
    private boolean aberto;

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ",\n autor=" + autor + ",\n leitor=" + leitor.getNome() + ",\n totPaginas=" + totPaginas + ",\n pagAtual=" + pagAtual + ",\n aberto=" + aberto + '}';
    }

    
    
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.totPaginas = totPaginas;
        this.autor = autor;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int paginas) {
        if(paginas < totPaginas){
            this.pagAtual = paginas;
        }
    }

    @Override
    public void avancarPag() {
        if(this.pagAtual + 1 >= this.totPaginas){
            this.pagAtual++;
        }else{
            System.out.println("Não tem página para avançar.");
        }
    }

    @Override
    public void voltarPag() {
        if(this.pagAtual - 1 >= 0){
            this.pagAtual--;
        } else{
            System.out.println("Não tem página para voltar.");
        }
        
    }
}
