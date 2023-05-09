package src;

import java.util.Observable;
import java.util.Observer;

class Assinante1 implements Observer {
	
	Observable jornalInformatica;
	
	int edicaoNovoJornal;
	
	public Assinante1(Observable jornalInformatica) {
		this.jornalInformatica = jornalInformatica;
		jornalInformatica.addObserver(this);
	}
	
	@Override
	public void update(Observable jornalInfSubject, Object arg1) {
		if (jornalInfSubject instanceof Jornal) {
			Jornal jornalInformatica = (Jornal) jornalInfSubject;
			edicaoNovoJornal = jornalInformatica.getEdicao();
			System.out.println("Atenção, já chegou a mais uma edição de 'Gazeta Jornal da Informatica!!!'. " +
					"Esta é a sua edição número: " + edicaoNovoJornal);
		}
	}	
}