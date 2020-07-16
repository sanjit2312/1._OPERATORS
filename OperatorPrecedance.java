package operators;

public class OperatorPrecedance 
{

	public static void main(String[] args)
	{
		
		int a,b,c,d,e;
		a=10;b=5;c=20;
		d=a*b+c;                       //  d=70
		e=a*(b+c);                     //  e=250
		
		System.out.println("D= "+d);
		System.out.println("E= "+e);
		
		
		int v,w,x,y,z;
		v=1;w=5;x=2;
		y=w<<v + ++x;                       //  x=3,v+x=4,w<<4,5<<4,101<<4=1010000=80.
		z=(w<<v) + ++x;                     //  (w<<v)=5<<1,101<<1,1010=10,10 + ++x =13.
		
		System.out.println("Y= "+y);
		System.out.println("Z= "+z);
		
		
	}

}
