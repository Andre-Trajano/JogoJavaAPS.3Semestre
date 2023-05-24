public abstract class Inimigo {
    protected int vida;
    protected int ataque;

    public Inimigo(int vida, int ataque) {
        this.vida = vida;
        this.ataque = ataque;

    }

    public abstract void atacar();

    public void receberDano(int dano) {
        int danoRecebido = dano;
        if (danoRecebido > 0) {
            vida -= danoRecebido;
            System.out.println("O inimigo recebeu " + danoRecebido + " de dano!");
        } else {
            System.out.println("O inimigo se defendeu do ataque!");
        }
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }
    
}