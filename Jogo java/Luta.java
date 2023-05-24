import java.util.Random;
import java.util.Scanner;

public class Luta extends jogo{
    private Jogador jogador;
    private Inimigo inimigo;
    private Random random;
    private boolean lutaEmAndamento;

    private static final double CHANCE_FUGA = 0.1;

    public Luta(Jogador jogador, Inimigo inimigo) {
        this.jogador = jogador;
        this.inimigo = inimigo;
        this.random = new Random();
        this.lutaEmAndamento = true;
    }

    public boolean iniciarLuta() {
        System.out.println("Começou uma luta entre " + jogador.getNome() + " e " + inimigo.getClass().getSimpleName() + "!");
        System.out.println("Jogador: Vida=" + jogador.getVida() + " Ataque=" + jogador.getAtaque());
        System.out.println("Inimigo: Vida=" + inimigo.getVida() + " Ataque=" + inimigo.getAtaque());

			while (lutaEmAndamento) {
			    System.out.println("Escolha uma ação: (1) Atacar, (2) Fugir");
			    int escolha = entrada();

			    switch (escolha) {
			        case 1:
			            realizarAtaque();
			            break;
			        case 2:
			            tentarFugir();
			            break;
			        default:
			            System.out.println("Opção inválida! Tente novamente.");
			            break;
			    }
			}
		
        return jogador.getVida() > 0;
    }

    private void realizarAtaque() {
        int ataqueJogador = jogador.getAtaque();
        int ataqueInimigo = inimigo.getAtaque();

        System.out.println(jogador.getNome() + " atacou com " + ataqueJogador + " de dano.");
        inimigo.receberDano(ataqueJogador);

        if (inimigo.getVida() <= 0) {
            System.out.println("Você derrotou o " + inimigo.getClass().getSimpleName());
            lutaEmAndamento = false;
            return;
        }

        System.out.println(inimigo.getClass().getSimpleName() + " atacou com " + ataqueInimigo + " de dano.");
        jogador.receberDano(ataqueInimigo);

        if (jogador.getVida() <= 0) {
            System.out.println("Você foi derrotado pelo " + inimigo.getClass().getSimpleName());
            lutaEmAndamento = false;
        }
    }
//calcular a chance de fuga
    private void tentarFugir() {
        double chance = random.nextDouble();

        if (chance < CHANCE_FUGA) {
            System.out.println("Você conseguiu fugir da luta!");
            lutaEmAndamento = false;
        } else {
            System.out.println("Você não conseguiu fugir. O inimigo atacou com " + inimigo.getAtaque() + " de dano.");
            jogador.receberDano(inimigo.getAtaque());

            if (jogador.getVida() <= 0) {
                System.out.println("Você foi derrotado pelo " + inimigo.getClass().getSimpleName());
                lutaEmAndamento = false;
            }
        }
    }
}