import filas.Fila1;
import filas.Fila2;
import processo.Processo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declarando as variaveis

        final Fila1 fila1 = new Fila1();
        final Fila2 fila2 = new Fila2();
        Scanner terminal = new Scanner(System.in);

        //Inicio do programa

        int qtdPrcessos;
        do {
            System.out.print("Quantos processos vão ser adicionados ?: ");
            qtdPrcessos = terminal.nextInt();
        }while (qtdPrcessos <= 0);

        // Entrada de dados para os processos

        for (int i = 0; i < qtdPrcessos; i++) {
            int tempoProcesso, prioridadeProcesso;
            do {
                System.out.print("Digite o tempo de processo: ");
                tempoProcesso = terminal.nextInt();
                System.out.print("Digite sua prioridade, (1) alta, (2) baixa: ");
                prioridadeProcesso = terminal.nextInt();
            } while (prioridadeProcesso != 1 && prioridadeProcesso != 2);

            // Adicionando o processo à fila correspondente

            if (prioridadeProcesso == 1) {
                fila1.addProcess(new Processo("P" + (i + 1), tempoProcesso));
            } else {
                fila2.addProcess(new Processo("P" + (i + 1), tempoProcesso));
            }
        }

        terminal.close();

        //Chamando as filas
        fila1.startRoundRobin();
        fila2.startFCFS();

    }
}