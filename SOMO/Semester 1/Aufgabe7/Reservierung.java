import java.util.*;

public class Reservierung {

	Kunde derKunde;
	Fahrzeug_klassen dieFahrzeug_klassen;
	Fahrzeug dasFahrzeug;
	Collection<Schaden> derSchaden;
	Standorte rueckgabe;
	Collection<Sonderwunsch> dieSonderwuensche;
	Standorte ausleih;
	private int kundennummer;
	private int strafzettelanzahl;
	private static int bearbeitungsgebuehr = 30;
	private static int rueckfuehrungsgebuehr = 50;
	private int reservierungsnummer;
	private double endpreis;
	private boolean bezahlt;
	private String ausleih_datum;
	private double startkilometer = 0;
	private double endKilometer = 0;
	private String rueckgabe_datum;

	public int getKundennummer() {
		return this.kundennummer;
	}

	/**
	 * 
	 * @param kundennummer
	 */
	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}

	/**
	 * 
	 * @param fahrzeugklasse
	 * @param ausleih_standort
	 * @param ausleih_datum
	 * @param rueckgabe_standort
	 */
	public int Reservierung(String fahrzeugklasse, String ausleih_standort, String ausleih_datum, String rueckgabe_standort) {
		// TODO - implement Reservierung.Reservierung
		throw new UnsupportedOperationException();
	}

	public double endpreisBerechnen() {
		// TODO - implement Reservierung.endpreisBerechnen
		throw new UnsupportedOperationException();
	}

	public void stornieren() {
		// TODO - implement Reservierung.stornieren
		throw new UnsupportedOperationException();
	}

	public void rechnungschicken() {
		// TODO - implement Reservierung.rechnungschicken
		throw new UnsupportedOperationException();
	}

	public void reservierungabschliessen() {
		// TODO - implement Reservierung.ss
		throw new UnsupportedOperationException();
	}

	public void sonderPreisaendern() {
		// TODO - implement Reservierung.sonderPreisaendern
		throw new UnsupportedOperationException();
	}

	public void schadenPreisaendern() {
		// TODO - implement Reservierung.schadenPreisaendern
		throw new UnsupportedOperationException();
	}

	public String getAusleih_datum() {
		return this.ausleih_datum;
	}

	/**
	 * 
	 * @param ausleih_datum
	 */
	public void setAusleih_datum(String ausleih_datum) {
		this.ausleih_datum = ausleih_datum;
	}

	public double getStartkilometer() {
		return this.startkilometer;
	}

	/**
	 * 
	 * @param startkilometer
	 */
	public void setStartkilometer(double startkilometer) {
		this.startkilometer = startkilometer;
	}

	public double getEndKilometer() {
		return this.endKilometer;
	}

	/**
	 * 
	 * @param endKilometer
	 */
	public void setEndKilometer(double endKilometer) {
		this.endKilometer = endKilometer;
	}

	public int getStrafzettelanzahl() {
		return this.strafzettelanzahl;
	}

	/**
	 * 
	 * @param strafzettelanzahl
	 */
	public void setStrafzettelanzahl(int strafzettelanzahl) {
		this.strafzettelanzahl = strafzettelanzahl;
	}

	public int getue() {
		// TODO - implement Reservierung.getue
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ue
	 */
	public void setBearbeitungsgebuehr(int ue) {
		// TODO - implement Reservierung.setue
		throw new UnsupportedOperationException();
	}

	public int getRueckfuehrungsgebuehr() {
		return this.rueckfuehrungsgebuehr;
	}

	/**
	 * 
	 * @param rueckfuehrungsgebuehr
	 */
	public void setRueckfuehrungsgebuehr(int rueckfuehrungsgebuehr) {
		this.rueckfuehrungsgebuehr = rueckfuehrungsgebuehr;
	}

	public String getRueckgabe_datum() {
		// TODO - implement Reservierung.getRueckgabe_datum
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param rueckgabe_datum
	 */
	public void setRueckgabe_datum(String rueckgabe_datum) {
		// TODO - implement Reservierung.setRueckgabe_datum
		throw new UnsupportedOperationException();
	}

}