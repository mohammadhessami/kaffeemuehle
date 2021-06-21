
public class Kaffeemuehle {
	private float ausgabeProUmdrehung;
	private float kaffeebohnenbehaelter;
	private float kaffeebohnenBehaelterWert;

	private float kaffeemehlBehaelter;

	private float kaffeemehlBehaelterWert;

	private boolean geschlossen;

	public Kaffeemuehle(float kaffeebohnenbehaelter, float kaffeemehlBehaelter, float ausgabeProUmdrehung) {
		geschlossen = true;
		this.kaffeebohnenbehaelter = kaffeebohnenbehaelter;
		this.kaffeemehlBehaelter = kaffeemehlBehaelter;
		this.ausgabeProUmdrehung = ausgabeProUmdrehung;
	}

	public void kaffeebohnenbehaelterFuellen(float wert) {
		if (kaffeebohnenBehaelterWert + wert > kaffeebohnenbehaelter) {
			System.out.println("kaffeebohnenbehaelter ist voll ");
			return;
		}
		kaffeebohnenBehaelterWert += wert;

	}

	private float getAusgabeProUmdrehung() {
		return ausgabeProUmdrehung;
	}

	private float getkaffeebohnenbehaelter() {
		return kaffeebohnenbehaelter;
	}

	private float getkaffeebohnenBehaelterWert() {
		return kaffeebohnenBehaelterWert;
	}

	private float getkaffeemehlBehaelter() {
		return kaffeemehlBehaelter;
	}

	private float getkaffeemehlBehaelterWert() {
		return kaffeemehlBehaelterWert;
	}

	private boolean isGeschlossen() {
		return geschlossen;
	}

	public void oeffnen() {
		geschlossen = false;

	}

	public void schliessen() {
		geschlossen = true;
	}

	private void setAusgabeProUmdrehung(float ausgabeProUmdrehung) {
		this.ausgabeProUmdrehung = ausgabeProUmdrehung;
	}

	private void setBefuellung(float kaffeebohnenbehaelter) {
		this.kaffeebohnenbehaelter = kaffeebohnenbehaelter;
	}

	private void setkaffeebohnenBehaelterWert(float kaffeebohnenBehaelterWert) {
		this.kaffeebohnenBehaelterWert = kaffeebohnenBehaelterWert;
	}

	private void setkaffeemehlBehaelter(float kaffeemehlBehaelter) {
		this.kaffeemehlBehaelter = kaffeemehlBehaelter;
	}

	private void setEntnahmeWert(float entnahmeWert) {
		this.kaffeemehlBehaelterWert = entnahmeWert;
	}

	private void setGeschlossen(boolean geschlossen) {
		this.geschlossen = geschlossen;
	}

	@Override
	public String toString() {
		return "Kaffeemuehle [kaffeebohnenBehaelterWert=" + kaffeebohnenBehaelterWert + ", kaffeemehlBehaelterWert=" + kaffeemehlBehaelterWert + "]";
	}

	public void umdrehung() {
		if (!geschlossen) {
			System.out.println("kontroliren Sie kaffeebohnenbehaelter ");
			return;
		}
		if (kaffeebohnenBehaelterWert > 0) {
			if (kaffeemehlBehaelterWert < kaffeemehlBehaelter) {
				kaffeemehlBehaelterWert += ausgabeProUmdrehung;
				kaffeebohnenBehaelterWert -= ausgabeProUmdrehung;
			} else {
				System.out.println("kaffeemehlBehaelter ist voll");
			}
		} else {
			System.out.println("kaffeebohnenbehaelter ist leer");
		}
	}
}
