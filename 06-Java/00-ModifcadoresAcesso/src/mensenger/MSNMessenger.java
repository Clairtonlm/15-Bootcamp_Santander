package mensenger;

public class MSNMessenger {
	
	public void enviarMensagem() {
		validarConctadoInternet();
		System.out.println("enviando Mensagem");
		salverHistoricoMensagem();
	}
	public void recebendoMensagem() {
		System.out.println("Recebendo Mensagem");
	}
	private void validarConctadoInternet() {
		System.out.println("Conctado");
	}
	private void salverHistoricoMensagem() {
		System.out.println("salvando Histórico Mensagem");
	}
}
