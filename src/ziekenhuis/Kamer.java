package ziekenhuis;

public abstract class Kamer {
	int aantalBedden;
	int aantalPatienten;

	boolean isErPlek() {
		if (aantalBedden > aantalPatienten) {
			return true;
		} else {
			return false;
		}
	}

}
