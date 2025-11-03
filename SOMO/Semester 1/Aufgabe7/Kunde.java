import java.util.*;

public class Kunde {

	Collection<Reservierung> dieReservierung;
	private String name;
	private String geburtsdatum;
	private String bankverbindung;
	private String adresse;
	private int kundennummer;
	private double kundenrabatt;

	/**
	 * gibt eine Kundennummer zur�ck
	 * @param name
	 * @param geburtsdatum
	 * @param bankverbindung
	 * @param adresse
	 */
	public int neuanmeldung(String name, String geburtsdatum, String bankverbindung, String adresse) {
		// TODO - implement Kunde.neuanmeldung
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param kundennumemer
	 * @param passwort
	 */
	public void anmeldung(int kundennumemer, String passwort) {
		// TODO - implement Kunde.anmeldung
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 * @param geburtsdatum
	 * @param adresse
	 * @param kundennummer
	 */
	public void editKunde(String name, String geburtsdatum, String adresse, int kundennummer) {
		// TODO - implement Kunde.editKunde
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param reservierungsnummer
	 */
	public void editBuchung(int reservierungsnummer) {
		// TODO - implement Kunde.editBuchung
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param reservierungsnummer
	 * @param endPreis
	 * @param zahlungsDatum
	 */
	public void rechnungBezahlen(int reservierungsnummer, double endPreis, String zahlungsDatum) {
		// TODO - implement Kunde.rechnungBezahlen
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public double getKundenrabatt() {
		return this.kundenrabatt;
	}

	/**
	 * 
	 * @param kundenrabatt
	 */
	public void setKundenrabatt(double kundenrabatt) {
		this.kundenrabatt = kundenrabatt;
	}

}