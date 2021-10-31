package app;

public class App {

	public static void main(String[] args) {
		
		GameStep game = new GameStep();
		game.start();
		game.chooseLevelGame();
		game.chooseName();
		game.createHero();
		game.gameIntroduction();
		game.goAheadOrGiveUp();
		game.enterTheDoor();
		game.chooseADoorToFight();
//		game.fightHeroAgainstArmeiro();
//		game.fightHeroAgainstAlquimista();
//		game.fightHeroAgainstPoderosoChefao();
	}

}
