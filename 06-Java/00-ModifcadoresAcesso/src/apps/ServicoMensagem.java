package apps;

public abstract	class ServicoMensagem {
	
	public abstract void enviarMensagem(); 
	public abstract void recebendoMensagem(); 
	
	//somente os filhos conhecem este metodo
	protected void validarConetadoInternet() {
		System.out.println("Validando conexão á internet");
	}
	protected void salvandoMensagem() {
		System.out.println("Salvando mensagem");
	}

}
