package character;

public enum EnumCostume {

	ARMADURA(10), HEROI(15), CAMPONES(5),
	ARMADURA_BRONZE_ARMEIRO(5),
	TUNICA_ALQUIMISTA(7),
	ARMADURA_TITANIO_CHEFAO(14);

	private int dano;

	private EnumCostume(int dano) {
		this.dano = dano;
	}

	public int getDano() {
		return this.dano;
	}

}
