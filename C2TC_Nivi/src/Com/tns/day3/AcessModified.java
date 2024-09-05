package Com.tns.day3;

public class AcessModified {
	// Access Modified //
	int defval = 10;
	private int prival = 20;
	public int pubval = 30;
	protected int proval = 40;
	
	
	// Method //
	void defMethod(){
		System.out.println("Default");
		
	}
	
	private void pubMethod() {
		System.out.println("Public Method");
	}
	
	public void priMethod() {
		System.out.println("Private Method");
	}
	
	protected void proMethod() {
		System.out.println("Protected Method");
	}
	
	public static void main(String[] args) {
		AcessModified ac = new AcessModified();
		System.out.println(ac.pubval);
		System.out.println(ac.prival);
		System.out.println(ac.defval);
		System.out.println(ac.proval);
		
		ac.pubMethod();
		ac.priMethod();
		ac.proMethod();
		ac.defMethod();

	}

}
