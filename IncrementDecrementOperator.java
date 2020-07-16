package operators;

public class IncrementDecrementOperator 
{

	public static void main(String[] args)
	{
		
		int a=20;
		int b=30;
		int c,d;
		c=++a;             //a=21, c=21
		d=b++;             //d=30, b=31
		
		System.out.println("Value of a is: "+a);
		System.out.println("Value of b is: "+b);
		System.out.println("Value of c is: "+c);
		System.out.println("Value of d is: "+d);
		
	/*	
		int a=10;
		int b=20;
		int c= ++a + 1;     //a=11; c=12;
		int d= b++ + 1;     //d=21; b=20(then inc to 21);
		int e= ++a + ++b;   //a=12; b=22; e=34;
		int f= a++ + b++;   //a=12(then inc to 13); b=22(then inc to 23); f=34;
	    int g= a++ + ++a;   //a=14(then inc to 15); g=28;
	    
	    System.out.println("Value of a is: "+a);
		System.out.println("Value of b is: "+b);
		System.out.println("Value of c is: "+c);
		System.out.println("Value of d is: "+d);
		System.out.println("Value of e is: "+e);
		System.out.println("Value of f is: "+f);
		System.out.println("Value of g is: "+g);
		
	*/
		
	}
	

}
