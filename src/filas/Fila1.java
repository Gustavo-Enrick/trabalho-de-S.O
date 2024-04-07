package filas;

import processo.Processo;

import java.util.ArrayList;
import java.util.List;

public class Fila1 {
    //Declaração dos atributos
    private  final List<Processo> fila1;

    private  final int quatun = 5;

    public Fila1() {
        this.fila1 = new ArrayList<>();
    }

    //Declaração dos métodos
    /**
     * Este método adiciona o objeto do tipo processo para ser adicionado ao array da classe.
    * @param processo Nescessário passar um objeto do tipo processo.
     * **/
    public void addProcess(Processo processo){
        getfila1().add(processo);
    }

    /**
     * Este método finaliza os processos de acordo com a ordenação RoundRobin.
     * **/

    public void startRoundRobin(){
        var list = getfila1();
        do {
            list.removeIf(processo -> {
                if(processo.getTempoProcesso() > quatun){
                    processo.setTempoProcesso(processo.getTempoProcesso() - quatun);
                    return false;
                }else {
                    System.out.printf("Processo: %s da lista 1 foi finalizado %n",processo.getNome());
                    return true;
                }
            });
        }while (!list.isEmpty());
    }

    public ArrayList<Processo> getfila1() {
        return (ArrayList<Processo>) fila1;
    }
}
