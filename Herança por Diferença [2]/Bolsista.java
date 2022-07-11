
package heranca;

public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Sua bolsa foi renovada.");
        
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Voce pagou sua mensalidade.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
     
}
