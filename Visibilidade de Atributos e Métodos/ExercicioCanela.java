public class ExercicioCanela {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
            c1.modelo = "Crystal Bic";
            c1.cor = "Preta";
            //c1.ponta = 0.6;
            c1.carga = 70;
            //c1.tampada = false;
            c1.tampar();
            c1.rabiscar();
            c1.status();

    }
}
