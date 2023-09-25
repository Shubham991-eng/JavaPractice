package JavaBasics;

public class DataTypes {

	    //Hi this is my first java code   to add blue comment simmply use /** befor word and press "shift+enter" at the end of word
	
	/*Hi this is my first 
	java code and i am so happy*/  // "public" "class" "main" "int" "boolean" "double" "char" all are keywords and keywords starts with small letter.
	
	//main() is -->starting /execution point of the program.
	public static void main(String[] args) {
		
		//A) Primitive Data types:--> int, char, double, boolean
		
		
		//1. int:
		
		int i=10;   //int--> data type  i-->variable  10--> value also we cannot delcare same variable data type i. int i=20; as int i=10 already take.
		i=20;  // we can declare another value and now this 20 replace the value of 10 now the new value of i=20.
		int j=30; //-->  the semicolon is mandatory after every java statement
		int k=40;   // Also we cannot declare the value int i= 12.30 because it's decimal so it require floating / double data types.
		int l= -1;
        int p = 0; //--> we see the yellow warning symbol for this row becoz we have not used 'p' any where or we have not printed it
        
        //2. double:
        double d = 12.33;
        double d1 = 34.44;
        double d2 = 100; //--> here i've store integer value 100 into double becoz 100 will be treated as 100.00 hence integer value can be stored into double but double cannot be store into integer i.e int i = 12.33 not possible.
        
        //3. char
        char  c = 'a';  //--> character shouble be written in single quotes.
        char  C1 = 'A'; // --> I can use the character variable  and value in capital letters.
        char C2= '1'; //--> here we can add the number in in character but its not integer valuse as it's declared in single quotes ''
        //char c3 = 'aa'; --> is not allowed becoz char can store a single digit value only.
        char c3 = '$'; //--> special characters are also allowed.
        
        //4. boolean:  //--> this can be either true or false --> here "true" and "false" are values but also are the keywords available in java.
        boolean b1 = true;
        boolean b2 = false;
        
        //5. String: --> Is not a data type it's  a class ( as S is capital) but we can you it as a data type
        String s= "Hello world"; //--->String always written it in double quotes ""
        String s1 = "selenium";
        String s3= "Hi this is my java code";
        String s4 = "1000"; //--> here 1000 not treated as number its treated as string because I written it in double quotes ""   
        String s5 = "12.33";
        
        
        /**To print any value use Sytem.out.println();-->
         * Here System is -->Class  (As 'S' is capital)
         * println() is--> method ( As it followed by the brackets)
         * 
         */
        
        /**so lets print value of j , l and all others int he console/ output screen 
         * Always remember we can only use Sytem.out.println(); after recognising the variable i.e eX: int a =10; if we use 
         * Sytem.out.println(a); before int a =10; --> it will throw the error message because we have not recognized 'a'.
         */
        System.out.println(j);
        System.out.println(l);
        System.out.println(i+j);
        System.out.println(c);
        System.out.println(b1);
        System.out.println(s3);
	}
	

}
