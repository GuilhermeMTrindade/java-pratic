import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    static Scanner ler = new Scanner(System.in);
    static int opcaoMenu, opcaoSubMenu, i = 0, contador = 0;
    static ArrayList<String> tarefas = new ArrayList<>();

    public static String printaTexto(String texto) {
        out.println(texto);
        return texto;
    }

    public static void Menu(){
        opcaoMenu = 0;
        opcaoSubMenu = 0;
        printaTexto("\nMenu do gerenciados de tarefas:");
        printaTexto("1. Adicionar uma nova tarefa.");
        printaTexto("2. Ver tarefas adicionadas.");
        printaTexto("3. Alterar tarefas adicionadas.");
        printaTexto("4. Completar tarefas..");
        printaTexto("5. Deletar tarefas.");
        printaTexto("6. Sair.\n");
        out.print("Digite a sua escolha: ");
        opcaoMenu = ler.nextInt();
    }

    public static void main (String[] args) {
        Menu();
        ler.nextLine();
        switch (opcaoMenu) {
            case 1:
                do {
                    printaTexto("\nDigite a tarefa que deseja adicionar:");
                    tarefas.add(ler.nextLine());

                    printaTexto("\nDigite 1 para adicionar uma nova tarefa ou 2 para acessar o Menu: ");
                    opcaoSubMenu = ler.nextInt();
                    ler.nextLine();

                    if (opcaoSubMenu == 2) {
                        Menu();
                    }
                }
                while (opcaoSubMenu == 1);
                break;
            case 2:
                printaTexto("\nDigite a tarefa que deseja visualizar: \nCaso deseje visualizar todas, digite 0.");
                opcaoSubMenu = ler.nextInt();
                if (opcaoSubMenu == 0) {
                    while (i < tarefas.size()) {
                        printaTexto(tarefas.get(i));
                        i++;
                    }
                } else {
                    printaTexto(tarefas.get(opcaoSubMenu - 1));
                }
                break;
        }
    }
}
