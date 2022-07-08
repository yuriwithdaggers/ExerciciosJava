class Caneta{
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.printf("Tampada: %s", this.tampada ? "Sim" : "Nao");

    }

    public void rabiscar(){
        if(!this.tampada && carga > 0){
            System.out.println("Esta rabiscando.");
        } else{
            System.out.println("Nao pode rabiscar.");
        }
    }

    public void tampar(){
        if(!this.tampada){
            this.tampada = true;
        }else{
            System.out.println("A caneta ja esta tampada.");
        }
    }

    public void destampar(){
        if(this.tampada){
            this.tampada = false;
        }else{
            System.out.println("A caneta ja esta destampada.");
        }
    }

}