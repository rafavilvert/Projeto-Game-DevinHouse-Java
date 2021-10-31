package app;

import java.util.Scanner;
import java.util.Random;

import character.EnumCharacter;
import character.EnumCostume;
import character.EnumHelmet;
import character.EnumSex;
import character.EnumWeapon;
import character.Hero;
import character.Personage;
import gameAction.EnumGameAction;
import gameAction.Fight;

public class GameStep {
	int optionGame = 0;
	int levelGame = 0;
	int sexOption = 0;
	int characterOption = 0;
	int helmetOption = 0;
	int costumeOption = 0;
	int weaponOption = 0;
	int gameMotivation = 0;
	int chooseGameGoAheadOrGiveUp = 0;
	int chooseEnterTheDoor = 0;
	int chooseDoorToFight = 0;
	int doorKeys = 0;

	String heroName;
	String gameAction;
	String gameGoAheadOrGiveUp;
	String gameEnterTheDoor;

	EnumSex sex = EnumSex.MASCULINO;
	EnumCharacter character = EnumCharacter.ARQUEIRO;
	EnumHelmet helmet = EnumHelmet.ADAMANTIUM;
	EnumCostume costume = EnumCostume.ARMADURA;
	EnumWeapon weapon = EnumWeapon.ADAGA;

	Hero hero = new Hero();
	Personage armeiro = new Personage();
	Personage alquimista = new Personage();
	Personage poderosoChefao = new Personage();
	Fight combat = new Fight();
	Random random = new Random();

	int enterIntoGame = 0;
	Scanner entrada = new Scanner(System.in);

	public final static void clearConsole() {
		try {
			final String os = System.getProperty("os.name");

			if (os.contains("Windows")) {
				Runtime.getRuntime().exec("cls");
			} else {
				Runtime.getRuntime().exec("clear");
			}
		} catch (final Exception e) {
			// Handle any exceptions.
		}
	}

	public void start() {
		System.out.println("Escolha uma opção: 1 - Novo jogo 2 - Encerrar");
		optionGame = entrada.nextInt();
		switch (optionGame) {
		case 1: {
			System.out.println("╔══════•ೋೋ•══════╗ \n" + "    Seja bem vindo\n" + "       ao game \n"
					+ " Glory Of a Brave Hero!\n" + "╚══════•ೋೋ•══════╝\n\n");
			clearConsole();
			break;
		}
		default:
			System.out.println("Volte sempre");
			System.exit(0);
		}

	}

	public void chooseLevelGame() {

		while (levelGame != 1 && levelGame != 2 && levelGame != 3) {
			System.out.println("Escolha o nivel de dificuldade: \n" + "1 - Fácil\n" + "2 - Normal\n" + "3 - Difícil\n");
			levelGame = entrada.nextInt();
			switch (levelGame) {
			case 1:
				levelGame = 1;
				break;
			case 2:
				levelGame = 2;
				break;
			case 3:
				levelGame = 3;
				break;
			}
		}

	}

	public void chooseSex() {

		while (sexOption != 127) {
			System.out
					.println("Escolha o sexo do personagem: \n" + "1 - Masculino\n" + "2 - Feminino\n" + "3 - Outro\n");
			sexOption = entrada.nextInt();

			if (sexOption == 1) {
				sex = EnumSex.MASCULINO;
				sexOption = 127;
			} else if (sexOption == 2) {
				sex = EnumSex.FEMININO;
				sexOption = 127;
			} else if (sexOption == 3) {
				sex = EnumSex.OUTRO;
				sexOption = 127;
			} else {
				System.out.println("Digite uma opção válida\n");
			}
		}

	}

	public void chooseName() {
		System.out.println("Escolha o nome do personagem");
		heroName = entrada.next();
	}

	public Hero createHero() {

		while (sexOption != 127) {
			System.out
					.println("Escolha o sexo do personagem: \n" + "1 - Masculino\n" + "2 - Feminino\n" + "3 - Outro\n");
			sexOption = entrada.nextInt();

			if (sexOption == 1) {
				sex = EnumSex.MASCULINO;
				sexOption = 127;
			} else if (sexOption == 2) {
				sex = EnumSex.FEMININO;
				sexOption = 127;
			} else if (sexOption == 3) {
				sex = EnumSex.OUTRO;
				sexOption = 127;
			} else {
				System.out.println("Digite uma opção válida\n");
				sexOption = 0;
			}
		}

		while (characterOption != 127) {
			System.out.println("Escolha o seu personagem: \n" + "1 - GUERREIRO\n" + "2 - CAVALEIRO\n" + "3 - VIKING\n"
					+ "4 - ARQUEIRO\n" + "5 -EXTERMINADOR DO FUTURO \n");
			characterOption = entrada.nextInt();

			if (characterOption == 1) {
				character = EnumCharacter.GUERREIRO;

				while (helmetOption != 127) {
					System.out.println("Escolha o capacete do personagem\n" + "1 - OURO\n" + "2 - DIAMANTE\n"
							+ "3 - ADAMANTIUM\n");
					helmetOption = entrada.nextInt();
					if (helmetOption == 1) {
						helmet = EnumHelmet.OURO;
						helmetOption = 127;
					} else if (helmetOption == 2) {
						helmet = EnumHelmet.DIAMANTE;
						helmetOption = 127;
					} else if (helmetOption == 3) {
						helmet = EnumHelmet.ADAMANTIUM;
						helmetOption = 127;
					} else {
						System.out.println("Digite uma opção válida\n");
					}
				}

				while (costumeOption != 127) {
					System.out.println(
							"Escolha a armadura do personagem\n" + "1 - ARMADURA\n" + "2 - HEROI\n" + "3 - CAMPONES\n");
					costumeOption = entrada.nextInt();
					if (costumeOption == 1) {
						costume = EnumCostume.ARMADURA;
						costumeOption = 127;
					} else if (costumeOption == 2) {
						costume = EnumCostume.HEROI;
						costumeOption = 127;
					} else if (costumeOption == 3) {
						costume = EnumCostume.CAMPONES;
						costumeOption = 127;
					} else {
						System.out.println("Digite uma opção válida\n");
					}
				}

				while (weaponOption != 127) {
					System.out.println(
							"Escolha a arma do personagem\n" + "1 - EXCALIBUR\n" + "2 - SAMURAI\n" + "3 - ADAGA\n");
					weaponOption = entrada.nextInt();
					if (weaponOption == 1) {
						weapon = EnumWeapon.EXCALIBUR;
						weaponOption = 127;
					} else if (weaponOption == 2) {
						weapon = EnumWeapon.SAMURAI;
						weaponOption = 127;
					} else if (weaponOption == 3) {
						weapon = EnumWeapon.ADAGA;
						weaponOption = 127;
					} else {
						System.out.println("Digite uma opção válida\n");
					}
				}
				characterOption = 127;
			} else if (characterOption == 2) {
				character = EnumCharacter.CAVALEIRO;

				while (helmetOption != 127) {
					System.out.println("Escolha o capacete do personagem\n" + "1 - OURO\n" + "2 - DIAMANTE\n"
							+ "3 - ADAMANTIUM\n");
					helmetOption = entrada.nextInt();
					if (helmetOption == 1) {
						helmet = EnumHelmet.OURO;
						helmetOption = 127;
					} else if (helmetOption == 2) {
						helmet = EnumHelmet.DIAMANTE;
						helmetOption = 127;
					} else if (helmetOption == 3) {
						helmet = EnumHelmet.ADAMANTIUM;
						helmetOption = 127;
					} else {
						System.out.println("Digite uma opção válida\n");
					}
				}

				while (costumeOption != 127) {
					System.out.println(
							"Escolha a armadura do personagem\n" + "1 - ARMADURA\n" + "2 - HEROI\n" + "3 - CAMPONES\n");
					costumeOption = entrada.nextInt();
					if (costumeOption == 1) {
						costume = EnumCostume.ARMADURA;
						costumeOption = 127;
					} else if (costumeOption == 2) {
						costume = EnumCostume.HEROI;
						costumeOption = 127;
					} else if (costumeOption == 3) {
						costume = EnumCostume.CAMPONES;
						costumeOption = 127;
					} else {
						System.out.println("Digite uma opção válida");
					}
				}

				while (weaponOption != 127) {
					System.out.println("Escolha o cavalo do personagem\n" + "1 - PEGASUS\n" + "2 - CAVALO DE FOGO\n"
							+ "3 - PÉ DE PANO\n");
					weaponOption = entrada.nextInt();
					if (weaponOption == 1) {
						weapon = EnumWeapon.PEGASUS;
						weaponOption = 127;
					} else if (weaponOption == 2) {
						weapon = EnumWeapon.CAVALO_DE_FOGO;
						weaponOption = 127;
					} else if (weaponOption == 3) {
						weapon = EnumWeapon.PE_DE_PANO;
						weaponOption = 127;
					} else {
						System.out.println("Digite uma opção válida\n");
					}
				}
				characterOption = 127;
			} else if (characterOption == 3) {
				character = EnumCharacter.VIKING;

				while (helmetOption != 127) {
					System.out.println("Escolha o capacete do personagem\n" + "1 - OURO\n" + "2 - DIAMANTE\n"
							+ "3 - ADAMANTIUM\n");
					helmetOption = entrada.nextInt();
					if (helmetOption == 1) {
						helmet = EnumHelmet.OURO;
						helmetOption = 127;
					} else if (helmetOption == 2) {
						helmet = EnumHelmet.DIAMANTE;
						helmetOption = 127;
					} else if (helmetOption == 3) {
						helmet = EnumHelmet.ADAMANTIUM;
						helmetOption = 127;
					} else {
						System.out.println("Digite uma opção válida\n");
					}
				}

				while (costumeOption != 127) {
					System.out.println(
							"Escolha a armadura do personagem\n" + "1 - ARMADURA\n" + "2 - HEROI\n" + "3 - CAMPONES\n");
					costumeOption = entrada.nextInt();
					if (costumeOption == 1) {
						costume = EnumCostume.ARMADURA;
						costumeOption = 127;
					} else if (costumeOption == 2) {
						costume = EnumCostume.HEROI;
						costumeOption = 127;
					} else if (costumeOption == 3) {
						costume = EnumCostume.CAMPONES;
						costumeOption = 127;
					} else {
						System.out.println("Digite uma opção válida\n");
					}
				}

				while (weaponOption != 127) {
					System.out.println(
							"Escolha a arma do personagem\n" + "1 - MACHADO\n" + "2 - MARTELO\n" + "3 - ESCUDO\n");
					weaponOption = entrada.nextInt();
					if (weaponOption == 1) {
						weapon = EnumWeapon.MACHADO;
						weaponOption = 127;
					} else if (weaponOption == 2) {
						weapon = EnumWeapon.MARTELO;
						weaponOption = 127;
					} else if (weaponOption == 3) {
						weapon = EnumWeapon.ESCUDO;
						weaponOption = 127;
					} else {
						System.out.println("Digite uma opção válida\n");
					}
				}
				characterOption = 127;
			} else if (characterOption == 4) {
				character = EnumCharacter.ARQUEIRO;

				while (helmetOption != 127) {
					System.out.println("Escolha o capacete do personagem\n" + "1 - OURO\n" + "2 - DIAMANTE\n"
							+ "3 - ADAMANTIUM\n");
					helmetOption = entrada.nextInt();
					if (helmetOption == 1) {
						helmet = EnumHelmet.OURO;
						helmetOption = 127;
					} else if (helmetOption == 2) {
						helmet = EnumHelmet.DIAMANTE;
						helmetOption = 127;
					} else if (helmetOption == 3) {
						helmet = EnumHelmet.ADAMANTIUM;
						helmetOption = 127;
					} else {
						System.out.println("Digite uma opção válida\n");
					}
				}

				while (costumeOption != 127) {
					System.out.println(
							"Escolha a armadura do personagem\n" + "1 - ARMADURA\n" + "2 - HEROI\n" + "3 - CAMPONES\n");
					costumeOption = entrada.nextInt();
					if (costumeOption == 1) {
						costume = EnumCostume.ARMADURA;
						costumeOption = 127;
					} else if (costumeOption == 2) {
						costume = EnumCostume.HEROI;
						costumeOption = 127;
					} else if (costumeOption == 3) {
						costume = EnumCostume.CAMPONES;
						costumeOption = 127;
					} else {
						System.out.println("Digite uma opção válida\n");
					}
				}

				while (weaponOption != 127) {
					System.out.println("Escolha a arma do personagem\n" + "1 - FLEXAS DE AÇO\n" + "2 - FLEXAS DE FOGO\n"
							+ "3 - BESTA\n");
					weaponOption = entrada.nextInt();
					if (weaponOption == 1) {
						weapon = EnumWeapon.FLEXAS_DE_ACO;
						weaponOption = 127;
					} else if (weaponOption == 2) {
						weapon = EnumWeapon.FLEXAS_DE_FOGO;
						weaponOption = 127;
					} else if (weaponOption == 3) {
						weapon = EnumWeapon.BESTA;
						weaponOption = 127;
					} else {
						System.out.println("Digite uma opção válida\n");
					}
				}
				characterOption = 127;
			} else if (characterOption == 5) {
				character = EnumCharacter.EXTERMINADOR_DO_FUTURO;

				while (helmetOption != 127) {
					System.out.println("Escolha o capacete do personagem\n" + "1 - OURO\n" + "2 - DIAMANTE\n"
							+ "3 - ADAMANTIUM\n");
					helmetOption = entrada.nextInt();
					if (helmetOption == 1) {
						helmet = EnumHelmet.OURO;
						helmetOption = 127;
					} else if (helmetOption == 2) {
						helmet = EnumHelmet.DIAMANTE;
						helmetOption = 127;
					} else if (helmetOption == 3) {
						helmet = EnumHelmet.ADAMANTIUM;
						helmetOption = 127;
					} else {
						System.out.println("Digite uma opção válida");
					}
				}

				while (costumeOption != 127) {
					System.out.println(
							"Escolha a armadura do personagem\n" + "1 - ARMADURA\n" + "2 - HEROI\n" + "3 - CAMPONES\n");
					costumeOption = entrada.nextInt();
					if (costumeOption == 1) {
						costume = EnumCostume.ARMADURA;
						costumeOption = 127;
					} else if (costumeOption == 2) {
						costume = EnumCostume.HEROI;
						costumeOption = 127;
					} else if (costumeOption == 3) {
						costume = EnumCostume.CAMPONES;
						costumeOption = 127;
					} else {
						System.out.println("Digite uma opção válida\n");
					}
				}

				while (weaponOption != 127) {
					System.out.println("Escolha a arma do personagem\n" + "1 - ESPINGARDA\n" + "2 - METRALHADORA\n"
							+ "3 - PISTOLA\n");
					weaponOption = entrada.nextInt();
					if (weaponOption == 1) {
						weapon = EnumWeapon.ESPINGARDA;
						weaponOption = 127;
					} else if (weaponOption == 2) {
						weapon = EnumWeapon.METRALHADORA;
						weaponOption = 127;
					} else if (weaponOption == 3) {
						weapon = EnumWeapon.PISTOLA;
						weaponOption = 127;
					} else {
						System.out.println("Digite uma opção válida\n");
					}
				}
				characterOption = 127;
			}
		}

		characterOption = 127;
		enterIntoGame = 2;
		return hero = new Hero(heroName, sex, character, helmet, helmet.getDano(), costume, costume.getDano(), weapon,
				weapon.getDano());

	}

	public void gameIntroduction() {
		System.out.println(EnumGameAction.GAME_INTRODUCTION.getMessage());
		System.out.println(
				"Escolha sua motivação para invadir a caverna do inimigo e derrotá-lo: \n1 - Vingança\n2 - Glória");
		gameMotivation = entrada.nextInt();
		if (gameMotivation == 1) {
			gameAction = EnumGameAction.VINGANCA.getMessage();
			System.out.println(gameAction);
		} else if (gameMotivation == 1) {
			gameAction = EnumGameAction.GLORIA.getMessage();
			System.out.println(gameAction);
		}
	}

	public void goAheadOrGiveUp() {
		System.out.println(EnumGameAction.AFTER_CHOOSE_MOTIVATION.getMessage());
		System.out.println("Qual seu caminho: \n1 - Seguir em frente\n2 - Desistir feito um covarde");
		chooseGameGoAheadOrGiveUp = entrada.nextInt();
		if (chooseGameGoAheadOrGiveUp == 1) {
			gameGoAheadOrGiveUp = EnumGameAction.SEGUIR.getMessage();
			System.out.println(gameGoAheadOrGiveUp);
		} else {
			gameGoAheadOrGiveUp = EnumGameAction.DESISTIR.getMessage();
			System.out.println(gameGoAheadOrGiveUp);
			System.exit(0);
		}
	}

	public void enterTheDoor() {
		int diceRollDamageHero;
		System.out.println(EnumGameAction.AFTER_CHOOSE_GO_OR_GIVEUP.getMessage());
		System.out.println("\nEntrar pela porta: \n1 - Saltando\n2 - Andando\n3 - Correndo");
		chooseEnterTheDoor = entrada.nextInt();
		if (chooseEnterTheDoor == 1) {
			gameEnterTheDoor = EnumGameAction.SALTANDO.getMessage();
			System.out.println(gameEnterTheDoor);
		} else if (chooseEnterTheDoor == 2) {
			gameEnterTheDoor = EnumGameAction.ANDANDO.getMessage();
			System.out.println(gameEnterTheDoor);
			diceRollDamageHero = random.nextInt(10);
			hero.setLife(100.0 - diceRollDamageHero);
			System.out.println("E você sofre um dano de: " + diceRollDamageHero);
			System.out.println("A vida do Heroi fica em: " + hero.getLife());
		} else if (chooseEnterTheDoor == 3) {
			gameEnterTheDoor = EnumGameAction.CORRENDO.getMessage();
			System.out.println(gameEnterTheDoor);
		}
	}

	public void chooseADoorToFight() {
		int rightDoor = 0;
		int leftDoor = 0;
		int mainDoor = 0;
		int aceptGift = 0;

		System.out.println(EnumGameAction.AFTER_CHOOSE_ENTER_DOOR_WAY.getMessage());

		while (mainDoor == 0) {
			if (rightDoor == 0 && leftDoor == 0 && mainDoor == 0) {
				System.out.println(
						"Escolha em qual porta você deseja entrar primeiro: \n1 - Porta à direita\n2 - Porta ao centro\n3 - Porta à esquerda");
				chooseDoorToFight = entrada.nextInt();
			} else if (rightDoor == 1 && leftDoor == 0 && mainDoor == 0) {
				System.out.println(
						"Escolha em qual porta você deseja entrar: \n2 - Porta ao centro\n3 - Porta à esquerda");
				chooseDoorToFight = entrada.nextInt();
			} else if (rightDoor == 0 && leftDoor == 1 && mainDoor == 0) {
				System.out.println(
						"Escolha em qual porta você deseja entrar: \n1 - Porta à direita\n2 - Porta ao centro");
				chooseDoorToFight = entrada.nextInt();
			} else {
				System.out.println("Muito bem você está na portal final digite: \n2 - para entrar");
				chooseDoorToFight = entrada.nextInt();
			}

			if (chooseDoorToFight == 1 && rightDoor == 0) {
				System.out.println(EnumGameAction.PORTA_DIREITA.getMessage());
				this.fightHeroAgainstArmeiro();
				System.out.println(EnumGameAction.AFTER_WON_RIGHT_DOOR.getMessage());
				System.out.println("\nEscolha pegar a armaduro do inimigo: \n1 - Sim\n2 - Não");
				
				aceptGift = entrada.nextInt();
				if (aceptGift == 1) {
					System.out.println(EnumGameAction.ACEPT_RIGHT_DOOR_GIFT.getMessage());
					hero.setTotaldamage(hero.getTotaldamage() + 5);
					System.out.println("Seu dano de ataque vai para " + hero.getTotaldamage());
					System.out.println(EnumGameAction.MESSAGE_KEYS_ARMEIRO.getMessage());
				} else {
					System.out.println(EnumGameAction.DONT_ACEPT_RIGHT_DOOR_GIFT.getMessage());
				}
				doorKeys += 1;
				rightDoor = 1;
			} else if (chooseDoorToFight == 2 && mainDoor ==0) {
				if (doorKeys == 2) {
					System.out.println(EnumGameAction.PORTA_PRINCIPAL.getMessage());
					this.fightHeroAgainstPoderosoChefao();
					if (gameAction == EnumGameAction.VINGANCA.getMessage()) {
						System.out.println(EnumGameAction.MESSAGE_FINAL_REVENGE.getMessage());
					} else {
						System.out.println(EnumGameAction.MESSAGE_FINAL_GLORY.getMessage());
					}
					mainDoor = 1;
				} else {
					System.out.println(
							"Você precisa derrotar os dois inimigos e pegar as chaves para poder enfrentar o Poderoso Chefão");
				}
			} else if (chooseDoorToFight == 3 && leftDoor == 0) {
				
				System.out.println(EnumGameAction.PORTA_ESQUERDA.getMessage());
				this.fightHeroAgainstAlquimista();
				System.out.println(EnumGameAction.AFTER_WON_LEFT_DOOR.getMessage());
				System.out.println("\nEscolha beber o líquido produzido pelo inimigo: \n1 - Sim\n2 - Não");
				aceptGift = entrada.nextInt();
				if (aceptGift == 1) {
					System.out.println(EnumGameAction.ACEPT_LEFT_DOOR_GIFT.getMessage());
					hero.setLife((100 - hero.getLife()) + hero.getLife());
					System.out.println("Vida do personagem " + hero.getLife());
					System.out.println(EnumGameAction.MESSAGE_KEYS_ALQUIMISTA.getMessage());
				} else {
					System.out.println(EnumGameAction.DONT_ACEPT_LEFT_DOOR_GIFT.getMessage());
				}
				doorKeys += 1;
				leftDoor = 1;
			}

		}

	}

	public void fightHeroAgainstArmeiro() {

		armeiro.createArmeiro();

		combat.fight(hero, armeiro, levelGame);

	}

	public void fightHeroAgainstAlquimista() {

		alquimista.createAlquimista();

		combat.fight(hero, alquimista, levelGame);

	}

	public void fightHeroAgainstPoderosoChefao() {

		poderosoChefao.createGodFather();

		combat.fight(hero, poderosoChefao, levelGame);

	}

	public void printHero() {
		System.out.println("Nome do heroi " + hero.getName());
		System.out.println("Vida do heroi " + hero.getLife());
		System.out.println("Arma do heroi " + hero.getWeaponOne());
	}
}
