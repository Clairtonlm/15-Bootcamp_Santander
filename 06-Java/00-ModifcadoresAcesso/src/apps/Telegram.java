package apps;

public class Telegram extends ServicoMensagem {

	//essa é forma que ela vai implementar
	@Override
	public void enviarMensagem() {
		validarConetadoInternet();
		System.out.println("Enviando mensagem pelo Telagam");
		salvandoMensagem();
	}

	@Override
	public void recebendoMensagem() {
		System.out.println("Recebendo mensagem pelo telagram");
	}
	
	
}
