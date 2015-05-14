package logicka_kontrola;

public class Pitanja {

	private String pitanje;
	private String odgovor;

	public String getPitanje() {
		return pitanje;
	}

	public void setPitanje(String pitanje) {
		if (pitanje == null || pitanje.isEmpty())
			throw new RuntimeException("Nije uneto pitanje");
		this.pitanje = pitanje;
	}

	public String getOdgovor() {
		return odgovor;
	}

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
