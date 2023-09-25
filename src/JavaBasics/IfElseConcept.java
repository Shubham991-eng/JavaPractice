package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
 
		/**
		 * Comparison operators:
		 * 1. <
		 * 2. >
		 * 3. <=
		 * 4. >=
		 * 5. ==
		 * 6. !=
		 * 
		 */
		
		/**if() /else() : ----> Here if ---> is keyword (as its started with small letter)-->Inside if() statement we always write some boolean condition i.e either true or false
		 * 
		 */
		
		/**A) Lessthan/ greater than (< / >) operator: 
		 * 
		 */
		int a = 10;
		int b = 20;
		
		if(b>a) { //--> this satisy the condition hence this is true condition hence only If block execute
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is grater than b");
		}
		
		/**B) Equal to Equal to operator (==):   Dont use = (only equal to operator i.e  if(c=d) ) becoz it means we assign value of c into d i.e its a assignment operator and (== is comarison operator)
		 * 
		 */
		
		int c =40;
		int d =40;
		if(c==d) {
			System.out.println("c and d are equal");
		}
		
		else {
			System.out.println("c is not equal to d");
		}
		
		
		/**
		 * C) Write a program to find out highest number out of these 3 numbers: (Use nested if-else)
		 */
		int a1 =100;
		int b1= 200;
		int c1= 300;
		// 1st compare a with b&c with and "&" operator
		
		if(a1>b1 & a1>c1) {  //--> here (false & false = false) --> so this is not executed 
			System.out.println("a1 is the greatest");
		}
		
		else if(b1>c1) { // -->Here just we need to compare b1 with c1 as in above statement we already compared b1 with a1) --> it it false so this is not executed 
			System.out.println("b1 is greatest");
		}
		
		else {
			System.out.println("c1 is greatest");  // if above 2 statements are wrong then this statement is executed
		} 
		
		/**
		 * d) Write a program to find out highest number out of these 4 numbers: (Use else if ladder)
		 */
		
		int a2 =1700;
		int b2= 800;
		int c2= 1100;
		int d2= 1400; 
	
		if (a2>=b2 & a2>=b2& a2>=c2 & a2>=d2) {  //--> If all true then only this will executed
			System.out.println("a2 is greatest");
		}
		
		else if (b2>=a2 && b2>=c2 && b2>=d2) {
			System.out.println(" b2 is greatest");
		}
		
		else if (c2>=a2 && c2>=b2 && c2>=d2) {
			System.out.println("c2 is largest");
		}
		
		else {
			System.out.println("d2 is largest");
		}
	
	}

}
