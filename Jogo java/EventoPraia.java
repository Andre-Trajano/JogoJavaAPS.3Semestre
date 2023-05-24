public class EventoPraia {
    private Jogador jogador;
    private Caranguejo caranguejo;

    public EventoPraia(Jogador jogador) {
        this.jogador = jogador;
        this.caranguejo = new Caranguejo();
    }

    public void iniciarEvento() {
        System.out.println("Um caranguejo surge em seu caminho! Prepare-se para a luta!");

        Luta luta = new Luta(jogador, caranguejo);
        boolean vitoria = luta.iniciarLuta();

        if (vitoria) {
            System.out.println("Você venceu o caranguejo!");
            jogador.incrementarPontuacao(20);
            System.out.println("Você ganhou 20 pontos! Pontuação atual: " + jogador.getPontuacao());
        } else {
            System.out.println("Você foi derrotado pelo caranguejo. Melhore suas habilidades para a próxima vez!");
        }
    }
}