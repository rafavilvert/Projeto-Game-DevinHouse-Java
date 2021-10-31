package gameAction;

public enum EnumDiffycultLevelGame {

	FACIL(0.2), NORMAL(1.0), DIFICIL(0.1);

	private Double diffycultLevel;

	private EnumDiffycultLevelGame(Double diffycultLevel) {
		this.diffycultLevel = diffycultLevel;
	}

	public Double getDiffycultLevel() {
		return this.diffycultLevel;
	}

}
