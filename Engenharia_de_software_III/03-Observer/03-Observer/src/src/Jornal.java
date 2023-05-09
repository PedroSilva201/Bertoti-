package src;

import java.util.Observable;
import java.util.Observer;

public class Jornal extends Observable {

	private int edicao;

	public void setNovaEdicao(int novaEdicao) {
		this.edicao = novaEdicao;
		
		setChanged();
		notifyObservers();
	}
	
	public int getEdicao() {
		return this.edicao;
	}
	
	public static void main(String[] args) {
		//poderia receber a nova edicao atraves de um recurso externo
		int novaEdicao = 365;
		Jornal jornalInformatica = new Jornal();		
		Assinante1 assinante1 = new Assinante1(jornalInformatica);
		
		jornalInformatica.setNovaEdicao(novaEdicao);
	}

}