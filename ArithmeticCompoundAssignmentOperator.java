package operators;

public class ArithmeticCompoundAssignmentOperator 
{

	public static void main(String[] args) 
	{
	  
		int a=20;
		a+=4;                            //a=a+4;
		System.out.println("Addition Assignment Operator: "+a);
	
		int b=30;
		b-=5;                           //b=b-5;
		System.out.println("Substraction Assignment Operator: "+b);
		
		int c=50;
		c/=5;                           //c=c/5;
		System.out.println("Division Assignment Operator: "+c);
		
		int d=20;
		d*=4;                           //d=d*4;
		System.out.println("Multiplication Assignment Operator: "+d);
		
		int e=30;
		e%=4;                          //e=e%4
		System.out.println("Modulus Division Assignment Operator: "+e);
		
	}

}
