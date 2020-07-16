package operators;

public class TernayOperator
{

	public static void main(String[] args)
	{
		
		int a=100;
		int b=60;
		int result1;
		
		result1=a>b?a:b;
		System.out.println("Result 1= "+result1);
		
		int x=100;
		int y=60;
		int z=300;
		int result2;
		
		result2=x>y?(x>z?x:z):(y>z?y:z);
		System.out.println("Result 2= "+result2);
		
		

	}

}
