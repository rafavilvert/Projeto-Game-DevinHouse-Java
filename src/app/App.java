package app;

public class App {

	public static void main(String[] args) {

		GameStep game = new GameStep();

		try {
			game.start();
//			Thread.sleep(5000);

			game.chooseLevelGame();

			game.chooseName();

			game.chooseSex();

			game.createHero();

			game.printHero();
//			Thread.sleep(10000);

			game.gameIntroduction();
//			Thread.sleep(3000);

			game.goAheadOrGiveUp();
//			Thread.sleep(3000);

			game.enterTheDoor();
			Thread.sleep(000);

			game.chooseADoorToFight();
		} catch (InterruptedException e) {

			System.out.println("Error");
		}

	}

}
