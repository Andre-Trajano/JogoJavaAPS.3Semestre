

import java.util.Scanner;

public class jogo  {

    	
    //metodo que solicita o nome do jogador
	public static void IniciarJogo() {
		
		try (Scanner s1 = new Scanner(System.in)) {
			
			System.out.println("Seja bem vindo ao RPG Ambiental. \n");
	        String nomeJogador = solicitarNomeJogador();
			System.out.println("Perfeito, " + nomeJogador + "!");
			
			//String nome, int vidas, int pontuacao, int ataquebase//
			Jogador jogador = new Jogador(nomeJogador, 300, 0, 100);
			
	
			
			
			
			
			boolean continuaJogo = true;
			int caminhouPelaCidade = 1;
	
			while (continuaJogo) {
				
					imprimirmenu();
				
					int escolha = entrada();
	
					switch (escolha) {
					
					case 1:
						//acabou os eventos
						if (caminhouPelaCidade>9) {
							System.out.println("Você nao tem mais o que fazer na cidade, acabou o jogo.");
							continuaJogo = false;
							break;
						}
						
						//primeiro evento
						if (caminhouPelaCidade==1) {
							System.out.println("Você caminhou pela cidade e encontrou lixo nas ruas. O que você faz?");
							System.out.println("1 - Ignorar o lixo");
							System.out.println("2 - Recolher o lixo e jogar no lixo adequado");
	
							int varentrada = entrada();
							switch (varentrada) {
							
								case 1:
									System.out.println("Você ignorou o lixo. Nenhum ponto ganho.");
									caminhouPelaCidade++;
									break;
								case 2: 
									System.out.println("Você recolheu o lixo e jogou no lixo adequado. Pontos ganhos: 10");
									jogador.setPontuacao(jogador.getPontuacao() + 10);
									caminhouPelaCidade++;
									break;
								default:
									System.out.println("Opção inválida. Tente novamente.");
									break;
							}
						break;
						}
						
						//segundo evento
						if (caminhouPelaCidade==2) {
							System.out.println("Você caminhou pela cidade e encontrou um carro. O que você faz?");
							System.out.println("1 - pegar o carro");
							System.out.println("2 - ir andando");
	
							int varentrada1 = entrada();
							switch (varentrada1) {
								
								case 1:
									System.out.println("voce pegou o carro, nenhum ponto ganho. Nenhum ponto ganho.");
									caminhouPelaCidade++;
									break;
								case 2: 
									System.out.println("Você foi andando. Pontos ganhos: 10");
									jogador.setPontuacao(jogador.getPontuacao() + 10);
									caminhouPelaCidade++;
									break;
								default:
									System.out.println("Opção inválida. Tente novamente.");
									break;
							}
						break;
						}
							
						//terceiro evento
						if (caminhouPelaCidade==3) {
							System.out.println("Voce encontrou um item:");
							System.out.println("1 - pegar item");
							System.out.println("2 - nao pegar");
							
							int varentrada2 = entrada();
							switch (varentrada2) {
								
								case 1:
									System.out.println("Voce pegou o item, ganhou +100 de atk");
									jogador.setAtaque(jogador.getAtaque() + 100);
									caminhouPelaCidade++;
									break;
								case 2: 
									System.out.println("Voce retorna para a cidade!");
									caminhouPelaCidade++;
									break;
								default:
									System.out.println("Opção inválida. Tente novamente.");
									break;
							}
						break;
						}
						//quarto evento
						if (caminhouPelaCidade==4) {
							System.out.println("Você chegou a um parque e há voluntários pedindo ajuda para catar o lixo na rua.");
					        System.out.println("1 - Ajudar os voluntários");
					        System.out.println("2 - Ignorar e seguir em frente");
	
	
								int resposta = entrada();
	
								switch (resposta) {
								case 1:
								    System.out.println("Você decidiu ajudar os voluntários!");
								    jogador.setPontuacao(jogador.getPontuacao() + 10);
								    System.out.println("Você ganhou 10 pontos!");
								    caminhouPelaCidade++;
								    break;
								case 2:
								    System.out.println("Você escolheu não ajudar os voluntários.");
								    jogador.setPontuacao(jogador.getPontuacao() - 5);
								    System.out.println("Você perdeu 5 pontos!");
								    caminhouPelaCidade++;
								    break;
								default:
							        System.out.println("Opção inválida!");
							        break;
								}
								
				        break;
						}
						//quinto evento
						if (caminhouPelaCidade==5) {
							System.out.println("Você se depara com uma criança segurando um papel amassado.");
					        System.out.println("A criança está em dúvida sobre em qual lata de lixo deve jogar o papel.");
					        System.out.println("Escolha a opção correta para ajudar a criança:");
	
					        System.out.println("1 - Jogar no chão");
					        System.out.println("2 - Jogar na lixeira reciclável");
					        System.out.println("3 - Jogar na lixeira de orgânicos");
	
								int opcao = entrada();
	
								switch (opcao) {
								    case 1:
								        System.out.println("Você escolheu jogar o papel no chão.");
								        System.out.println("Um guarda se aproxima e diz: 'Isso não está correto!'");
								        System.out.println("Você não ganhou nenhum ponto.");
								        caminhouPelaCidade++;
								        break;
								    case 2:
								        System.out.println("Você escolheu jogar o papel na lixeira reciclável.");
								        System.out.println("A criança joga o papel na lixeira correta.");
								        System.out.println("Você ganhou 20 pontos! Pontuação atual: " + jogador.getPontuacao());
								        caminhouPelaCidade++;
								        break;
								    case 3:
								        System.out.println("Você escolheu jogar o papel na lixeira de orgânicos.");
								        System.out.println("Um guarda se aproxima e diz: 'Isso não está correto!'");
								        System.out.println("Você não ganhou nenhum ponto.");
								        caminhouPelaCidade++;
								        break;
								    default:
								        System.out.println("Opção inválida!");
								        break;
								}
						break;
						}
						//sexto evento
						if (caminhouPelaCidade==6) {
							System.out.println("Você está em frente ao Museu da Natureza.");
					        System.out.println("Deseja entrar no museu?");
	
					        System.out.println("1 - Sim");
					        System.out.println("2 - Não");
	
								int opcao = entrada();
	
								switch (opcao) {
								    case 1:
								        System.out.println("Você decidiu entrar no museu.");
								        System.out.println("Parabéns por buscar aprender mais sobre a natureza!");
								        System.out.println("Você ganhou 20 pontos! Pontuação atual: " + jogador.getPontuacao());
								        caminhouPelaCidade++;
								        break;
								    case 2:
								        System.out.println("Você decidiu não entrar no museu.");
								        System.out.println("Que pena! O museu poderia lhe proporcionar uma experiência interessante.");
								        caminhouPelaCidade++;
								        break;
								    default:
								        System.out.println("Opção inválida!");
								        break;
								}
						break;
						}
						if (caminhouPelaCidade==7) {
							System.out.println("Você está chegando perto da praia e encontra uma gaivota presa em uma sacola rasgada.");
					        System.out.println("O que você deseja fazer?");
	
					        System.out.println("1 - Ajudar a gaivota a voar novamente");
					        System.out.println("2 - Ignorar a gaivota e seguir em frente");
	
								int opcao = entrada();
	
								switch (opcao) {
								    case 1:
								        System.out.println("Você decide ajudar a gaivota a voar novamente.");
								        System.out.println("Parabéns por sua compaixão e cuidado com a natureza!");
								        System.out.println("Você ganhou 20 pontos! Pontuação atual: " + jogador.getPontuacao());
								        caminhouPelaCidade++;
								        break;
								    case 2:
								        System.out.println("Você decide ignorar a gaivota e seguir em frente.");
								        System.out.println("Que pena! Talvez a gaivota precisasse de sua ajuda.");
								        caminhouPelaCidade++;
								        break;
								    default:
								        System.out.println("Opção inválida!");
								        break;
								}
					    break;
						}
						if (caminhouPelaCidade==8) {
							EventoPraia eventoPraia = new EventoPraia(jogador);
					        eventoPraia.iniciarEvento();
					        System.out.println("Essa foi por pouco! Continue seu caminho!");
					        caminhouPelaCidade++;
					        break;
						}
						//
						if (caminhouPelaCidade==9) {
							System.out.println("Voce caminho pela cidade e encontrou e caiu dentro de um esgoto.");
							System.out.println("Existe 4 caminhos:");
							System.out.println("1 - Tentar subir a escada acima e voltar para a rua");
							System.out.println("2 - Ir pela DIREITA");
							System.out.println("3 - Ir pela ESQUERDA");
							System.out.println("4 - Seguir RETO ");
							
							int varentrada2 = entrada();
							switch (varentrada2) {
								
								case 1:
									System.out.println("Voce cai ao tentar subir a escada e lesiona o joelho. Perca 50 de vida.\n");
									jogador.setAtaque(jogador.getVida() - 50);
									System.out.println("Existe 3 caminhos:");
									System.out.println("1 - Ir pela DIREITA");
									System.out.println("2 - Ir pela ESQUERDA");
									System.out.println("3 - Seguir RETO ");
									
									int varentrada3 = entrada();
									switch (varentrada3) {
										case 1:
											System.out.println("Andando pela direita...");
											System.out.println("Voce encontra um bau estranho, oque quer fazer?");
											System.out.println("1 - Abrir Bau");
											System.out.println("2 - Ignorar o Bau");
	
											int varentrada4 = entrada();
											switch (varentrada4) {
												case 1:
													System.out.println("Voce abriu o bau e morreu.");
													System.out.println("Fim do jogo!");
													continuaJogo = false;
													break;
												
												case 2:
													System.out.println("Voce continua andando e acha uma escada com dois caminhos, um para cima e outro para baixo:");
													System.out.println("1 - Usar escada para CIMA");
													System.out.println("2 - Usar escada para BAIXO");
													
													int varentrada5 = entrada();
													switch (varentrada5) {
														case 1:
															System.out.println("1 - Voce voltou a superficie e ganhou 5 pontos pela aventura!");
															jogador.setPontuacao(jogador.getPontuacao() + 5);
															caminhouPelaCidade++;
															break;
														
														case 2:
															System.out.println("Voce se aventura na esgoto e encontra uma biblioteca!");
															System.out.println("1 - Ler Livros");
															System.out.println("2 - Vasculhar");
															System.out.println("3 - Verificar armadilhas");
															
															int varentrada6 = entrada();
															switch (varentrada6) {
																case 1:
																	System.out.println("Voce tropeçou numa armadilha e explodiu a sala!");
																	System.out.println("Fim do jogo!");
																	continuaJogo = false;
																	break;
																case 2:
																	System.out.println("Voce tropeçou numa armadilha e explodiu a sala!");
																	System.out.println("Fim do jogo!");
																	continuaJogo = false;
																	break;
																case 3:
																	System.out.println("Voce desarmou as armadilhas e agora esta seguro!");
																	System.out.println("Oque quer fazer agora?");
																	System.out.println("1 - Ler Livros");
																	System.out.println("2 - Vasculhar");
																	System.out.println("3 - Abrir bau no canto da sala");
																
															
																int varentrada7 = entrada();
																switch (varentrada7) {
																
																	case 1:
																		System.out.println("Voce encontrou o livro: O Codigo da Natureza!");
																		System.out.println("Ao ler voce compreendeu mais sobre o meio ambiente");
																		System.out.println("Voce ganhou 50 pontos por entender mais sobre a natureza.\n");
																		
																		jogador.setPontuacao(jogador.getPontuacao() + 50);
																		
																		System.out.println("Voce adormeçe e acaba retornando a cidade\n");
																		caminhouPelaCidade++;
																		break;
																		
																	case 2:
																		System.out.println("Voce encontrou uma adaga de folhas rigidas");
																		System.out.println("Por ser feita de plantas voce contribui com o meio ambiente");
																		System.out.println("Voce ganhou 25 pontos de aventura e 50 pontos de ataque");
																		jogador.setPontuacao(jogador.getPontuacao() + 25);
																		jogador.setAtaque(jogador.getAtaque() + 50);
																		
																		System.out.println("Voce adormeçe e acaba retornando a cidade\n");
																		caminhouPelaCidade++;
																		break;
																		
																	case 3:
		//aqui foi encontrado um inimigo, implementar combate
																		System.out.println("Voce adormeçe e acaba retornando a cidade\n");
																		caminhouPelaCidade++;
																		break;
																	default:
																		System.out.println("Opção inválida. Tente novamente.");
																		break;	
																}
																default:
																	System.out.println("Opção inválida. Tente novamente.");
																	break;
														}
														default:
															System.out.println("Opção inválida. Tente novamente.");
															break;
												}
												default:
													System.out.println("Opção inválida. Tente novamente.");
													break;
											}
																							
										case 2: 
											System.out.println("Indo pela esquerda voce segue um tunel que no final sai da repressa de agua da cidade");
											System.out.println("Voce percebe que nao tem tratamento de agua, tendo em vista que nao consegue resolver");
											System.out.println("esse problema sozinho, voce denuncia o prefeito da cidade no Ministerio Publico e ele");
											System.out.println("é indiciado a prisão perpetua e assim a cidade esta limpa e a população + saudavel.  ");
											System.out.println("Voce é um heroi, Parabens.");
											System.out.println("Fim do jogo!");
											continuaJogo = false;
											break;
																
										case 3:
											System.out.println("Ao seguir o caminho reto, voce se depara com outras 3 entradas:");
											System.out.println("Oque voce quer fazer?");
											System.out.println("1 - Usar escada para Direita");
											System.out.println("2 - Usar escada para Esquerda");
											System.out.println("3 - Usar escada para Reto");
											
											int varentrada9 = entrada();
											switch (varentrada9) {
												case 1:
													System.out.println("Ao caminhar pela passagem da direita, Voce encontra 3 portas.");
													System.out.println("Cada porta tem um misterio atras dela, então escolha sabiamente:");
													System.out.println("1 - A porta é de madeira!");
													System.out.println("2 - A porta é de ferro!");
													System.out.println("3 - A porta é de ouro!");
	
													
													int varentrada10 = entrada();
													switch (varentrada10) {	
													case 1:
														if (jogador.getAtaque()>=50) {
															System.out.println("VOCE CONSEGUE DERRUBAR A PORTA!!");
															System.out.println("Ao atravessar voce encontra uma central de tratamento de agua da cidade");
															System.out.println("Voce observa que exite uma alavanca acionado inserindo veneno na agua da cidade");
															System.out.println("Oque quer fazer diante a isso?");
															System.out.println("1 - Desativar alavanca");
															System.out.println("2 - Ignorar");
															
																int varentrada11 = entrada();
																switch (varentrada11) {	
																	case 1:
																		System.out.println("Voce é um heroi, como salvou o meio ambiente, Voce ganhou o jogo!!");
																		System.out.println("Fim do jogo!");
																		continuaJogo = false;
																		break;
																	case 2:
																		System.out.println("Voce é horrivel, como voce deixa sua familia tomar agua envenenada?.");
																		System.out.println("Fim do jogo!");
																		continuaJogo = false;
																		break;
																	default:
																		System.out.println("Opção inválida. Tente novamente.");
																		break;	
																}
														}
														else {
															System.out.println("Voce nao teve ataque o suficiente para derrubar a porta.");
															System.out.println("Voce bateu com a cabeça na porta e morre!");
															System.out.println("Fim do jogo!");
															continuaJogo = false;
															break;
														}
													case 2:
														if (jogador.getAtaque()>=100) {
															System.out.println("VOCE CONSEGUE DERRUBAR A PORTA!!");
															System.out.println("Ao atravessar voce encontra uma central de tratamento de agua da cidade");
															System.out.println("Voce observa que exite uma alavanca acionado inserindo veneno na agua da cidade");
															System.out.println("Oque quer fazer diante a isso?");
															System.out.println("1 - Desativar alavanca");
															System.out.println("2 - Ignorar");
															
																int varentrada11 = entrada();
																switch (varentrada11) {	
																	case 1:
																		System.out.println("Voce é um heroi, como salvou o meio ambiente, Voce ganhou o jogo!!");
																		System.out.println("Fim do jogo!");
																		continuaJogo = false;
																		break;
																	case 2:
																		System.out.println("Voce é horrivel, como voce deixa sua familia tomar agua envenenada?.");
																		System.out.println("Fim do jogo!");
																		continuaJogo = false;
																		break;
																	default:
																		System.out.println("Opção inválida. Tente novamente.");
																		break;	
																}
														}
														else {
															System.out.println("Voce nao teve ataque o suficiente para derrubar a porta.");
															System.out.println("Voce bateu com a cabeça na porta e morre!");
															System.out.println("Fim do jogo!");
															continuaJogo = false;
															break;
														}
													case 3:
														if (jogador.getAtaque()>=1000) {
															System.out.println("VOCE CONSEGUE DERRUBAR A PORTA!!");
															System.out.println("Ao atravessar voce encontra uma central de tratamento de agua da cidade");
															System.out.println("Voce observa que exite uma alavanca acionado inserindo veneno na agua da cidade");
															System.out.println("Oque quer fazer diante a isso?");
															System.out.println("1 - Desativar alavanca");
															System.out.println("2 - Ignorar");
															
																int varentrada11 = entrada();
																switch (varentrada11) {	
																	case 1:
																		System.out.println("Voce é um heroi, como salvou o meio ambiente, Voce ganhou o jogo!!");
																		System.out.println("Fim do jogo!");
																		continuaJogo = false;
																		break;
																	case 2:
																		System.out.println("Voce é horrivel, como voce deixa sua familia tomar agua envenenada?.");
																		System.out.println("Fim do jogo!");
																		continuaJogo = false;
																		break;
																	default:
																		System.out.println("Opção inválida. Tente novamente.");
																		break;	
																}
														}
														else {
															System.out.println("Voce nao teve ataque o suficiente para derrubar a porta.");
															System.out.println("Voce bateu com a cabeça na porta e morre!");
															System.out.println("Fim do jogo!");
															continuaJogo = false;
															break;
														}
													default:
														System.out.println("Opção inválida. Tente novamente.");
														break;
													}
												case 2:
													System.out.println("Voce foi reto e encontrou e escorreu para dentro de uma estação de tratamento de esgoto.");
													System.out.println("Sem conseguir voltar, voce se afoga e morre!");
													System.out.println("Fim do jogo!");
													continuaJogo = false;
													break;
												case 3:
													System.out.println("Voce foi a Esquerda e encontrou um bifurcação no caminho, oque quer fazer?");
													System.out.println("1 - Ir pelo caminho da Direita");
													System.out.println("2 - Ir pelo caminho da Esquerda");
													
														int varentrada12 = entrada();
														switch (varentrada12) {
															case 1:
																System.out.println("Voce foi pela direita, e aparentemente so existe uma opção:");
																System.out.println("A sua frente existe um buraco escuro que nao da para ver o fundo");
																System.out.println("Voce observa de onde veio e percebe que é muito ingreme, impossibilitando que volte da onde veio.");
																System.out.println("1 - Pular no buraco!");
																
																int varentrada13 = entrada();
																switch (varentrada13) {
																	case 1:
																		System.out.println("Aonde ja se viu pular assim em um buraco?");
																		System.out.println("Vocé é maluco?");
																		System.out.println("A agua do poço amorteçe sua queda.");
																		System.out.println("Sem conseguir voltar, sua energia se esvai e voce decide se afogar");
																		System.out.println("Fim do jogo!");
																		continuaJogo = false;
																	default:
																		System.out.println("Opção inválida. Tente novamente.");
																		break;
																}
															case 2:
																System.out.println("Voce foi pela esquerda, e agora tem 4 buracos no chão.");
																System.out.println("Todos os buracos  são escuro e nao da para ver o fundo");
																System.out.println("Voce observa de onde veio e percebe que é muito ingreme, impossibilitando que volte da onde veio.");
																System.out.println("1 - Pular no buraco 1!");
																System.out.println("2 - Pular no buraco 2!");
																System.out.println("3 - Pular no buraco 3!");
																System.out.println("4 - Pular no buraco 4!");
																
																int varentrada14 = entrada();
																switch (varentrada14) {
																	case 1:
																		System.out.println("Aonde ja se viu pular assim em um buraco?");
																		System.out.println("Vocé é maluco?");
																		System.out.println("A agua do poço amorteçe sua queda.");
																		System.out.println("Sem conseguir voltar, sua energia se esvai e voce decide se afogar");
																		System.out.println("Fim do jogo!");
																		continuaJogo = false;
																	case 2:
																		System.out.println("Voce entra no buraco e é um portal que te manda para outra dimensão");
																		System.out.println("Ao atravessar o portal, percebe que a dimensão é uma simbioze da natureza e da tecnologia");
																		System.out.println("Voce evolui junto com a natureza e sua nova terra e vira um cyborg da natureza");
																		System.out.println("Seu Sortudo!");
																		System.out.println("Fim do jogo!");
																		continuaJogo = false;
																	case 3:
																		System.out.println("Aonde ja se viu pular assim em um buraco?");
																		System.out.println("Vocé é maluco?");
																		System.out.println("A agua do poço amorteçe sua queda.");
																		System.out.println("Sem conseguir voltar, sua energia se esvai e voce decide se afogar");
																		System.out.println("Fim do jogo!");
																		continuaJogo = false;
																	case 4:
																		System.out.println("Aonde ja se viu pular assim em um buraco?");
																		System.out.println("Vocé é maluco?");
																		System.out.println("A agua do poço amorteçe sua queda.");
																		System.out.println("Sem conseguir voltar, sua energia se esvai e voce decide se afogar");
																		System.out.println("Fim do jogo!");
																		continuaJogo = false;
																	default:
																		System.out.println("Opção inválida. Tente novamente.");
																		break;
																}	
															default:
																System.out.println("Opção inválida. Tente novamente.");
																break;
														}
												default:
													System.out.println("Opção inválida. Tente novamente.");
													break;
											}	
										default:
											System.out.println("Opção inválida. Tente novamente.");
											break;
									}
								
								case 2: 
											System.out.println("Andando pela direita...");
											System.out.println("Voce encontra um bau estranho, oque quer fazer?");
											System.out.println("1 - Abrir Bau");
											System.out.println("2 - Ignorar o Bau");
	
											int varentrada4 = entrada();
											switch (varentrada4) {
												case 1:
													System.out.println("Voce abriu o bau e morreu.");
													System.out.println("Fim do jogo!");
													continuaJogo = false;
													break;
												
												case 2:
													System.out.println("Voce continua andando e acha uma escada com dois caminhos, um para cima e outro para baixo:");
													System.out.println("1 - Usar escada para CIMA");
													System.out.println("2 - Usar escada para BAIXO");
													
													int varentrada5 = entrada();
													switch (varentrada5) {
														case 1:
															System.out.println("1 - Voce voltou a superficie e ganhou 5 pontos pela aventura!");
															jogador.setPontuacao(jogador.getPontuacao() + 5);
															caminhouPelaCidade++;
															break;
														
														case 2:
															System.out.println("Voce se aventura na esgoto e encontra uma biblioteca!");
															System.out.println("1 - Ler Livros");
															System.out.println("2 - Vasculhar");
															System.out.println("3 - Verificar armadilhas");
															
															int varentrada6 = entrada();
															switch (varentrada6) {
																case 1:
																	System.out.println("Voce tropeçou numa armadilha e explodiu a sala!");
																	System.out.println("Fim do jogo!");
																	continuaJogo = false;
																	break;
																case 2:
																	System.out.println("Voce tropeçou numa armadilha e explodiu a sala!");
																	System.out.println("Fim do jogo!");
																	continuaJogo = false;
																	break;
																case 3:
																	System.out.println("Voce desarmou as armadilhas e agora esta seguro!");
																	System.out.println("Oque quer fazer agora?");
																	System.out.println("1 - Ler Livros");
																	System.out.println("2 - Vasculhar");
																	System.out.println("3 - Abrir bau no canto da sala");
																
															
																int varentrada7 = entrada();
																switch (varentrada7) {
																
																	case 1:
																		System.out.println("Voce encontrou o livro: O Codigo da Natureza!");
																		System.out.println("Ao ler voce compreendeu mais sobre o meio ambiente");
																		System.out.println("Voce ganhou 50 pontos por entender mais sobre a natureza.\n");
																		
																		jogador.setPontuacao(jogador.getPontuacao() + 50);
																		
																		System.out.println("Voce adormeçe e acaba retornando a cidade\n");
																		caminhouPelaCidade++;
																		break;
																		
																	case 2:
																		System.out.println("Voce encontrou uma adaga de folhas rigidas");
																		System.out.println("Por ser feita de plantas voce contribui com o meio ambiente");
																		System.out.println("Voce ganhou 25 pontos de aventura e 50 pontos de ataque");
																		jogador.setPontuacao(jogador.getPontuacao() + 25);
																		jogador.setAtaque(jogador.getAtaque() + 50);
																		
																		System.out.println("Voce adormeçe e acaba retornando a cidade\n");
																		caminhouPelaCidade++;
																		break;
																		
																	case 3:
		//aqui foi encontrado um inimigo, implementar combate
																		System.out.println("Voce adormeçe e acaba retornando a cidade\n");
																		caminhouPelaCidade++;
																		break;
																	default:
																		System.out.println("Opção inválida. Tente novamente.");
																		break;	
																}
																default:
																	System.out.println("Opção inválida. Tente novamente.");
																	break;
														}
														default:
															System.out.println("Opção inválida. Tente novamente.");
															break;
												}
												default:
													System.out.println("Opção inválida. Tente novamente.");
													break;
											}
									
								case 3: 
									System.out.println("Indo pela esquerda voce segue um tunel que no final sai da repressa de agua da cidade");
									System.out.println("Voce percebe que nao tem tratamento de agua, tendo em vista que nao consegue resolver");
									System.out.println("esse problema sozinho, voce denuncia o prefeito da cidade no Ministerio Publico e ele");
									System.out.println("é indiciado a prisão perpetua e assim a cidade esta limpa e a população + saudavel.  ");
									System.out.println("Voce é um heroi, Parabens.");
									System.out.println("Fim do jogo!");
									continuaJogo = false;
									break;
													
								case 4: 
									System.out.println("Ao seguir o caminho reto, voce se depara com outras 3 entradas:");
									System.out.println("Oque voce quer fazer?");
									System.out.println("1 - Usar escada para Direita");
									System.out.println("2 - Usar escada para Esquerda");
									System.out.println("3 - Usar escada para Reto");
									
									int varentrada9 = entrada();
									switch (varentrada9) {
										case 1:
											System.out.println("Ao caminhar pela passagem da direita, Voce encontra 3 portas.");
											System.out.println("Cada porta tem um misterio atras dela, então escolha sabiamente:");
											System.out.println("1 - A porta é de madeira!");
											System.out.println("2 - A porta é de ferro!");
											System.out.println("3 - A porta é de ouro!");
	
											
											int varentrada10 = entrada();
											switch (varentrada10) {	
											case 1:
												if (jogador.getAtaque()>=50) {
													System.out.println("VOCE CONSEGUE DERRUBAR A PORTA!!");
													System.out.println("Ao atravessar voce encontra uma central de tratamento de agua da cidade");
													System.out.println("Voce observa que exite uma alavanca acionado inserindo veneno na agua da cidade");
													System.out.println("Oque quer fazer diante a isso?");
													System.out.println("1 - Desativar alavanca");
													System.out.println("2 - Ignorar");
													
														int varentrada11 = entrada();
														switch (varentrada11) {	
															case 1:
																System.out.println("Voce é um heroi, como salvou o meio ambiente, Voce ganhou o jogo!!");
																System.out.println("Fim do jogo!");
																continuaJogo = false;
																break;
															case 2:
																System.out.println("Voce é horrivel, como voce deixa sua familia tomar agua envenenada?.");
																System.out.println("Fim do jogo!");
																continuaJogo = false;
																break;
															default:
																System.out.println("Opção inválida. Tente novamente.");
																break;	
														}
												}
												else {
													System.out.println("Voce nao teve ataque o suficiente para derrubar a porta.");
													System.out.println("Voce bateu com a cabeça na porta e morre!");
													System.out.println("Fim do jogo!");
													continuaJogo = false;
													break;
												}
											case 2:
												if (jogador.getAtaque()>=100) {
													System.out.println("VOCE CONSEGUE DERRUBAR A PORTA!!");
													System.out.println("Ao atravessar voce encontra uma central de tratamento de agua da cidade");
													System.out.println("Voce observa que exite uma alavanca acionado inserindo veneno na agua da cidade");
													System.out.println("Oque quer fazer diante a isso?");
													System.out.println("1 - Desativar alavanca");
													System.out.println("2 - Ignorar");
													
														int varentrada11 = entrada();
														switch (varentrada11) {	
															case 1:
																System.out.println("Voce é um heroi, como salvou o meio ambiente, Voce ganhou o jogo!!");
																System.out.println("Fim do jogo!");
																continuaJogo = false;
																break;
															case 2:
																System.out.println("Voce é horrivel, como voce deixa sua familia tomar agua envenenada?.");
																System.out.println("Fim do jogo!");
																continuaJogo = false;
																break;
															default:
																System.out.println("Opção inválida. Tente novamente.");
																break;	
														}
												}
												else {
													System.out.println("Voce nao teve ataque o suficiente para derrubar a porta.");
													System.out.println("Voce bateu com a cabeça na porta e morre!");
													System.out.println("Fim do jogo!");
													continuaJogo = false;
													break;
												}
											case 3:
												if (jogador.getAtaque()>=1000) {
													System.out.println("VOCE CONSEGUE DERRUBAR A PORTA!!");
													System.out.println("Ao atravessar voce encontra uma central de tratamento de agua da cidade");
													System.out.println("Voce observa que exite uma alavanca acionado inserindo veneno na agua da cidade");
													System.out.println("Oque quer fazer diante a isso?");
													System.out.println("1 - Desativar alavanca");
													System.out.println("2 - Ignorar");
													
														int varentrada11 = entrada();
														switch (varentrada11) {	
															case 1:
																System.out.println("Voce é um heroi, como salvou o meio ambiente, Voce ganhou o jogo!!");
																System.out.println("Fim do jogo!");
																continuaJogo = false;
																break;
															case 2:
																System.out.println("Voce é horrivel, como voce deixa sua familia tomar agua envenenada?.");
																System.out.println("Fim do jogo!");
																continuaJogo = false;
																break;
															default:
																System.out.println("Opção inválida. Tente novamente.");
																break;	
														}
												}
												else {
													System.out.println("Voce nao teve ataque o suficiente para derrubar a porta.");
													System.out.println("Voce bateu com a cabeça na porta e morre!");
													System.out.println("Fim do jogo!");
													continuaJogo = false;
													break;
												}
											default:
												System.out.println("Opção inválida. Tente novamente.");
												break;
											}
										case 2:
											System.out.println("Voce foi reto e encontrou e escorreu para dentro de uma estação de tratamento de esgoto.");
											System.out.println("Sem conseguir voltar, voce se afoga e morre!");
											System.out.println("Fim do jogo!");
											continuaJogo = false;
											break;
										case 3:
											System.out.println("Voce foi a Esquerda e encontrou um bifurcação no caminho, oque quer fazer?");
											System.out.println("1 - Ir pelo caminho da Direita");
											System.out.println("2 - Ir pelo caminho da Esquerda");
											
												int varentrada12 = entrada();
												switch (varentrada12) {
													case 1:
														System.out.println("Voce foi pela direita, e aparentemente so existe uma opção:");
														System.out.println("A sua frente existe um buraco escuro que nao da para ver o fundo");
														System.out.println("Voce observa de onde veio e percebe que é muito ingreme, impossibilitando que volte da onde veio.");
														System.out.println("1 - Pular no buraco!");
														
														int varentrada13 = entrada();
														switch (varentrada13) {
															case 1:
																System.out.println("Aonde ja se viu pular assim em um buraco?");
																System.out.println("Vocé é maluco?");
																System.out.println("A agua do poço amorteçe sua queda.");
																System.out.println("Sem conseguir voltar, sua energia se esvai e voce decide se afogar");
																System.out.println("Fim do jogo!");
																continuaJogo = false;
															default:
																System.out.println("Opção inválida. Tente novamente.");
																break;
														}
													case 2:
														System.out.println("Voce foi pela esquerda, e agora tem 4 buracos no chão.");
														System.out.println("Todos os buracos  são escuro e nao da para ver o fundo");
														System.out.println("Voce observa de onde veio e percebe que é muito ingreme, impossibilitando que volte da onde veio.");
														System.out.println("1 - Pular no buraco 1!");
														System.out.println("2 - Pular no buraco 2!");
														System.out.println("3 - Pular no buraco 3!");
														System.out.println("4 - Pular no buraco 4!");
														
														int varentrada14 = entrada();
														switch (varentrada14) {
															case 1:
																System.out.println("Aonde ja se viu pular assim em um buraco?");
																System.out.println("Vocé é maluco?");
																System.out.println("A agua do poço amorteçe sua queda.");
																System.out.println("Sem conseguir voltar, sua energia se esvai e voce decide se afogar");
																System.out.println("Fim do jogo!");
																continuaJogo = false;
															case 2:
																System.out.println("Voce entra no buraco e é um portal que te manda para outra dimensão");
																System.out.println("Ao atravessar o portal, percebe que a dimensão é uma simbioze da natureza e da tecnologia");
																System.out.println("Voce evolui junto com a natureza e sua nova terra e vira um cyborg da natureza");
																System.out.println("Seu Sortudo!");
																System.out.println("Fim do jogo!");
																continuaJogo = false;
															case 3:
																System.out.println("Aonde ja se viu pular assim em um buraco?");
																System.out.println("Vocé é maluco?");
																System.out.println("A agua do poço amorteçe sua queda.");
																System.out.println("Sem conseguir voltar, sua energia se esvai e voce decide se afogar");
																System.out.println("Fim do jogo!");
																continuaJogo = false;
															case 4:
																System.out.println("Aonde ja se viu pular assim em um buraco?");
																System.out.println("Vocé é maluco?");
																System.out.println("A agua do poço amorteçe sua queda.");
																System.out.println("Sem conseguir voltar, sua energia se esvai e voce decide se afogar");
																System.out.println("Fim do jogo!");
																continuaJogo = false;
															default:
																System.out.println("Opção inválida. Tente novamente.");
																break;
														}	
													default:
														System.out.println("Opção inválida. Tente novamente.");
														break;
												}
										default:
											System.out.println("Opção inválida. Tente novamente.");
											break;
									}	
								default:
									System.out.println("Opção inválida. Tente novamente.");
									break;		
							}
						break;
						}
						
					case 2:
						System.out.println("Esse jogo é um jogo MMO RPG, aonde sua função");
						System.out.println("é explorar o mapa e trabalhar para conseguir ");
						System.out.println("progredir no jogo e assim enfrentar inimigos\n");
						System.out.println("Ele se baseia em escolhas que afetam o rumo");
						System.out.println("de toda a historia. Tenha uma boa aventura!");
						break;
						
					case 3:
				    	System.out.println("\nConfira suas estatisticas abaixo:");
				    	System.out.println("Seu nome é     : " + nomeJogador);
				    	System.out.println("Seu ataque é   : " + jogador.getAtaque());
				    	System.out.println("Sua vida é     : " + jogador.getVida());
				    	System.out.println("Sua pontuação é: " + jogador.getPontuacao());
						break;
						
					case 4:
						System.out.println("Obrigado por jogar!");
						continuaJogo = false;
						break;
	
					default:
						System.out.println("Opção inválida. Tente novamente.");
						break;
					}
				}
			}
	}
	
	//metodo que solicita o nome do jogador
    public static String solicitarNomeJogador() {
        Scanner solnome = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome = solnome.nextLine();
        return nome;
    }
    
    //metodo que sol entrada para escolha se switch case
    public static int entrada() {
        Scanner solentrada = new Scanner(System.in);
        int entrada = solentrada.nextInt();
        return entrada;
    }
    
    //metodo que imprime o menu
    public static void imprimirmenu() {
    	System.out.println("\nEscolha o que deseja fazer:");
    	System.out.println("1 - Caminhar pela cidade");
    	System.out.println("2 - Como funciona o jogo?");
    	System.out.println("3 - Verificar seus Status");
    	System.out.println("4 - Sair do jogo");
    }
  

	
}