package gameAction;

import java.util.Random;
import java.util.Scanner;

import character.Hero;
import character.Personage;

public class Fight {
	Scanner sc = new Scanner(System.in);

	private int chooseAtack = 1;
	private int diceRollHero;
	private int diceRollEnemy;
	private double levelGameHeroDamage = 1.0;
	private double levelGameEnemyDamage = 1.0;

	public int getChooseAtack() {
		return chooseAtack;
	}

	public void setChooseAtack(int chooseAtack) {
		this.chooseAtack = chooseAtack;
	}

	public int getDiceRollHero() {
		return diceRollHero;
	}

	public void setDiceRollHero(int diceRollHero) {
		this.diceRollHero = diceRollHero;
	}

	public int getDiceRollEnemy() {
		return diceRollEnemy;
	}

	public void setDiceRollEnemy(int diceRollEnemy) {
		this.diceRollEnemy = diceRollEnemy;
	}

	public double getLevelGameHeroDamage() {
		return levelGameHeroDamage;
	}

	public double getLevelGameEnemyDamage() {
		return levelGameEnemyDamage;
	}

	public void setLevelGameHeroDamage(double levelGameHeroDamage) {
		this.levelGameHeroDamage = levelGameHeroDamage;
	}

	public void setLevelGameEnemyDamage(double levelGameEnemyDamage) {
		this.levelGameEnemyDamage = levelGameEnemyDamage;
	}

	Random random = new Random();

	public void fight(Hero hero, Personage enemy, int levelGame) {

		while (hero.getLife() > 0.0 && enemy.getLife() > 0.0) {
			System.out.println("Digite 1 Jodar o dado 2 sair\n");
			setChooseAtack(sc.nextInt());

			if (getChooseAtack() == 1) {
				if (levelGame == 1) {
					setLevelGameEnemyDamage(0.8);
					this.diceRollHeroAndEnemyAttack(hero, enemy, getLevelGameHeroDamage(), getLevelGameEnemyDamage());
				} else if (levelGame == 2) {
					this.diceRollHeroAndEnemyAttack(hero, enemy, getLevelGameHeroDamage(), getLevelGameEnemyDamage());
				} else if (levelGame == 3) {
					setLevelGameHeroDamage(0.9);
					this.diceRollHeroAndEnemyAttack(hero, enemy, getLevelGameHeroDamage(), getLevelGameEnemyDamage());
				}
			} else {
				System.out.println("Você é uma desonra ");
				System.exit(0);
			}
		}

	}

	public void diceRollHeroAndEnemyAttack(Hero hero, Personage enemy, double levelGameHeroDamage,
			double levelGameEnemyDamage) {
		setDiceRollHero(random.nextInt(20));
		setDiceRollEnemy(random.nextInt(20));

		System.out.println("Você lançou o dado");
		System.out.println("Dado heroi " + getDiceRollHero());
		System.out.println("Inimigo lançou o dado\n");
		System.out.println("Dado Inimigo " + getDiceRollEnemy());

		switch (getDiceRollHero()) {
		case 1:
			System.out.printf("Vida do heroi %.2f \n", hero.getLife());
			System.out.println("O dado caiu em 1 seu ataque foi neutralizado pelo inimigo e não causou dano\n");
			enemy.setLife(enemy.getLife());
			break;
		case 20:
			System.out.printf("Vida do heroi %.2f \n", hero.getLife());
			System.out.println("O dado caiu em 20 seu ataque é especial");
			System.out.println(
					"Você atacou com a " + hero.getWeaponOne() + " e causou " + "100% de " + "dano no inimigo\n");
			enemy.setLife(enemy.getLife() - enemy.getLife());
			break;

		default:
			System.out.printf("Vida do heroi %.2f \n", hero.getLife());
			System.out.printf("Você atacou com %s causou um dano de %.2f pontos\n", hero.getWeaponOne(),
					(hero.getTotaldamage() + diceRollHero) * levelGameHeroDamage);
			enemy.setLife(enemy.getLife() - (hero.getTotaldamage() + diceRollHero) * levelGameHeroDamage);
			if (enemy.getLife() < 0.0) {
				System.out.println("==== VOCÊ DERROTOU O " + enemy.getName() + " ====\n");
				enemy.setLife(0.0);
			}
			break;
		}

		if (enemy.getLife() > 0.0) {

			switch (getDiceRollEnemy()) {
			case 1:
				System.out.printf("Vida do Inimigo %.2f \n", enemy.getLife());
				System.out.println("O dado caiu em 1 Heroi neutralizou o ataque e não causou dano\n");
				hero.setLife(hero.getLife());
				System.out.println(enemy.getTotaldamage());
				System.out.printf("Vida do Inimigo %.2f \n", enemy.getLife());
				break;
			case 20:
				System.out.printf("Vida do Inimigo %.2f \n", enemy.getLife());
				System.out.println("O dado caiu em 20 ataque do inimigo é especial\n");
				System.out.println(
						"Inimigo atacou com a " + enemy.getWeaponOne() + " e causou " + "100% de " + "dano \n");
				hero.setLife(hero.getLife() - hero.getLife());
				System.out.println(enemy.getTotaldamage());
				System.out.println(getDiceRollHero());
				System.out.printf("Vida do heroi %.2f \n", hero.getLife());
				System.out.println("Vida do inimigo " + enemy.getLife() + "\n");
				System.out.println("GAME OVER!");
				break;

			default:
				System.out.printf("Vida do Inimigo %.2f \n", enemy.getLife());
				System.out.printf("Inimigo atacou com %s causou dano de %.2f pontos\n", enemy.getWeaponOne(),
						(enemy.getTotaldamage() + getDiceRollEnemy()) * levelGameEnemyDamage);
				hero.setLife(hero.getLife() - ((enemy.getTotaldamage() + getDiceRollEnemy()) * levelGameEnemyDamage));
				if (hero.getLife() < 0.0) {
					System.out.println("Você morreu " + hero.getName() + "\n");
					System.exit(0);
					hero.setLife(0.0);
				}
				System.out.printf("Vida Heroi %.2f \n", hero.getLife());
			}
		}

	}

}