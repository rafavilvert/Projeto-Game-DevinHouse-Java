package character;

public class Alquimista extends Character {
	
	public Alquimista() {
		this.name = "Capitão Alquimista";
		this.typeCharacter = EnumCharacter.CAPITAO_ARMEIRO;
		this.helmet = EnumHelmet.CAPACETE_BRONZE_ARMEIRO;
		this.helmetScore = EnumHelmet.CAPACETE_BRONZE_ARMEIRO.getDano();
		this.costume = EnumCostume.ARMADURA_BRONZE_ARMEIRO;
		this.costumeScore = EnumCostume.ARMADURA_BRONZE_ARMEIRO.getDano();
		this.weaponOne = EnumWeapon.ESPADA_AFIADA_ARMEIRO;
		this.weaponOneScore = EnumWeapon.ESPADA_AFIADA_ARMEIRO.getDano();
		this.totaldamage = (helmetScore + costumeScore + weaponOneScore);
		
	}

	public Alquimista(String name, EnumSex sex, EnumCharacter typeCharacter, EnumHelmet helmet, int helmetScore,
			EnumCostume costume, int costumeScore, EnumWeapon weaponOne, int weaponOneScore) {
		super(name, sex, typeCharacter, helmet, helmetScore, costume, costumeScore, weaponOne, weaponOneScore);
	}

	public void atacar(Hero hero, int dano) {
		hero.setLife(hero.getLife() - dano);
	}

}
