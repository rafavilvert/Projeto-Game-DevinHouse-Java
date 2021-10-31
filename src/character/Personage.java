package character;

public class Personage {

	private Double life = 100.0;
	protected String name;
	protected EnumSex sex;
	protected EnumCharacter typeCharacter;
	protected EnumHelmet helmet;
	protected int helmetScore;
	protected EnumCostume costume;
	protected int costumeScore;
	protected EnumWeapon weaponOne;
	protected int weaponOneScore;
	protected int totaldamage;
	protected Double difficultyLevel;

	public Personage() {
	}

	public Personage(String name, EnumSex sex, EnumCharacter typeCharacter, EnumHelmet helmet, int helmetScore,
			EnumCostume costume, int costumeScore, EnumWeapon weaponOne, int weaponOneScore) {
		this.name = name;
		this.sex = sex;
		this.typeCharacter = typeCharacter;
		this.helmet = helmet;
		this.helmetScore = helmetScore;
		this.costume = costume;
		this.costumeScore = costumeScore;
		this.weaponOne = weaponOne;
		this.weaponOneScore = weaponOneScore;
		this.totaldamage = (helmetScore + costumeScore + weaponOneScore);
	}

	public Double getLife() {
		return life;
	}

	public void setLife(Double life) {
		this.life = life;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EnumSex getSex() {
		return sex;
	}

	public void setSex(EnumSex sex) {
		this.sex = sex;
	}

	public EnumCharacter getTypeCharacter() {
		return typeCharacter;
	}

	public void setTypeCharacter(EnumCharacter typeCharacter) {
		this.typeCharacter = typeCharacter;
	}

	public EnumHelmet getHelmet() {
		return helmet;
	}

	public void setHelmet(EnumHelmet helmet) {
		this.helmet = helmet;
	}

	public int getHelmetScore() {
		return helmetScore;
	}

	public void setHelmetScore(int helmetScore) {
		this.helmetScore = helmetScore;
	}

	public EnumCostume getCostume() {
		return costume;
	}

	public void setCostume(EnumCostume costume) {
		this.costume = costume;
	}

	public int getCostumeScore() {
		return costumeScore;
	}

	public void setCostumeScore(int costumeScore) {
		this.costumeScore = costumeScore;
	}

	public EnumWeapon getWeaponOne() {
		return weaponOne;
	}

	public void setWeaponOne(EnumWeapon weaponOne) {
		this.weaponOne = weaponOne;
	}

	public int getWeaponOneScore() {
		return weaponOneScore;
	}

	public void setWeaponOneScore(int weaponOneScore) {
		this.weaponOneScore = weaponOneScore;
	}

	public int getTotaldamage() {
		return totaldamage;
	}

	public void setTotaldamage(int totaldamage) {
		this.totaldamage = totaldamage;
	}

	public Double getDifficultyLevel() {
		return difficultyLevel;
	}

	public void createArmeiro() {
		this.name = "Capitão Armeiro";
		this.sex = EnumSex.MASCULINO;
		this.typeCharacter = EnumCharacter.CAPITAO_ARMEIRO;
		this.helmet = EnumHelmet.CAPACETE_BRONZE_ARMEIRO;
		this.helmetScore = EnumHelmet.CAPACETE_BRONZE_ARMEIRO.getDano();
		this.costume = EnumCostume.ARMADURA_BRONZE_ARMEIRO;
		this.costumeScore = EnumCostume.ARMADURA_BRONZE_ARMEIRO.getDano();
		this.weaponOne = EnumWeapon.ESPADA_AFIADA_ARMEIRO;
		this.weaponOneScore = EnumWeapon.ESPADA_AFIADA_ARMEIRO.getDano();
		this.totaldamage = (helmetScore + costumeScore + weaponOneScore);
		
	}
	
	public void createAlquimista() {
		this.name = "Capitão Alquimista";
		this.sex = EnumSex.MASCULINO;
		this.typeCharacter = EnumCharacter.CAPITAO_ALQUIMISTA;
		this.helmet = EnumHelmet.CHAPEU_ALQUIMISTA;
		this.helmetScore = EnumHelmet.CHAPEU_ALQUIMISTA.getDano();
		this.costume = EnumCostume.TUNICA_ALQUIMISTA;
		this.costumeScore = EnumCostume.TUNICA_ALQUIMISTA.getDano();
		this.weaponOne = EnumWeapon.MAGIA_NEGRA;
		this.weaponOneScore = EnumWeapon.MAGIA_NEGRA.getDano();
		this.totaldamage = (helmetScore + costumeScore + weaponOneScore);
		
	}
	
	public void createGodFather() {
		this.name = "Poderoso Chefão";
		this.sex = EnumSex.FEMININO;
		this.typeCharacter = EnumCharacter.PODEROSO_CHEFAO;
		this.helmet = EnumHelmet.CAPACETE_CRYPTO_CHEFAO;
		this.helmetScore = EnumHelmet.CAPACETE_CRYPTO_CHEFAO.getDano();
		this.costume = EnumCostume.ARMADURA_TITANIO_CHEFAO;
		this.costumeScore = EnumCostume.ARMADURA_TITANIO_CHEFAO.getDano();
		this.weaponOne = EnumWeapon.MACHADO_DE_GUERRA_DE_LAMINA_DUPLA;
		this.weaponOneScore = EnumWeapon.MACHADO_DE_GUERRA_DE_LAMINA_DUPLA.getDano();
		this.totaldamage = (helmetScore + costumeScore + weaponOneScore);
		
	}

	public void setDifficultyLevel(Double difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}
	
	public void atacar(Hero hero, int levelGame) {
		int option = 0;
		while (option != 127) {

			if (levelGame == 1) {
				hero.setLife(hero.getLife() - (this.getTotaldamage() * 0.8));
				option = 127;
			} else if (levelGame == 2) {
				hero.setLife(hero.getLife() - this.getTotaldamage());
				option = 127;
			} else if (levelGame == 3) {
				hero.setLife(hero.getLife() - (this.getTotaldamage()));
				option = 127;
			} else {
				System.out.println("Digite uma opção válida");
			}
		}

	}

	public void atacar(Hero hero) {
		hero.setLife(hero.getLife() - this.getTotaldamage());
	}
}
