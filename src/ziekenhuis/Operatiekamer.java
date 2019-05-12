package ziekenhuis;

public class Operatiekamer extends Kamer implements SterieleRuimte {
	private boolean steriel = true;

	Operatiekamer() {
		aantalBedden = 1;
		aantalPatienten = 0;
	}

	public boolean isSteriel() {
		if (steriel = true) {
			return true;
		} else {
			return false;
		}
	}
}
