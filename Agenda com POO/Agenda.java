public class Agenda{


    Pessoa[] agenda = new Pessoa[10];
    private int cont;

    public void cadastraPessoa(String nome, double altura, int nascimento){
        Pessoa p = new Pessoa(nome, altura, nascimento);
        agenda[cont] = p;
        cont++;
    }

    public void mostraAgenda(){
        for(Pessoa x: agenda){
            if(x != null){
                x.mostraPessoa();
            }
        }
    }

    public void removePessoa(String nome){
        for(int i = 0; i < agenda.length; i++){
            if(agenda[i] != null){
                if(agenda[i].getNome().equals(nome)){
                    System.out.println(agenda[i].getNome() + " foi removido com sucesso.");
                    agenda[i] = null;
                    return;
                }
            }
        }
        System.out.println("Não tem uma pessoa com esse nome para remover.");
    }

    public int buscaPessoa(String nome){
        for(int i = 0; i < agenda.length; i++){
            if(agenda[i] != null){
                if(agenda[i].getNome().equals(nome)){
                    System.out.printf("O nome '%s' está na posicao %d.", nome, i);
                    return i;
                }
            }
        }
        System.out.println("Nao tem uma pessoa com esse nome na sua lista.");
        return -1;
    }

    public void imprimePessoa(String nome){
        for(int i = 0; i < agenda.length; i++){
            if(agenda[i] != null){
                if(agenda[i].getNome().equals(nome)){
                    agenda[i].mostraPessoa();
                    return;
                }
            }
        }
        System.out.println("Nao ha uma pessoa com esse nome na lista.");
    }

}