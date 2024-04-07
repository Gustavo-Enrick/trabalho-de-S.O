package filas;

import processo.Processo;

import java.util.ArrayList;
import java.util.List;

public class Fila2 {
    //Declaração dos atributos da classe
    private  final List<Processo> fila2;

    public Fila2() {
        this.fila2 = new ArrayList<>();
    }

    //Declaração dos métodos da classe
    /**
     * Este método adiciona o objeto do tipo processo para ser adicionado ao array da classe.
     * @param processo Nescessário passar um objeto do tipo processo.
     * **/
    public  void addProcess(Processo processo){
        getFila2().add(processo);
    }

    /**
     * Este método finaliza os processos de acordo com a ordenação RoundRobin.
     * **/
    public void startFCFS(){
        for(Processo processo: getFila2()){
            System.out.printf("Processo: %s da lista 2 foi finalizado %n",processo.getNome());
        }
    }

    public ArrayList<Processo> getFila2() {
        return (ArrayList<Processo>) fila2;
    }
}
