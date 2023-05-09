package patterns;
import entities.Asa_Delta;
import entities.Parapente;
import entities.Paraquedas;
import entities.Voo_Livre;
import entities.Paramotor;

public interface Main {
	public static void main(String[] args) {
			Meio meio = new Meio();
			meio.setDe(new Asa_Delta());
			meio.voarDe();
			
			meio.setDe(new Parapente());
			meio.voarDe();
			
			meio.setDe(new Paraquedas());
			meio.voarDe();
			
			meio.setDe(new Voo_Livre());
			meio.voarDe();
			
			meio.setDe(new Paramotor());
			meio.voarDe();
		}
}
