package ziekenhuis;

public class Anesthesist extends MedischPersoneel{
	int OperatiestotBijscholing = 2;
	

	@Override
	public boolean HeeftBijscholingNodig() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean OperatieVoorbereiden() {
		// TODO Auto-generated method stub
		return false;
	}

	
	Patient Verdoven (Patient patient) {
		// TODO
		return null;
	}
	
}
