package operators;

public class BooleanLogicalOperators
{

	public static void main(String[] args)
	{
	
		boolean a= true;
		boolean b= false;
		
		boolean result1= a&b;            // false
		boolean result2= a||b;           // true
		boolean result3= a^b;            // true
		boolean result4= a==b;           // false
		boolean result5= a!=b;           // true
		
		System.out.println("Logical AND Operator: "+result1);
		System.out.println("Logical OR Operator: "+result2);
		System.out.println("Logical EX-OR Operator: "+result3);
		System.out.println("Logical EQUAL TO Operator: "+result4);
		System.out.println("Logical NOT EQUAL TO  Operator: "+result5);
	
	}

}
