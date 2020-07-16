package operators;

public class ShortCircuitOperator
{

	public static void main(String[] args)
	{
	
		int a=10,b=20;
		
		boolean result1= a<5 && b>10;                   // false
		boolean result2= a<20 && b==30;                 // false
		boolean result3= a<25 && b!=5;                  // true
		boolean result4= a<7 || b>20;                   // false
		boolean result5= a<30 || b!=20;                 // true
		boolean result6= a==5 || b>6;                   // true

		System.out.println("Short Circuit AND Operator1: "+result1);
		System.out.println("Short Circuit AND Operator2: "+result2);
		System.out.println("Short Circuit AND Operator3: "+result3);
		System.out.println("Short Circuit OR Operator1: "+result4);
		System.out.println("Short Circuit OR Operator2: "+result5);
		System.out.println("Short Circuit OR Operator3: "+result6);
	
	}

}
