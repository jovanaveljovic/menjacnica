package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	public void dodajKursValute(String v, double pk, double kk, double sk, GregorianCalendar d) {
	
	
		Kurs k = new Kurs();
		k.setDatum(d);
		k.setKupovniKurs(kk);
		k.setProdajniKurs(pk);
		k.setSrednjiKurs(sk);
		for(int i = 0; i<valute.size(); i++){
			if(valute.get(i).getNaziv().equals(v))
				valute.get(i).getKursevi().add(k);
				
			
		}
		

	}

	public void obrisiKursValute(String v, GregorianCalendar d) {
		for(int i = 0; i<valute.size(); i++){
			if(valute.get(i).getNaziv().equals(v)){
			Valuta valuta = valute.get(i);
			
				for(int j = 0; j<valuta.getKursevi().size(); j++){
					if(valuta.getKursevi().get(j).getDatum().equals(d))
						valuta.getKursevi().remove(valuta.getKursevi().get(j));
				}
			}
		}
	}

	public Kurs pronadjiKursValute(String v, GregorianCalendar d) {
		Kurs k = new Kurs();
		for(int i = 0; i<valute.size(); i++){
			if(valute.get(i).getNaziv().equals(v)){
			Valuta valuta = valute.get(i);
			
				for(int j = 0; j<valuta.getKursevi().size(); j++){
					if(valuta.getKursevi().get(j).getDatum().equals(d))
						k=valuta.getKursevi().get(j);
		
				}
				
			}
		}
		return k;
	}
}
