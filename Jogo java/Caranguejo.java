public class Caranguejo extends Inimigo {
    public Caranguejo() {
        super(100, 20);
    }

    @Override
    public void atacar() {
        System.out.println("O caranguejo ataca com a garra!");
        Jogador jogador = new Jogador(null, 0, 0, 0);
		jogador.receberDano(20);
    }
}