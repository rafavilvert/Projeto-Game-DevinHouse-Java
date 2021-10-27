package gameAction;

public enum EnumGameAction {

	VINGANCA("Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar\n"
			+ "para lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo,\n"
			+ "quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o combustível\n"
			+ "que te fizeram chegar até aqui. E você sabe que não irá desistir até ter vingado a morte daqueles\n"
			+ "que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo. O maldito líder\n"
			+ "finalmente pagará por tanto mal causado na vida de tantos (e principalmente na sua)."),
	GLORIA("Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços\n"
			+ "abertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e\n"
			+ "diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde\n"
			+ "já, você sente o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir\n"
			+ "o vilão que tanto assombrou a paz de todos. Porém, você sabe que ainda falta o último ato dessa\n"
			+ "história. Você se concentra na missão. A glória o aguarda, mas não antes da última batalha."),
	DESISTIR("o medo invade o seu coração e você sente que ainda não está à altura do desafio.\n"
			+ "Você se volta para a noite lá fora e corre em direção à segurança."), 
	SEGUIR("você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente\n"
			+ "uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta\n"
			+ "aberta."), 
	SALTANDO("Você se concentra e pula em direção à luz, saltando de antes da porta até o interior\n"
			+ "da sala."), 
	ANDANDO("Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você\n"
			+ "pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado\n"
			+ "em uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se\n"
			+ "abre no teto atrás de você, no corredor. Flechas voam da escotilha em sua direção, e você salta\n"
			+ "para dentro da sala, porém uma delas te acerta na perna. [toma dano utilizando mecanismo de\n"
			+ "ataque descrito abaixo, porém o rolamento de dados é só de 1-10]"), 
	CORRENDO("Você respira fundo e desata a correr em direção à sala. Quando passa pela porta,\n"
			+ "sente que pisou em uma pedra solta, mas não dá muita importância e segue para dentro da sala,\n"
			+ "olhando ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de flechas\n"
			+ "batendo na pedra atrás de você, e quando se vira, vê várias flechas no chão. Espiando pela porta,\n"
			+ "você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto,\n"
			+ "mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa."), 
	PORTA_DIREITA("Você se aproxima, tentando ouvir o que acontece porta adentro, mas não\n"
			+ "escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a\n"
			+ "outra. Ao entrar, você se depara com uma sala espaçosa, com vários equipamentos de batalha\n"
			+ "pendurados nas paredes e dispostos em armários e mesas. Você imagina que este seja o arsenal\n"
			+ "do inimigo, onde estão guardados os equipamentos que seus soldados utilizam quando saem\n"
			+ "para espalhar o terror nas cidades e vilas da região.\n"
			+ "Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar\n"
			+ "para trás. Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um\n"
			+ "dos capitães do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em\n"
			+ "posição de combate. Ele avança em sua direção."), 
	PORTA_ESQUERDA("Você retorna à sala anterior e se dirige à porta da esquerda. Você se\n"
			+ "aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais\n"
			+ "força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara\n"
			+ "com uma sala parecida com a do arsenal, mas em vez de armaduras, existem vários potes e\n"
			+ "garrafas de vidro com conteúdos misteriosos e de cores diversas, e você entende que o capitão\n"
			+ "que vive ali, realiza experimentos com diversos ingredientes, criando poções utilizadas pelos\n"
			+ "soldados para aterrorizar a região.\n"
			+ "No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo. Um orque\n"
			+ "horrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção."),
	PORTA_PRINCIPAL("De volta à sala das portas, você se dirige à porta final. Coloca as chaves nas fechaduras, e a\n"
			+ "porta se abre. Seu coração acelera, memórias de toda a sua vida passam pela sua mente, e você\n"
			+ "percebe que está muito próximo do seu objetivo final. Segura sua arma com mais firmeza, foca\n"
			+ "no combate que você sabe que irá se seguir, e adentra a porta.\n"
			+ "Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e\n"
			+ "prisioneiros acorrentados às paredes.\n"
			+ "Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de\n"
			+ "lâmina dupla.");

	private String message;

	private EnumGameAction(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

}
