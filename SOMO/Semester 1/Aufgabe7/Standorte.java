import java.util.*;

public class Standorte {

	Collection<Reservierung> dieReservierung;
	private String adresse;
	private String telefonnummer;

	/**
	 * 
	 * @param adresse
	 * @param telefonnummer
	 * @param plz
	 */
	public Standorte(String adresse, String telefonnummer, int plz) {
		// TODO - implement Standorte.Standorte
		throw new UnsupportedOperationException();
	}

	public String getAdresse() {
		return this.adresse;
	}

	/**
	 * 
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}