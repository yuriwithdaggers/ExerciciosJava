public class Elevador{
    int andarAtual, totAndares, capElevador, pessoas;

    public Elevador(int totAndares, int capElevador){
        this.totAndares = totAndares;
        this.capElevador = totAndares;
    }

    public void mostraInfo(){
        System.out.println("O andar atual e: " + this.andarAtual);
        System.out.println("O total de andares e: " + this.totAndares);
        System.out.println("A capacidade do elevador e de: " + this.capElevador + " pessoas.");
        System.out.println("A quasntidade de pessoas no elevador e de " + this.pessoas + " pessoas.");
    }

    public void Entra(){
        if(this.capElevador + 1 <= this.capElevador){
            this.pessoas++;
            System.out.println("Entrou 1.");
        }else{
            System.out.println("O elevador ja esta cheio.");
        }
    }

    public void Sai(){
        if(this.capElevador > 0){
            this.pessoas--;
            System.out.println("Saiu 1.");
        }else{
            System.out.println("Nao tem ninguem no elevador para sair.");
        }
    }

    public void Sobe(){
        if(this.andarAtual + 1 <= totAndares){
            System.out.println("Subiu 1 andar.");
            this.andarAtual++;
        }else{
            System.out.println("Voce ja esta no ultimo andar.");
        }
    }

    public void Desce(){
        System.out.println("Desceu 1 andar.");
        if(this.andarAtual > 0){
            this.andarAtual--;
        }else{
            System.out.println("VocÊ está no primeiro andar.");
        }
    }
}