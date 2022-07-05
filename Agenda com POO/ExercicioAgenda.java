public class ExercicioAgenda {
    public static void main(String[] args) {
        Agenda agendinha = new Agenda();
        agendinha.cadastraPessoa("John Doe", 1.65, 1976);
        agendinha.cadastraPessoa("Barack Obama", 1.23, 1777);
        agendinha.cadastraPessoa("Yuri", 7.10, 1999);
        agendinha.imprimePessoa("Yuri");
        agendinha.removePessoa("Yuri");
        agendinha.imprimePessoa("Yuri");
    }
}
