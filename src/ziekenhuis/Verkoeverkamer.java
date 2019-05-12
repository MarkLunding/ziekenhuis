package ziekenhuis;

public class Verkoeverkamer extends Kamer implements SterieleRuimte {
	private boolean steriel = true;

	Verkoeverkamer() {
		aantalBedden = 2;
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
