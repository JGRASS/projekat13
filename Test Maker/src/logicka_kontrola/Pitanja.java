package logicka_kontrola;

/**
 * Klasa predstavlja pitanje i odgovor iz odgovarajuceg predmeta
 *
 * @author Projekat13
 *
 */
public class Pitanja {

	/**
	 * Tekst pitanja na koje je potrebno dati odgovor
	 */
	private String pitanje;
	
	/**
	 * Tekst odgovora na pitanje
	 */
	private String odgovor;

	
	/**
	 * Metoda vraca tekst pitanja
	 * @return pitanje
	 */
	public String getPitanje() {
		return pitanje;
	}

	/**
	 * Metoda postavlja vrednost atributa pitanje na unetu vrednost
	 * @param pitanje
	 * @throws java.lang.RuntimeException ako je uneto null ili prazan String
	 */
	public void setPitanje(String pitanje) {
		if (pitanje == null || pitanje.isEmpty())
			throw new RuntimeException("Nije uneto pitanje");
		this.pitanje = pitanje;
	}

	/**
	 * Metoda vraca test odgovora na pitanja
	 * @return odgovor
	 */
	public String getOdgovor() {
		return odgovor;
	}

	
	/**
	 * Metoda postavlja vrednost atributa odgovor ba unetu vrednost
	 * @param odgovor
	 */
	public void setOdgovor(String odgovor) {
		this.odgovor = odgovor;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pitanja other = (Pitanja) obj;
		if (odgovor == null) {
			if (other.odgovor != null)
				return false;
		} else if (!odgovor.equals(other.odgovor))
			return false;
		if (pitanje == null) {
			if (other.pitanje != null)
				return false;
		} else if (!pitanje.equals(other.pitanje))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pitanja [pitanje=" + pitanje + ", odgovor=" + odgovor + "]";
	}

}
