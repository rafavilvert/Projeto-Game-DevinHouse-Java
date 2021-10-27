package app;

import java.util.Scanner;

import character.EnumCharacter;
import character.EnumCostume;
import character.EnumHelmet;
import character.EnumSex;
import character.EnumWeapon;
import character.Hero;

public class App {

	public static void main(String[] args) {
		int sexOption = 0;
		int characterOption = 0;
		int helmetOption = 0;
		int costumeOption = 0;
		int weaponOption = 0;
		EnumSex sex = EnumSex.MASCULINO;
		EnumCharacter character = EnumCharacter.ARQUEIRO;
		EnumHelmet helmet = EnumHelmet.ADAMANTIUM;
		EnumCostume costume = EnumCostume.ARMADURA;
		EnumWeapon weapon = EnumWeapon.ADAGA;
		
		int enterIntoGame = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("╔══════•ೋೋ•══════╗ \n" + "    Seja bem vindo\n" + "       ao game \n"
				+ " Glory Of a Brave Hero!\n" + "╚══════•ೋೋ•══════╝\n\n");

		while (enterIntoGame != 2) {
			System.out.println("Escolha uma opção: 1 - Novo jogo 2 - Encerrar");
			enterIntoGame = entrada.nextInt();

			if (enterIntoGame == 1) {
				System.out.println("Escolha o nivel de dificuldade: \n" + "1 - Fácil\n" + "2 - Normal\n" + "3 - Difícil\n");
				entrada.nextInt(); // TODO Falta implementar os níveis de dificuldade

				System.out.println("Escolha o nome do personagem");
				String name = entrada.next();

				while (sexOption != 127) {
					System.out.println(
							"Escolha o sexo do personagem: \n" + "1 - Masculino\n" + "2 - Feminino\n" + "3 - Outro\n");
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
					System.out.println("Escolha o seu personagem: \n" + " 1 - GUERREIRO\n" + "2 - CAVALEIRO\n"
							+ "3 - VIKING\n" + "4 - ARQUEIRO\n" + "5 -EXTERMINADOR DO FUTURO \n");
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
							System.out.println("Escolha a armadura do personagem\n" + "1 - ARMADURA\n" + "2 - HEROI\n"
									+ "3 - CAMPONES\n");
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
							System.out.println("Escolha a arma do personagem\n" + "1 - EXCALIBUR\n" + "2 - SAMURAI\n"
									+ "3 - ADAGA\n");
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
							System.out.println("Escolha a armadura do personagem\n" + "1 - ARMADURA\n" + "2 - HEROI\n"
									+ "3 - CAMPONES\n");
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
							System.out.println("Escolha o cavalo do personagem\n" + "1 - PEGASUS\n"
									+ "2 - CAVALO DE FOGO\n" + "3 - PÉ DE PANO\n");
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
							System.out.println("Escolha a armadura do personagem\n" + "1 - ARMADURA\n" + "2 - HEROI\n"
									+ "3 - CAMPONES\n");
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
							System.out.println("Escolha a arma do personagem\n" + "1 - MACHADO\n" + "2 - MARTELO\n"
									+ "3 - ESCUDO\n");
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
							System.out.println("Escolha a armadura do personagem\n" + "1 - ARMADURA\n" + "2 - HEROI\n"
									+ "3 - CAMPONES\n");
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
							System.out.println("Escolha a arma do personagem\n" + "1 - FLEXAS DE AÇO\n"
									+ "2 - FLEXAS DE FOGO\n" + "3 - BESTA\n");
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
							System.out.println("Escolha a armadura do personagem\n" + "1 - ARMADURA\n" + "2 - HEROI\n"
									+ "3 - CAMPONES\n");
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
							System.out.println("Escolha a arma do personagem\n" + "1 - ESPINGARDA\n"
									+ "2 - METRALHADORA\n" + "3 - PISTOLA\n");
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

					Hero hero1 = new Hero(name, sex, character, helmet, helmet.getDano(), costume, costume.getDano(),
							weapon, weapon.getDano());
					System.out.println("SEU HERIO ESTÁ PRONTO PARA BATALHA!!!");
					System.out.println("Nome: " + hero1.getName());
					System.out.println("Sexo: " + hero1.getSex());
					System.out.println("Personagem: " + hero1.getTypeCharacter());
					System.out.println("Tipo de capacete: " + hero1.getHelmet());
					System.out.println("Força do capacete: " + hero1.getHelmetScore());
					System.out.println("Tipo da armadura: " + hero1.getCostume());
					System.out.println("Força da armadura: " + hero1.getCostumeScore());
					System.out.println("Arma: " + hero1.getWeaponOne());
					System.out.println("Força da arma: " + hero1.getWeaponOneScore());
					System.out.println("Poder de ataque: " + hero1.getTotaldamage()  + "\n");
					
					System.out.println("Escolha sua motivação para invadir a caverna do inimigo e derrotá-lo: \n"
							+ "1 - Vingança\n"
							+ "2 - Glória\n");

				}
				characterOption = 127;
			}
			characterOption = 127;
			enterIntoGame = 2;
		}

		entrada.close();
	}

}
