package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		/**
		 * String Concatenation (+) here + is concatenation operator
		 */
		int a=100;
		int b=200;
		
		String x="Hello";
		String y="World";
		
		double c=12.33;
		double d=10.33;
		
		System.out.println(a+b); //--> Here the execution always starts from left to right i.e it will check value of 'a' then 'b'
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);//-->left to right execution--> 100+200Hellow+Word+--> 300HelloWorld--> becoz we can add 200 into 100 and then -> 300 into HelloWorld
		
        System.out.println(x+y+a+b);//-->left to right execution--> Hellow+Word+100+200--> HelloWorld100200 --> becoz we can't add 200(integer) into the word HelloWorld100 (String)
	    
        System.out.println(x+y+(a+b));//-->HellowWord(100+200)-->HellowWorld300
	    
	    System.out.println(a+b+x+y+a+x+b+y);//-->3000HelloWorld100Hello200World
	    
	    System.out.println(a+b+x+y+a+b); //-->300HellowWorld100200
	    
	    System.out.println(c+d);
	    
	    System.out.println(x+y+c+d); //-->HelloWorld12.3310.33
	    
	    System.out.println("HelloWorld"); //-->To print any value without initializing the element use double qoutes ""
	    
	    System.out.println("The value of a is:"+a);
	    System.out.println("The value of b is:"+b);
	    System.out.println("The sum of a and b is:"+(a+b));
	    
	    /**
	     *  Difference between System.out.prinln(); and System.out.print();
	     *  print---> used to just print the out put in the console
	     *  printlin---> used to print the output in the console in new line
	     *  Here ln --> means line new
	     *  we use ln to print the output (in console) in new line and if we remove ln then the value is printed in the same line
	     *  
	     *  EG: A) System.out.prinln("Hello");
	     *         System.out.println("World");
	     *         will print as below:-->i.e both words in new line
	     *         Hello
	     *         Word
	     */
	    
	    System.out.println("Hello");
	    System.out.println("World");
	    
	    /**  EG: B) System.out.prin("Hello");
	     *         System.out.print("World");
	     *         will print as below:-->i.e both words in same line
	     *         HelloWord
	     *         
	     */
	    System.out.print("Hello");  //--> print on same line
	    System.out.print("World"); //---> print on the line of "Hello" but due to "ln" new line is created below this (we can check by clicking below this text in console) with no text as below this line we have not written anything .
	    
	}

}
