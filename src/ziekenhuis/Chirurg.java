package ziekenhuis;

public class Chirurg extends MedischPersoneel{
	int OperatiestotBijscholing = 1;
	

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

	
	Patient Opereren (Patient patient) {
		// TODO
		return null;
	}
	
}
