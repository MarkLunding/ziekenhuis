package ziekenhuis;

import java.util.ArrayList;

public class Ziekenhuis {
	ArrayList<Personeel> personeelsleden = new ArrayList<>();
	ArrayList<Kamer> ziekenhuisKamers = new ArrayList<>();

	Ziekenhuis() {
		ziekenhuisKamers.add(new Operatiekamer());
		ziekenhuisKamers.add(new Verkoeverkamer());
		ziekenhuisKamers.add(new Patientenkamer());

	}
}
