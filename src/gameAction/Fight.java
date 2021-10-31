package gameAction;

import java.util.Random;
import java.util.Scanner;

import character.Hero;
import character.Personage;

public class Fight {
	Scanner sc = new Scanner(System.in);
	
	int chooseAtack = 1;
	int diceRollHero;
	int diceRollEnemy;

	Random random = new Random();

	public void fight(Hero hero, Personage enemy, int levelGame) {
		

		while (hero.getLife() > 0.0 && enemy.getLife() > 0.0) {
			System.out.println("Digite 1 Jodar o dado 2 sair");
			chooseAtack = sc.nextInt();

			if (chooseAtack == 1) {
				if (levelGame == 1) {
					this.diceRollHeroAndEnemyAttackLevelEasy(hero, enemy);
				} else if (levelGame == 2) {
					this.diceRollHeroAndEnemyAttackLevelNormal(hero, enemy);
				} else if (levelGame == 3) {
					this.diceRollHeroAndEnemyAttackLevelHard(hero, enemy);
				}
			} else {
				System.out.println("Você é uma desonra ");
				System.exit(0);
			}
		}


	}

	public void diceRollHeroAndEnemyAttackLevelEasy(Hero hero, Personage enemy) {
		diceRollHero = random.nextInt(20);
		diceRollEnemy = random.nextInt(20);

		System.out.println("Você lançou o dado");
		System.out.println("Dado heroi " + diceRollHero);
		System.out.println("Inimigo lançou o dado");
		System.out.println("Dado Inimigo " + diceRollEnemy);

		switch (diceRollHero) {
		case 1:
			System.out.println("Vida do heroi " + hero.getLife());
			System.out.println("O dado caiu em 1 seu ataque foi neutralizado pelo inimigo e não causou dano");
			enemy.setLife(enemy.getLife());
			break;
		case 20:
			System.out.println("Vida do heroi " + hero.getLife());
			System.out.println("O dado caiu em 20 seu ataque é especial");
			System.out.println(
					"Você atacou com a " + hero.getWeaponOne() + " e causou " + "100% de " + "dano no inimigo");
			enemy.setLife(enemy.getLife() - enemy.getLife());
			break;

		default:
			System.out.println("Vida do heroi " + hero.getLife());
			System.out.println("Você atacou com " + hero.getWeaponOne() + " causou um dano de "
					+ (hero.getTotaldamage() + diceRollHero) + " pontos");
			enemy.setLife(enemy.getLife() - (hero.getTotaldamage() + diceRollHero));
			if (enemy.getLife() < 0.0) {
				System.out.println("==== VOCÊ DERROTOU O " + enemy.getName() + " ====");
				enemy.setLife(0.0);
			}
			break;
		}

		if (enemy.getLife() > 0.0) {

			switch (diceRollEnemy) {
			case 1:
				System.out.println("Vida do inimigo " + enemy.getLife());
				System.out.println("O dado caiu em 1 Heroi neutralizou o ataque e não causou dano");
				hero.setLife(hero.getLife());
				System.out.println(enemy.getTotaldamage());
				System.out.println("Vida do inimigo " + enemy.getLife());
				break;
			case 20:
				System.out.println("Vida do inimigo " + enemy.getLife());
				System.out.println("O dado caiu em 20 ataque do inimigo é especial");
				System.out
						.println("Inimigo atacou com a " + enemy.getWeaponOne() + " e causou " + "100% de " + "dano ");
				hero.setLife(hero.getLife() - hero.getLife());
				System.out.println(enemy.getTotaldamage());
				System.out.println(diceRollHero);
				System.out.println("Vida do heroi " + hero.getLife());
				System.out.println("Vida do inimigo " + enemy.getLife());
				System.out.println("Você está morto kkkkkkkkkkk\nGAME OVER!");
				break;

			default:
				System.out.println("Vida do Inimigo " + enemy.getLife());
				System.out.println("Inimigo atacou com " + enemy.getWeaponOne() + " causou um dano de "
						+ ((enemy.getTotaldamage() + diceRollEnemy) * 0.8) + " pontos");

				hero.setLife(hero.getLife() - ((enemy.getTotaldamage() + diceRollEnemy) * 0.8));
				if (hero.getLife() < 0.0) {
					System.out.println("Você morreu " + hero.getName());
					hero.setLife(0.0);
				}
				System.out.println("Vida Heroi " + hero.getLife());
			}
		}

	}

	public void diceRollHeroAndEnemyAttackLevelNormal(Hero hero, Personage enemy) {
		diceRollHero = random.nextInt(20);
		diceRollEnemy = random.nextInt(20);

		System.out.println("Você lançou o dado");
		System.out.println("Dado heroi " + diceRollHero);
		System.out.println("Inimigo lançou o dado");
		System.out.println("Dado Inimigo " + diceRollEnemy);

		switch (diceRollHero) {
		case 1:
			System.out.println("Vida do heroi " + hero.getLife());
			System.out.println("O dado caiu em 1 seu ataque foi neutralizado pelo inimigo e não causou dano");
			enemy.setLife(enemy.getLife());
			break;
		case 20:
			System.out.println("Vida do heroi " + hero.getLife());
			System.out.println("O dado caiu em 20 seu ataque é especial");
			System.out.println(
					"Você atacou com a " + hero.getWeaponOne() + " e causou " + "100% de " + "dano no inimigo");
			enemy.setLife(enemy.getLife() - enemy.getLife());
			break;

		default:
			System.out.println("Vida do heroi " + hero.getLife());
			System.out.println("Você atacou com " + hero.getWeaponOne() + " causou um dano de "
					+ (hero.getTotaldamage() + diceRollHero) + " pontos");
			enemy.setLife(enemy.getLife() - (hero.getTotaldamage() + diceRollHero));
			if (enemy.getLife() < 0.0) {
				System.out.println("==== VOCÊ DERROTOU O " + enemy.getName() + " ====");
				enemy.setLife(0.0);
			}
			break;
		}

		if (enemy.getLife() > 0.0) {

			switch (diceRollEnemy) {
			case 1:
				System.out.println("Vida do inimigo " + enemy.getLife());
				System.out.println("O dado caiu em 1 Heroi neutralizou o ataque e não causou dano");
				hero.setLife(hero.getLife());
				break;
			case 20:
				System.out.println("Vida do inimigo " + enemy.getLife());
				System.out.println("O dado caiu em 20 ataque do inimigo é especial");
				System.out
						.println("Inimigo atacou com a " + enemy.getWeaponOne() + " e causou " + "100% de " + "dano ");
				hero.setLife(hero.getLife() - hero.getLife());
				System.out.println("Vida do heroi " + hero.getLife());
				System.out.println("Vida do inimigo " + enemy.getLife());
				System.out.println("Você está morto kkkkkkkkkkk\nGAME OVER!");
				break;

			default:
				System.out.println("Vida do Inimigo " + enemy.getLife());
				System.out.println("Inimigo atacou com " + enemy.getWeaponOne() + " causou um dano de "
						+ (enemy.getTotaldamage() + diceRollEnemy) + " pontos");
				hero.setLife(hero.getLife() - (enemy.getTotaldamage() + diceRollEnemy));
				if (hero.getLife() < 0.0) {
					System.out.println("Você morreu " + hero.getName());
					hero.setLife(0.0);
				}
				System.out.println("Vida Heroi " + hero.getLife());
				break;
			}
		}

	}

	public void diceRollHeroAndEnemyAttackLevelHard(Hero hero, Personage enemy) {
		diceRollHero = random.nextInt(20);
		diceRollEnemy = random.nextInt(20);

		System.out.println("Você lançou o dado");
		System.out.println("Dado heroi " + diceRollHero);
		System.out.println("Inimigo lançou o dado");
		System.out.println("Dado Inimigo " + diceRollEnemy);

		switch (diceRollHero) {
		case 1:
			System.out.println("Vida do inimigo " + enemy.getLife());
			System.out.println("O dado caiu em 1 Inimigo neutralizou o ataque e não sofreu dano");
			enemy.setLife(enemy.getLife());
			break;
		case 20:
			System.out.println("Vida do heroi " + hero.getLife());
			System.out.println("O dado caiu em 20 seu ataque é especial");
			System.out.println(
					"Você atacou com a " + hero.getWeaponOne() + " e causou " + "100% de " + "dano no inimigo");
			enemy.setLife(enemy.getLife() - enemy.getLife());
			break;

		default:
			System.out.println("Vida do heroi " + hero.getLife());
			System.out.println("Você atacou com " + hero.getWeaponOne() + " causou um dano de "
					+ ((hero.getTotaldamage() + diceRollHero) * 0.9) + " pontos");
			enemy.setLife(enemy.getLife() - (hero.getTotaldamage() + diceRollHero) * 0.9);
			if (enemy.getLife() < 0.0) {
				System.out.println("==== VOCÊ DERROTOU O " + enemy.getName() + " ====");
				enemy.setLife(0.0);
			}
			break;
		}

		if (enemy.getLife() > 0.0) {

			switch (diceRollEnemy) {
			case 1:
				System.out.println("Vida do inimigo " + enemy.getLife());
				System.out.println("O dado caiu em 1 Heroi neutralizou o ataque e não sofreu dano");
				hero.setLife(hero.getLife());
				System.out.println(enemy.getTotaldamage());
				break;
			case 20:
				System.out.println("Vida do inimigo " + enemy.getLife());
				System.out.println("O dado caiu em 20 ataque do inimigo é especial");
				System.out
						.println("Inimigo atacou com a " + enemy.getWeaponOne() + " e causou " + "100% de " + "dano ");
				hero.setLife(hero.getLife() - hero.getLife());
				System.out.println("Vida do heroi " + hero.getLife());
				System.out.println("Vida do inimigo " + enemy.getLife());
				System.out.println("Você está morto kkkkkkkkkkk\nGAME OVER!");
				break;

			default:
				System.out.println("Vida do Inimigo " + enemy.getLife());
				System.out.println("Inimigo atacou com " + enemy.getWeaponOne() + " causou um dano de "
						+ (enemy.getTotaldamage() + diceRollEnemy) + " pontos");
				hero.setLife(hero.getLife() - (enemy.getTotaldamage() + diceRollEnemy));
				if (hero.getLife() < 0.0) {
					System.out.println("Você morreu " + hero.getName());
					hero.setLife(0.0);
				}
				System.out.println("Vida Heroi " + hero.getLife());
				break;
			}
		}

	}

}
