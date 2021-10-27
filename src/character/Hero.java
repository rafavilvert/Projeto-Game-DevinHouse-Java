package character;

public class Hero extends Character {

	public Hero(String name, EnumSex sex, EnumCharacter typeCharacter, EnumHelmet helmet, int helmetScore,
			EnumCostume costume, int costumeScore, EnumWeapon weaponOne, int weaponOneScore) {
		super(name, sex, typeCharacter, helmet, helmetScore, costume, costumeScore, weaponOne, weaponOneScore);
	}

	public void atacar(EnemyCaptain opponentPlayer, int dano) {
		opponentPlayer.setLife(opponentPlayer.getLife() - dano);
	}

	public void atacar(Armeiro opponentPlayer, Double dano, Double diffycult) {
		opponentPlayer.setLife(opponentPlayer.getLife() - (dano * (1 - diffycult)));
	}

}
