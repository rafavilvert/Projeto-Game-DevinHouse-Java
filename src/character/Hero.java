package character;

public class Hero extends Personage {
	
	public Hero() {
		
	}

	public Hero(String name, EnumSex sex, EnumCharacter typeCharacter, EnumHelmet helmet, int helmetScore,
			EnumCostume costume, int costumeScore, EnumWeapon weaponOne, int weaponOneScore) {
		super(name, sex, typeCharacter, helmet, helmetScore, costume, costumeScore, weaponOne, weaponOneScore);
	}

	public void atacar(Personage opponentPlayer, int levelGame) {
		int option = 0;
		while (option != 127) {

			if (levelGame == 1) {
				opponentPlayer.setLife(opponentPlayer.getLife() - (this.getTotaldamage()));
				option = 127;
			} else if (levelGame == 2) {
				opponentPlayer.setLife(opponentPlayer.getLife() - this.getTotaldamage());
				option = 127;
			} else if (levelGame == 3) {
				opponentPlayer.setLife(opponentPlayer.getLife() - (this.getTotaldamage() * 0.9));
				option = 127;
			} else {
				System.out.println("Digite uma opção válida");
			}
		}

	}

}
