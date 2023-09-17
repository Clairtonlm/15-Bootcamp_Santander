package mensenger;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagem;
import apps.Telegram;

public class Computador {

	public static void main(String[] args) {
//		System.out.println("-----MSN------");
//		MSNMessenger msn = new MSNMessenger();
//		msn.enviarMensagem();
//		msn.recebendoMensagem();
//		
//		System.out.println("-----FACEBOOK-----");
//		FacebookMessenger fcb = new FacebookMessenger();
//		fcb.enviarMensagem();
//		fcb.recebendoMensagem();
//		
//		System.out.println("-----TELEGRAN-----");
//		
//		Telegram tlg = new Telegram();
//		tlg.enviarMensagem();
//		tlg.recebendoMensagem();
		
		System.out.println("-----POLI-----");
		
		ServicoMensagem smi = null;
		String appEscolhido = "tlg";
		
		if(appEscolhido.equals("msn")) {
			smi = new MSNMessenger();
		}else if(appEscolhido.equals("fbm")) {
			smi = new FacebookMessenger();
		}else if(appEscolhido.equals("tlg")) {
			smi = new Telegram();
		}
		smi.enviarMensagem();
		smi.recebendoMensagem();
			
		
		
		
	}//fim main
}//fim classe
