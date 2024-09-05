package Com.tns.day3;

public class AcessModified1  {

	public static void main(String[] args) {
		AcessModified ac = new AcessModified();
		System.out.println("Same package but different class");
		System.out.println(ac.pubval);
		//System.out.println(ac.prival); because the private is access only that class // 
		System.out.println(ac.defval);
		System.out.println(ac.proval);
		
        
		ac.priMethod();
		ac.proMethod();
		ac.defMethod();

	

	}

}
