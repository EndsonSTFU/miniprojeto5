import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    String texto;
    Personagem Finn;
    Personagem Jake;
    int incrementoFinn;
    int incrementoJake;
    Scanner aventura;
    ArrayList<Escolhas> escolhas;

    public Capitulo(String texto, Personagem Finn, Personagem Jake, int incrementoFinn, int incrementoJake, Scanner aventura) {
        this.texto = texto;
        this.Finn = Finn;
        this.Jake = Jake;
        this.incrementoJake = incrementoJake;
        this.incrementoFinn = incrementoFinn;
        this.aventura = aventura;
        this.escolhas = new ArrayList<>();
    }

    public void adicionarEscolha(String texto, Capitulo proximoCapitulo) {
        Escolhas escolha = new Escolhas(texto, proximoCapitulo);
        escolhas.add(escolha);
    }

    public void mostrar() {
        System.out.println(texto);
        Finn.atualizarVida(incrementoFinn);
        Jake.atualizarVida(incrementoJake);

        for (int i = 0; i < escolhas.size(); i++) {
            System.out.println("- " + escolhas.get(i).texto);
        }

        System.out.println();
        System.out.println(". . .");
        System.out.println();
    }

    public Capitulo escolher() {
        int opcaoEscolhida = 0;
        String escolha;
        boolean escolhaCorreta = false;

        if (escolhas.isEmpty()) {
            System.out.println("E ASSIM CHEGAMOS AO FIM DA JORNADA.");
            System.exit(0);
        } else {
            while (!escolhaCorreta) {
                escolha = aventura.nextLine();
                for (int i = 0; i < escolhas.size(); i++) {
                    if (escolha.equals(escolhas.get(i).texto)) {
                        escolhaCorreta = true;
                        opcaoEscolhida = i;
                    }
                }
                if (!escolhaCorreta) {
                    System.out.println("Escolha apenas uma das opções indicadas");
                    escolhaCorreta = false;
                    return null;
                }
            }
        }
        return escolhas.get(opcaoEscolhida).proximo;
    }

    public void executar() {
        mostrar();
        Capitulo proximoCapitulo = escolher();

        if (proximoCapitulo != null) {
            proximoCapitulo.executar();
        } else {
            System.out.println("VOCE FOI UM GRANDE HEROI.");
            System.exit(0);
        }
    }
}