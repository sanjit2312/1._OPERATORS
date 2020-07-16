package operators;

public class BitwiseLogicalOperator2
{

	public static void main(String[] args)
	{
		int a=10;                    //  00001010=10
		int b=a>>2;                 //   00000010=2

		System.out.println("B="+b);
		
		int c=10;                    //  00001010=10
		int d=c<<2;                 //   00101000=40

		System.out.println("D="+d);
		

		int x=-1;                    
		int y=x>>>20;               

		System.out.println("Y="+y);


		int l=30;                    //  00011110=30
		int m=25;                   //   00011001=25
		int n=m|l;                //    00011111=31
		int o=n<<2;               //     01111100=124

		System.out.println("N="+n);
		System.out.println("O="+o);


	}

}
