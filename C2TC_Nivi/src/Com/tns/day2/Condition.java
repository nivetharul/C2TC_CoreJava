package Com.tns.day2;

public class Condition {

	public static void main(String[] args) {
		        //if else condition //
				int a=20;
				int b=10;
				
				if(a<b)
					System.out.println("A is greater than b");
				else 
					System.out.println("B is greater than A");
			

				//else if condition //
				int c=15;
				if(a<c)
					System.out.println("c is greater than a");
				else if(a>c)
					System.out.println("a is greater than c");
				else if(a==c)
					System.out.println("a is equal to c");
				else
					System.out.println("Not be compare");
				
				
				//switch condition //
				int d=3;
				switch(d) {
				case 1:
					System.out.println("case 1 value");
				    break;
				case 2:
					System.out.println("case 2 value");
					break;
				case 3:
					System.out.println("case 3 value");
					break;
					
				default:
					System.out.println("Default Value");
					break;
					
				}
				
				
				
				// break statement //
				int e=4;
				int i;
				for(i=0;i<=10;i++)
				{
					if(i==e)
					{
						break;
				    }
				    System.out.println("i=" + i);
				}
				System.out.println("looping exixt");
				
				
				
				//  continue statement //
				for (int j = 1; j <= 5; j++) {
		            if (j == 4) {
		                continue;  // Skip the rest of the loop body when i equals 5
		            }
		            System.out.println("j = " + j);
				}
				
				

			
	}

}
