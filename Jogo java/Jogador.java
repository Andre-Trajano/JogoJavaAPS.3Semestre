public class Jogador {
    private String nome;
    private int vida;
    protected int pontuacao;
    private int ataque;

    public Jogador(String nome, int vida, int pontuacao, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.pontuacao = pontuacao;
        this.ataque = ataque;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void perdeVida() {
        this.vida--;
    }
    //Incrementa ataque ao jogador de acordo com o item que ele está usando
    public void incrementarAtaque(Item item) {
        int incremento = item.getIncremento();
        this.ataque += incremento;
        System.out.println("O ataque do jogador foi incrementado em " + incremento);
    }
    public void usarItem(Item item) {
        incrementarAtaque(item);
        // Aqui da pra colocar outra lógica pro item, caso queira
    }
    public void receberDano(int dano) {
        if (dano > 0) {
            vida -= dano;
            System.out.println(nome + " recebeu " + dano + " de dano!");
        } else {
            System.out.println(nome + " se defendeu do ataque!");
        }
    }

    public void incrementarPontuacao(int pontos) {
        pontuacao += pontos;
    }


}
