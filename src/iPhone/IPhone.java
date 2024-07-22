package iPhone;



public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	
	public void tocarMusica() {
		System.out.println("Tocando Música");
	}

	public void pausarMusica() {
		System.out.println("Pausando Música");
	}

	public void SelecionarMusica(String musica) {
		System.out.println("Tocando a música: "+ musica);
	}
	

	public void ligar(String numero) {
		System.out.println("Lingando para "+numero);
	}

	public void atender() {
		System.out.println("atendido");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciado correio de voz");
	}
	
	
	public void exibirPagina(String url) {
		System.out.println("navegando em: "+url);
	}

	public void adicionarNovaAba() {
		System.out.println("Nova aba");
	}

	public void atualizaPagina() {
		System.out.println("página atualizada!");
	}

}
