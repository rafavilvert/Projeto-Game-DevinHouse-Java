package character;

public abstract class Character {

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

	public Character() {
	}

	public Character(String name, EnumSex sex, EnumCharacter typeCharacter, EnumHelmet helmet, int helmetScore,
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

	public void setDifficultyLevel(Double difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	public void atacar(Character opponentPlayer) {

	}
}
