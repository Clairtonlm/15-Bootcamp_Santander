package apps;

public class FacebookMessenger extends ServicoMensagem  {

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Facebook");
		
	}

	@Override
	public void recebendoMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook");
	}
	
	
	
}
