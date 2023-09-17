package apps;

public class MSNMessenger extends ServicoMensagem {

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo MSN");
		
	}

	@Override
	public void recebendoMensagem() {
		System.out.println("Recebendo mensagem pelo MSN");
	}
	
	
	
}
