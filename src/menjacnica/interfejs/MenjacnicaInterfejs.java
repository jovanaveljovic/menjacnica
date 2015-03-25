package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {

	public void dodajKursValute(String v, double pk, double kk, double sk, GregorianCalendar d);
	public void obrisiKursValute(String v, GregorianCalendar d);
	public Kurs pronadjiKursValute(String v, GregorianCalendar d);
	
}
