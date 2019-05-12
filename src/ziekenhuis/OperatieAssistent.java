package ziekenhuis;

public class OperatieAssistent extends MedischPersoneel{
	int OperatiestotBijscholing = 4;
	

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

	
	Void AssisteerOperatie (Chirurg chirurg) {
		// TODO
		return null;
	}
	
}
