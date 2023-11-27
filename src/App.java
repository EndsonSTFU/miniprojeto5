import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner plano = new Scanner(System.in);
        Personagem Finn = new Personagem("Finn", 0);
        Personagem Jake = new Personagem("Jake", 0);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~ AS AVENTURAS DE Finn E Jake ~~~~~~~~~~");

        Capitulo capitulo1 = new Capitulo("Finn e Jake entram em uma masmorra , qual porta eles devem escolher?\", \"Porta de caveira\", \"Porta de ouro\"", Finn, Jake, 0, 0, plano);
        Capitulo final1 = new Capitulo("Finn e Jake dão de cara com o Litch um mau ancestral e são derrotados liberando ele na terra de Ooo.", Finn, Jake, -150, -100, plano);
        Capitulo capitulo11 = new Capitulo("Finn e Jake entram na porta se deparando com Marceline lutando contra um monstro. Devemos ajuda-la?\", \"Sim\", \"Nao", Finn, Jake, +50, +70, plano);
        Capitulo final2 = new Capitulo("Finn e Jake lutam com bravura derrotando o monstro que mostra ser Abadeer pai de Marceline, pela bravura nossos herois recebem de Abadeer um cristal magico da vitalidade assim dando mais vigor a Finn e Jake.", Finn, Jake, +50, +150, plano);
        Capitulo final11 = new Capitulo("Finn vê Marceline sendo derrotada e em seguida nossos herois tambem são derrotados.", Finn, Jake, -100, -70, plano);

        capitulo1.adicionarEscolha("Porta de caveira", final1);
        capitulo1.adicionarEscolha("Porta de ouro", capitulo11);
        capitulo11.adicionarEscolha("Nao", final11);
        capitulo11.adicionarEscolha("Sim", final2);

        Capitulo raiz = capitulo1;

        raiz.executar();
    }
}