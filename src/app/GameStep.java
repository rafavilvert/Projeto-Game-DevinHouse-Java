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
	private int optionGame = 0;
	private int levelGame = 0;
	private int sexOption = 0;
	private int characterOption = 0;
	private int helmetOption = 0;
	private int costumeOption = 0;
	private int weaponOption = 0;
	private int gameMotivation = 0;
	private int chooseGameGoAheadOrGiveUp = 0;
	private int chooseEnterTheDoor = 0;
	private int chooseDoorToFight = 0;
	private int doorKeys = 0;

	private String heroName;
	private String gameAction;
	private String gameGoAheadOrGiveUp;
	private String gameEnterTheDoor;

	private EnumSex sex = EnumSex.MASCULINO;
	private EnumCharacter character = EnumCharacter.ARQUEIRO;
	private EnumHelmet helmet = EnumHelmet.ADAMANTIUM;
	private EnumCostume costume = EnumCostume.ARMADURA;

	public int getOptionGame() {
		return optionGame;
	}

	public void setOptionGame(int optionGame) {
		this.optionGame = optionGame;
	}

	public int getLevelGame() {
		return levelGame;
	}

	public void setLevelGame(int levelGame) {
		this.levelGame = levelGame;
	}

	public int getSexOption() {
		return sexOption;
	}

	public void setSexOption(int sexOption) {
		this.sexOption = sexOption;
	}

	public int getCharacterOption() {
		return characterOption;
	}

	public void setCharacterOption(int characterOption) {
		this.characterOption = characterOption;
	}

	public int getHelmetOption() {
		return helmetOption;
	}

	public void setHelmetOption(int helmetOption) {
		this.helmetOption = helmetOption;
	}

	public int getCostumeOption() {
		return costumeOption;
	}

	public void setCostumeOption(int costumeOption) {
		this.costumeOption = costumeOption;
	}

	public int getWeaponOption() {
		return weaponOption;
	}

	public void setWeaponOption(int weaponOption) {
		this.weaponOption = weaponOption;
	}

	public int getGameMotivation() {
		return gameMotivation;
	}

	public void setGameMotivation(int gameMotivation) {
		this.gameMotivation = gameMotivation;
	}

	public int getChooseGameGoAheadOrGiveUp() {
		return chooseGameGoAheadOrGiveUp;
	}

	public void setChooseGameGoAheadOrGiveUp(int chooseGameGoAheadOrGiveUp) {
		this.chooseGameGoAheadOrGiveUp = chooseGameGoAheadOrGiveUp;
	}

	public int getChooseEnterTheDoor() {
		return chooseEnterTheDoor;
	}

	public void setChooseEnterTheDoor(int chooseEnterTheDoor) {
		this.chooseEnterTheDoor = chooseEnterTheDoor;
	}

	public int getChooseDoorToFight() {
		return chooseDoorToFight;
	}

	public void setChooseDoorToFight(int chooseDoorToFight) {
		this.chooseDoorToFight = chooseDoorToFight;
	}

	public int getDoorKeys() {
		return doorKeys;
	}

	public void setDoorKeys(int doorKeys) {
		this.doorKeys = doorKeys;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getGameAction() {
		return gameAction;
	}

	public void setGameAction(String gameAction) {
		this.gameAction = gameAction;
	}

	public String getGameGoAheadOrGiveUp() {
		return gameGoAheadOrGiveUp;
	}

	public void setGameGoAheadOrGiveUp(String gameGoAheadOrGiveUp) {
		this.gameGoAheadOrGiveUp = gameGoAheadOrGiveUp;
	}

	public String getGameEnterTheDoor() {
		return gameEnterTheDoor;
	}

	public void setGameEnterTheDoor(String gameEnterTheDoor) {
		this.gameEnterTheDoor = gameEnterTheDoor;
	}

	public EnumSex getSex() {
		return sex;
	}

	public void setSex(EnumSex sex) {
		this.sex = sex;
	}

	public EnumCharacter getCharacter() {
		return character;
	}

	public void setCharacter(EnumCharacter character) {
		this.character = character;
	}

	public EnumHelmet getHelmet() {
		return helmet;
	}

	public void setHelmet(EnumHelmet helmet) {
		this.helmet = helmet;
	}

	public EnumCostume getCostume() {
		return costume;
	}

	public void setCostume(EnumCostume costume) {
		this.costume = costume;
	}

	public EnumWeapon getWeapon() {
		return weapon;
	}

	public void setWeapon(EnumWeapon weapon) {
		this.weapon = weapon;
	}

	public Hero getHero() {
		return hero;
	}

	public void setHero(Hero hero) {
		this.hero = hero;
	}

	public Personage getArmeiro() {
		return armeiro;
	}

	public void setArmeiro(Personage armeiro) {
		this.armeiro = armeiro;
	}

	public Personage getAlquimista() {
		return alquimista;
	}

	public void setAlquimista(Personage alquimista) {
		this.alquimista = alquimista;
	}

	public Personage getPoderosoChefao() {
		return poderosoChefao;
	}

	public void setPoderosoChefao(Personage poderosoChefao) {
		this.poderosoChefao = poderosoChefao;
	}

	public Fight getCombat() {
		return combat;
	}

	public void setCombat(Fight combat) {
		this.combat = combat;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public int getEnterIntoGame() {
		return enterIntoGame;
	}

	public void setEnterIntoGame(int enterIntoGame) {
		this.enterIntoGame = enterIntoGame;
	}

	private EnumWeapon weapon = EnumWeapon.ADAGA;

	private Hero hero = new Hero();
	private Personage armeiro = new Personage();
	private Personage alquimista = new Personage();
	private Personage poderosoChefao = new Personage();
	private Fight combat = new Fight();
	private Random random = new Random();

	private int enterIntoGame = 0;
	Scanner entrada = new Scanner(System.in);

	public void start() {
		System.out.println("Escolha uma opção: 1 - Novo jogo 2 - Encerrar");
		setOptionGame(entrada.nextInt());
		switch (getOptionGame()) {
		case 1: {
			System.out.println("╔══════•ೋೋ•══════╗ \n" + "    Seja bem vindo\n" + "       ao game \n"
					+ " Glory Of a Brave Hero!\n" + "╚══════•ೋೋ•══════╝\n\n");
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
			setLevelGame(entrada.nextInt());
			switch (getLevelGame()) {
			case 1:
				setLevelGame(1);
				break;
			case 2:
				setLevelGame(2);
				break;
			case 3:
				setLevelGame(3);
				break;
			}
		}

	}

	public void chooseSex() {

		while (sexOption != 1 && sexOption != 2 && sexOption != 3) {
			System.out
					.println("Escolha o sexo do personagem: \n" + "1 - Masculino\n" + "2 - Feminino\n" + "3 - Outro\n");
			setSexOption(entrada.nextInt());

			switch (getSexOption()) {
			case 1:
				setSex(EnumSex.MASCULINO);
				setSexOption(1);
				break;
			case 2:
				setSex(EnumSex.FEMININO);
				setSexOption(2);
				break;
			case 3:
				setSex(EnumSex.OUTRO);
				setSexOption(3);
				break;

			default:
				System.out.println("Digite uma opção válida\n");
				break;
			}
		}

	}

	public void chooseName() {
		System.out.println("Digite o nome do personagem\n");
		setHeroName(entrada.next());
	}

	public Hero createHero() {

		while (getCharacterOption() != 1 && getCharacterOption() != 2 && getCharacterOption() != 3
				&& getCharacterOption() != 4 && getCharacterOption() != 5) {
			System.out.println("Escolha o seu personagem: \n" + "1 - GUERREIRO\n" + "2 - CAVALEIRO\n" + "3 - VIKING\n"
					+ "4 - ARQUEIRO\n" + "5 - EXTERMINADOR DO FUTURO \n");
			setCharacterOption(entrada.nextInt());

			if (getCharacterOption() == 1) {
				setCharacter(EnumCharacter.GUERREIRO);

				while (getHelmetOption() != 1 && getHelmetOption() != 2 && getHelmetOption() != 3) {
					System.out.println("Escolha o capacete do personagem\n" + "1 - OURO\n" + "2 - DIAMANTE\n"
							+ "3 - ADAMANTIUM\n");
					setHelmetOption(entrada.nextInt());

					switch (helmetOption) {
					case 1:
						setHelmet(EnumHelmet.OURO);
						break;
					case 2:
						setHelmet(EnumHelmet.DIAMANTE);
						break;
					case 3:
						setHelmet(EnumHelmet.ADAMANTIUM);
						break;

					default:
						System.out.println("Digite uma opção válida\n");
						break;
					}

				}

				while (getCostumeOption() != 1 && getCostumeOption() != 2 && getCostumeOption() != 3) {
					System.out.println(
							"Escolha a armadura do personagem\n" + "1 - ARMADURA\n" + "2 - HEROI\n" + "3 - CAMPONES\n");
					setCostumeOption(entrada.nextInt());

					switch (getCostumeOption()) {
					case 1:
						setCostume(EnumCostume.ARMADURA);
						break;
					case 2:
						setCostume(EnumCostume.HEROI);
						break;
					case 3:
						setCostume(EnumCostume.CAMPONES);
						break;

					default:
						System.out.println("Digite uma opção válida\n");
						break;
					}

				}

				while (getWeaponOption() != 1 && getWeaponOption() != 2 && getWeaponOption() != 3) {
					System.out.println(
							"Escolha a arma do personagem\n" + "1 - EXCALIBUR\n" + "2 - SAMURAI\n" + "3 - ADAGA\n");
					setWeaponOption(entrada.nextInt());

					switch (getWeaponOption()) {
					case 1:
						setWeapon(EnumWeapon.EXCALIBUR);
						break;
					case 2:
						setWeapon(EnumWeapon.SAMURAI);
						break;
					case 3:
						setWeapon(EnumWeapon.ADAGA);
						break;

					default:
						System.out.println("Digite uma opção válida\n");
						break;
					}

				}

			} else if (getCharacterOption() == 2) {
				setCharacter(EnumCharacter.CAVALEIRO);

				while (getHelmetOption() != 1 && getHelmetOption() != 2 && getHelmetOption() != 3) {
					System.out.println("Escolha o capacete do personagem\n" + "1 - OURO\n" + "2 - DIAMANTE\n"
							+ "3 - ADAMANTIUM\n");
					setHelmetOption(entrada.nextInt());

					switch (getHelmetOption()) {
					case 1:
						setHelmet(EnumHelmet.OURO);
						break;
					case 2:
						setHelmet(EnumHelmet.DIAMANTE);
						break;
					case 3:
						setHelmet(EnumHelmet.ADAMANTIUM);
						break;

					default:
						System.out.println("Digite uma opção válida\n");
						break;
					}

				}

				while (getCostumeOption() != 1 && getCostumeOption() != 2 && getCostumeOption() != 3) {
					System.out.println(
							"Escolha a armadura do personagem\n" + "1 - ARMADURA\n" + "2 - HEROI\n" + "3 - CAMPONES\n");
					setCostumeOption(entrada.nextInt());

					switch (getCostumeOption()) {
					case 1:
						setCostume(EnumCostume.ARMADURA);
						break;
					case 2:
						setCostume(EnumCostume.HEROI);
						break;
					case 3:
						setCostume(EnumCostume.CAMPONES);
						break;

					default:
						System.out.println("Digite uma opção válida\n");
						break;
					}

				}

				while (getWeaponOption() != 1 && getWeaponOption() != 2 && getWeaponOption() != 3) {
					System.out.println("Escolha o cavalo do personagem\n" + "1 - PEGASUS\n" + "2 - CAVALO DE FOGO\n"
							+ "3 - PÉ DE PANO\n");
					setWeaponOption(entrada.nextInt());

					switch (getWeaponOption()) {
					case 1:
						setWeapon(EnumWeapon.PEGASUS);
						break;
					case 2:
						setWeapon(EnumWeapon.CAVALO_DE_FOGO);
						break;
					case 3:
						setWeapon(EnumWeapon.PE_DE_PANO);
						break;

					default:
						System.out.println("Digite uma opção válida\n");
						break;
					}

				}

			} else if (getCharacterOption() == 3) {
				setCharacter(EnumCharacter.VIKING);

				while (getHelmetOption() != 1 && getHelmetOption() != 2 && getHelmetOption() != 3) {
					System.out.println("Escolha o capacete do personagem\n" + "1 - OURO\n" + "2 - DIAMANTE\n"
							+ "3 - ADAMANTIUM\n");
					setHelmetOption(entrada.nextInt());

					switch (getHelmetOption()) {
					case 1:
						setHelmet(EnumHelmet.OURO);
						break;
					case 2:
						setHelmet(EnumHelmet.DIAMANTE);
						break;
					case 3:
						setHelmet(EnumHelmet.ADAMANTIUM);
						break;

					default:
						System.out.println("Digite uma opção válida\n");
						break;
					}

				}

				while (getCostumeOption() != 1 && getCostumeOption() != 2 && getCostumeOption() != 3) {
					System.out.println(
							"Escolha a armadura do personagem\n" + "1 - ARMADURA\n" + "2 - HEROI\n" + "3 - CAMPONES\n");
					setCostumeOption(entrada.nextInt());

					switch (getCostumeOption()) {
					case 1:
						setCostume(EnumCostume.ARMADURA);
						break;
					case 2:
						setCostume(EnumCostume.HEROI);
						break;
					case 3:
						setCostume(EnumCostume.CAMPONES);
						break;

					default:
						System.out.println("Digite uma opção válida\n");
						break;
					}

				}

				while (getWeaponOption() != 1 && getWeaponOption() != 2 && getWeaponOption() != 3) {
					System.out.println(
							"Escolha a arma do personagem\n" + "1 - MACHADO\n" + "2 - MARTELO\n" + "3 - ESCUDO\n");
					setWeaponOption(entrada.nextInt());

					switch (getWeaponOption()) {
					case 1:
						setWeapon(EnumWeapon.MACHADO);
						break;
					case 2:
						setWeapon(EnumWeapon.MARTELO);
						break;
					case 3:
						setWeapon(EnumWeapon.ESCUDO);
						break;

					default:
						System.out.println("Digite uma opção válida\n");
						break;
					}

				}

			} else if (getCharacterOption() == 4) {
				setCharacter(EnumCharacter.ARQUEIRO);

				while (getHelmetOption() != 1 && getHelmetOption() != 2 && getHelmetOption() != 3) {
					System.out.println("Escolha o capacete do personagem\n" + "1 - OURO\n" + "2 - DIAMANTE\n"
							+ "3 - ADAMANTIUM\n");
					setHelmetOption(entrada.nextInt());

					switch (getHelmetOption()) {
					case 1:
						setHelmet(EnumHelmet.OURO);
						break;
					case 2:
						setHelmet(EnumHelmet.DIAMANTE);
						break;
					case 3:
						setHelmet(EnumHelmet.ADAMANTIUM);
						break;

					default:
						System.out.println("Digite uma opção válida\n");
						break;
					}

				}

				while (getCostumeOption() != 1 && getCostumeOption() != 2 && getCostumeOption() != 3) {
					System.out.println(
							"Escolha a armadura do personagem\n" + "1 - ARMADURA\n" + "2 - HEROI\n" + "3 - CAMPONES\n");
					setCostumeOption(entrada.nextInt());

					switch (getCostumeOption()) {
					case 1:
						setCostume(EnumCostume.ARMADURA);
						break;
					case 2:
						setCostume(EnumCostume.HEROI);
						break;
					case 3:
						setCostume(EnumCostume.CAMPONES);
						break;

					default:
						System.out.println("Digite uma opção válida\n");
						break;
					}

				}

				while (getWeaponOption() != 1 && getWeaponOption() != 2 && getWeaponOption() != 3) {
					System.out.println("Escolha a arma do personagem\n" + "1 - FLEXAS DE AÇO\n" + "2 - FLEXAS DE FOGO\n"
							+ "3 - BESTA\n");
					setWeaponOption(entrada.nextInt());

					switch (getWeaponOption()) {
					case 1:
						setWeapon(EnumWeapon.FLEXAS_DE_ACO);
						break;
					case 2:
						setWeapon(EnumWeapon.FLEXAS_DE_FOGO);
						break;
					case 3:
						setWeapon(EnumWeapon.BESTA);
						break;

					default:
						System.out.println("Digite uma opção válida\n");
						break;
					}

				}

			} else if (getCharacterOption() == 5) {
				setCharacter(EnumCharacter.EXTERMINADOR_DO_FUTURO);

				while (getHelmetOption() != 1 && getHelmetOption() != 2 && getHelmetOption() != 3) {
					System.out.println("Escolha o capacete do personagem\n" + "1 - OURO\n" + "2 - DIAMANTE\n"
							+ "3 - ADAMANTIUM\n");
					setHelmetOption(entrada.nextInt());

					switch (getHelmetOption()) {
					case 1:
						setHelmet(EnumHelmet.OURO);
						break;
					case 2:
						setHelmet(EnumHelmet.DIAMANTE);
						break;
					case 3:
						setHelmet(EnumHelmet.ADAMANTIUM);
						break;

					default:
						System.out.println("Digite uma opção válida\n");
						break;
					}

				}

				while (getCostumeOption() != 1 && getCostumeOption() != 2 && getCostumeOption() != 3) {
					System.out.println(
							"Escolha a armadura do personagem\n" + "1 - ARMADURA\n" + "2 - HEROI\n" + "3 - CAMPONES\n");
					setCostumeOption(entrada.nextInt());

					switch (getCostumeOption()) {
					case 1:
						setCostume(EnumCostume.ARMADURA);
						break;
					case 2:
						setCostume(EnumCostume.HEROI);
						break;
					case 3:
						setCostume(EnumCostume.CAMPONES);
						break;

					default:
						System.out.println("Digite uma opção válida\n");
						break;
					}

				}

				while (getWeaponOption() != 1 && getWeaponOption() != 2 && getWeaponOption() != 3) {
					System.out.println("Escolha a arma do personagem\n" + "1 - ESPINGARDA\n" + "2 - METRALHADORA\n"
							+ "3 - PISTOLA\n");
					setWeaponOption(entrada.nextInt());

					switch (getWeaponOption()) {
					case 1:
						setWeapon(EnumWeapon.ESPINGARDA);
						break;
					case 2:
						setWeapon(EnumWeapon.METRALHADORA);
						break;
					case 3:
						setWeapon(EnumWeapon.PISTOLA);
						break;

					default:
						System.out.println("Digite uma opção válida\n");
						break;
					}

				}

			}
		}

		enterIntoGame = 2;
		return hero = new Hero(getHeroName(), getSex(), getCharacter(), getHelmet(), getHelmet().getDano(),
				getCostume(), getCostume().getDano(), getWeapon(), getWeapon().getDano());

	}

	public void gameIntroduction() {
		System.out.println(EnumGameAction.GAME_INTRODUCTION.getMessage());
		while (getGameMotivation() != 1 && getGameMotivation() != 2) {
			System.out.println(
					"Escolha sua motivação para invadir a caverna do inimigo e derrotá-lo: \n1 - Vingança\n2 - Glória\n");
			setGameMotivation(entrada.nextInt());
			switch (getGameMotivation()) {
			case 1:
				setGameAction(EnumGameAction.VINGANCA.getMessage());
				System.out.println(gameAction);
				break;
			case 2:
				setGameAction(EnumGameAction.GLORIA.getMessage());
				System.out.println(getGameAction());
				break;

			default:
				System.out.println("Digite uma opção válida");
			}
		}
	}

	public void goAheadOrGiveUp() {
		System.out.println(EnumGameAction.AFTER_CHOOSE_MOTIVATION.getMessage());
		while (getChooseGameGoAheadOrGiveUp() != 1 && getChooseGameGoAheadOrGiveUp() != 2) {
			System.out.println("Qual seu caminho: \n1 - Seguir em frente\n2 - Desistir feito um covarde\n");
			setChooseGameGoAheadOrGiveUp(entrada.nextInt());
			switch (getChooseGameGoAheadOrGiveUp()) {
			case 1:
				setGameGoAheadOrGiveUp(EnumGameAction.SEGUIR.getMessage());
				System.out.println(gameGoAheadOrGiveUp);
				break;
			case 2:
				setGameGoAheadOrGiveUp(EnumGameAction.DESISTIR.getMessage());
				System.out.println(getGameGoAheadOrGiveUp());
				System.exit(0);
				break;

			default:
				System.out.println("Digite uma opção válida");
			}
		}
	}

	public void enterTheDoor() {
		int diceRollDamageHero;
		System.out.println(EnumGameAction.AFTER_CHOOSE_GO_OR_GIVEUP.getMessage());

		while (getChooseEnterTheDoor() != 1 && getChooseEnterTheDoor() != 2 && getChooseEnterTheDoor() != 3) {

			System.out.println("\nEntrar pela porta: \n1 - Saltando\n2 - Andando\n3 - Correndo\n");
			setChooseEnterTheDoor(entrada.nextInt());

			switch (getChooseEnterTheDoor()) {
			case 1:
				setGameEnterTheDoor(EnumGameAction.SALTANDO.getMessage());
				System.out.println(getGameEnterTheDoor());
				break;
			case 2:
				setGameEnterTheDoor(EnumGameAction.ANDANDO.getMessage());
				System.out.println(getGameEnterTheDoor());
				diceRollDamageHero = random.nextInt(10);
				hero.setLife(100.0 - diceRollDamageHero);
				System.out.println("E você sofre um dano de: " + diceRollDamageHero);
				System.out.println("A vida do Heroi fica em: " + hero.getLife());
				break;
			case 3:
				setGameEnterTheDoor(EnumGameAction.CORRENDO.getMessage());
				System.out.println(getGameEnterTheDoor());
				break;

			default:
				System.out.println("Digite uma opção válida");
			}
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
						"Escolha em qual porta você deseja entrar primeiro: \n1 - Porta à direita\n2 - Porta ao centro\n3 - Porta à esquerda\n");
				chooseDoorToFight = entrada.nextInt();
			} else if (rightDoor == 1 && leftDoor == 0 && mainDoor == 0) {
				System.out.println(
						"Escolha em qual porta você deseja entrar: \n2 - Porta ao centro\n3 - Porta à esquerda\n");
				chooseDoorToFight = entrada.nextInt();
			} else if (rightDoor == 0 && leftDoor == 1 && mainDoor == 0) {
				System.out.println(
						"Escolha em qual porta você deseja entrar: \n1 - Porta à direita\n2 - Porta ao centro\n");
				chooseDoorToFight = entrada.nextInt();
			} else {
				System.out.println("Muito bem você está na portal final digite: \n2 - para entrar\n");
				chooseDoorToFight = entrada.nextInt();
			}

			if (chooseDoorToFight == 1 && rightDoor == 0) {
				System.out.println(EnumGameAction.PORTA_DIREITA.getMessage());
				this.fightHeroAgainstArmeiro();
				System.out.println(EnumGameAction.AFTER_WON_RIGHT_DOOR.getMessage());
				System.out.println("\nEscolha pegar a armaduro do inimigo: \n1 - Sim\n2 - Não\n");

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
			} else if (chooseDoorToFight == 2 && mainDoor == 0) {
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
							"Você precisa derrotar os dois inimigos e pegar as chaves para poder enfrentar o Poderoso Chefão\n");
				}
			} else if (chooseDoorToFight == 3 && leftDoor == 0) {

				System.out.println(EnumGameAction.PORTA_ESQUERDA.getMessage());
				this.fightHeroAgainstAlquimista();
				System.out.println(EnumGameAction.AFTER_WON_LEFT_DOOR.getMessage());
				System.out.println("\nEscolha beber o líquido produzido pelo inimigo: \n1 - Sim\n2 - Não\n");
				aceptGift = entrada.nextInt();
				if (aceptGift == 1) {
					System.out.println(EnumGameAction.ACEPT_LEFT_DOOR_GIFT.getMessage());
					hero.setLife((100 - hero.getLife()) + hero.getLife());
					System.out.println("Vida do personagem " + hero.getLife());
					System.out.println(EnumGameAction.MESSAGE_KEYS_ALQUIMISTA.getMessage());
				} else {
					System.out.println(EnumGameAction.DONT_ACEPT_LEFT_DOOR_GIFT.getMessage());
				}
				setDoorKeys(getDoorKeys() + 1);
				leftDoor = 1;
			}

		}

	}

	public void fightHeroAgainstArmeiro() {

		armeiro.createArmeiro();

		combat.fight(hero, armeiro, getLevelGame());

	}

	public void fightHeroAgainstAlquimista() {

		alquimista.createAlquimista();

		combat.fight(hero, alquimista, getLevelGame());

	}

	public void fightHeroAgainstPoderosoChefao() {

		poderosoChefao.createGodFather();

		combat.fight(hero, poderosoChefao, getLevelGame());

	}

	public void printHero() {
		System.out.println("Você está pronto(a) para batalha: \n");
		System.out.println("Nome do heroi: " + hero.getName());
		System.out.println("Sexo: " + hero.getSex());
		System.out.println("Você é um: " + hero.getTypeCharacter());
		System.out.println("Seu capacete: " + hero.getHelmet() + " Dano: " + hero.getHelmetScore());
		System.out.println("Sua armadura: " + hero.getCostume() + " Dano: " + hero.getCostumeScore());
		System.out.println("Sua arma de combate: " + hero.getWeaponOne() + " Dano: " + hero.getWeaponOneScore());
		System.out.println("Você tem um poder total de dano de: " + hero.getTotaldamage() + "\n\n");
	}
}
