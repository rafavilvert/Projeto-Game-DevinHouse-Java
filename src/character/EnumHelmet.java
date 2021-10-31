package character;

public enum EnumHelmet {

	OURO(5), DIAMANTE(10), ADAMANTIUM(15),
	CAPACETE_BRONZE_ARMEIRO(3),
	CHAPEU_ALQUIMISTA(7),
	CAPACETE_CRYPTO_CHEFAO(13);

	private int dano;

	private EnumHelmet(int dano) {
		this.dano = dano;
	}

	public int getDano() {
		return this.dano;
	}

}
