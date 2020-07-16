package operators;

public class BitwiseLogicalOperators 
{

	public static void main(String[] args)
	{
	
		int a=4;                     
		int b=5;
		int and_operator=a&b;           //  a= 0100 (4)
		                               //   b= 0101 (5)
	                                  //   &b= 0100= 4.
		
		int or_operator=a|b;          //    a= 0100 (4)
                                     //     b= 0101 (5)
                                    //    a|b= 0101= 5.

		int ex_or_operator=a^b;        //   a= 0100 (4)
                                      //    b= 0101 (5)
                                     //   a&b= 0001= 1.
	
		int not_operator1=~a;          //  a= 4(0000 0000 0000 0000 0000 0000 0000 0100)
                                     //  ~a=  (1111 1111 1111 1111 1111 1111 1111 1011)
		                            //        (1000 0000 0000 0000 0000 0000 0000 0100)
                                   //         (                                     +1) 
	                              //     ~a=-5(1000 0000 0000 0000 0000 0000 0000 0101)  
	
	
	     int not_operator2=~b;        //  b=5 
	                                //  ~b=-6
	
	
	     System.out.println("AND Operator value is: "+and_operator);
	     System.out.println("OR Operator value is: "+or_operator);
	     System.out.println("EX-OR Operator value is: "+ex_or_operator);
	     System.out.println("NOT Operator value1 is: "+not_operator1);
	     System.out.println("NOT Operator value2 is: "+not_operator2);
	 	
	
	}

}
