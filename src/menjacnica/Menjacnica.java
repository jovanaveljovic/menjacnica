package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	public void dodajKursValute(String v, double pk, double kk, double sk, GregorianCalendar d) {
	
		for(int i = 0; i<valute.size(); i++){
			if(valute.get(i).getNaziv().equals(v)){
				Kurs k = new Kurs();
				k.setDatum(d);
				k.setKupovniKurs(kk);
				k.setProdajniKurs(pk);
				k.setSrednjiKurs(sk);
				valute.get(i).getKursevi().add(k);
			}
		}

	}

	public void obrisiKursValute(String v, GregorianCalendar d) {
	
	}

	public Kurs pronadjiKursValute(String v, GregorianCalendar d) {
		
		return null;
	}

}
