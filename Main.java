import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int qtdTarefas, tarefaEscolhida;
        String tarefaInserida;
        ArrayList<String> tarefasGeral = new ArrayList<>();

        Scanner ler = new Scanner(System.in);

        // Define a quantidade de tarefas a serem cadastradas na lista.
        System.out.println("Digite a quantidade de tarefas a serem cadastradas: ");
        qtdTarefas = ler.nextInt();
        ler.nextLine();

        // Cadastra cada tarefa individualmente em um espaço na lista.
        int i = 1;
        while (i <= qtdTarefas){
            System.out.println("Insira o nome da " + i + "º tarefa: ");
            tarefaInserida = ler.nextLine();

            if (!tarefaInserida.isEmpty()){
                tarefasGeral.add(tarefaInserida);
                i++;
            } else {
                System.out.println("Tarefa inserida é inválida. Tente novamente: ");
            }
        }

        // Apresenta a tarefa escolhida caso tenha sido cadastrada, se não, informa que não foi cadastrado nenhuma tarefa.
        if (qtdTarefas > 0){
            System.out.println("Escolha a tarefa a ser apresentada: ");
            tarefaEscolhida = ler.nextInt();
            if (tarefaEscolhida <= tarefasGeral.size()) {
                System.out.println(tarefasGeral.get(tarefaEscolhida - 1));
            } else {
                System.out.println("Tarefa escolhida é inválida. Tente novamente: ");
            }
        }
    }
}
