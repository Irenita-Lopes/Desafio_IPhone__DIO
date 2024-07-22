package iPhone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPhone treze = new IPhone();
		treze.ligar("548724575");
		treze.atender();
		treze.iniciarCorreioVoz();
		treze.exibirPagina("teste");
		treze.atualizaPagina();
		treze.adicionarNovaAba();
		treze.tocarMusica();
		treze.SelecionarMusica("Berradeiro de Chico César");
		treze.pausarMusica();
		
	}

}
