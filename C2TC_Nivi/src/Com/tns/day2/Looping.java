package Com.tns.day2;

public class Looping {

	public static void main(String[] args) {
		// for looping //
		for(int i = 0;i<=10;i++)
		{
			System.out.println(" i = "+i);
		}
		System.out.println("For loop is finish");
		
		
		// while looping //
		int j=5;
		while(j<10)
		{
			System.out.println("j="+j);
			j++;
		}
		System.out.println("while loop is finished");
		
		// do while //
		int k=4;
		do
		{
			System.out.println(" k = "+k);
			k++;
		}
		while(k<=10);
		System.out.println("do while loop is finished");
		
	}

}
