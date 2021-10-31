package character;

public enum EnumWeapon {
	
	EXCALIBUR(5), SAMURAI(7), ADAGA(10),
	PEGASUS(8), CAVALO_DE_FOGO(10), PE_DE_PANO(12),
	MACHADO(10), MARTELO(5), ESCUDO(7),
	FLEXAS_DE_ACO(5), FLEXAS_DE_FOGO(10), BESTA(12),
	ESPINGARDA(15), METRALHADORA(12), PISTOLA(10),
	ESPADA_AFIADA_ARMEIRO(5),
	MAGIA_NEGRA(8),
	MACHADO_DE_GUERRA_DE_LAMINA_DUPLA(20);
	
	private int dano;
	
	private EnumWeapon(int dano) {
		this.dano = dano;
	}
	
	public int getDano() {
		return this.dano;
	}
	

}
