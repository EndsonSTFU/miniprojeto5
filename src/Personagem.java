public class Personagem {
    String nome;
    int Vida;

    Personagem(String nome, int Vida) {
        this.nome = nome;
        this.Vida = Vida;
    }

    Personagem(String nome) {
        this.nome = nome;
        this.Vida = 100;
    }

    void atualizarVida(int incremento) {
        if (incremento != 0) {
            this.Vida += incremento;
            System.out.println(" O " + this.nome + " teve a vida alterada para " + this.Vida);
        }
    }
}