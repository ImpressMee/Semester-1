import java.util.*;

public class Fahrzeug {

	Collection<Fahrzeug_klassen> dieFahrzKlassen;
	private String kfz_kennzeichen;
	private int groesse;
	private String typ;
	private double kilometerstand = 0;
	private Schaden schaden;

	public int getgroesse() {
		return this.groesse;
	}

	/**
	 * 
	 * @param groesse
	 */
	public void setgroesse(int groesse) {
		this.groesse = groesse;
	}

	public String getTyp() {
		return this.typ;
	}

	/**
	 * 
	 * @param typ
	 */
	public void setTyp(String typ) {
		this.typ = typ;
	}

	public double getKilometerstand() {
		return this.kilometerstand;
	}

	/**
	 * 
	 * @param kilometerstand
	 */
	public void setKilometerstand(double kilometerstand) {
		this.kilometerstand = kilometerstand;
	}

}