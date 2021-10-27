package character;

public class EnemyCaptain extends Character {

	public EnemyCaptain(String name, EnumSex sex, EnumCharacter typeCharacter, EnumHelmet helmet, int helmetScore,
			EnumCostume costume, int costumeScore, EnumWeapon weaponOne, int weaponOneScore) {
		super(name, sex, typeCharacter, helmet, helmetScore, costume, costumeScore, weaponOne, weaponOneScore);
	}

	public void atacar(Hero hero, int dano) {
		hero.setLife(hero.getLife() - dano);
	}

}
