package operators;

public class RelationalOperators
{

	public static void main(String[] args)
	{
	
		int a,b;
		a=10;
		b=20;
		
		boolean equalTo= a==b;                               //  false
		boolean notEqualTo= a!=b;                           //   true
		boolean greaterThan= a>b;                          //    false
		boolean lessThan= a<b;                            //     true
		boolean greaterThanEqualTo= a>=b;                //      false
		boolean lessThanEqualTo= a<=b;                  //       true
		
		System.out.println("Equal To: "+equalTo);
		System.out.println("Not Equal To: "+notEqualTo);
		System.out.println("Greater Than: "+greaterThan);
		System.out.println("Less Than: "+lessThan);
		System.out.println("Greater Than Equal To: "+greaterThanEqualTo);
		System.out.println("Less Than Equal To: "+lessThanEqualTo);


	}

}
