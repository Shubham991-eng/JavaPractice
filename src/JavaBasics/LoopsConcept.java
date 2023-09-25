package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
 /**
  * Looping is used to perform same activity again and again : eg: printing integers from 1 to 10 
  */
		
		/**
		 * 1. while loop: --> while is keyword so its starting with small letter. 
		 *                    (Disadv: it will genrate infinite loop if you don't give incremental/ decremental part i.e if we don't give i=i+1   
		 */
		
		int i = 1;  //--> to print form zero to 10 just initialization i=0;
		while(i<10) {  //-> this is conditional part  to print from 1-9 just use while (i<10) & to print 0-99 just declare while (i<100);
			System.out.println(i);
			i= i+1; //--> this is called incremental/decremental part this will add +1 in every i value and each time check the condition i.e while (i<=10) and prin the value
		}           // Here we can also use i++ instead of i= i+1
		
		/**
		 * 2.for loop: -->for is keyword so its starting with small letter. --> in this the initialization and conditional part is given
		 * in single line in () bracket
		 *  
		 */
		System.out.println("***********************");//----> just to see the break in the console 
		
		for(int j=1; j<=10; j++) {//--> (initialization, conditional part, inceremental part)  //--> Here we have used j++ instead of j= j+1
			
			System.out.println(j);
		}
		
		System.out.println("**********************");
		
		//--> to print 10 to 1
		
		for (int k=10; k>=1; k--) {//--> (initialization, conditional part, decremental part) 
			System.out.println(k);
		}
		
		System.out.println("**********************");
		
		// --> to print 10 to 0 and 0 to -10
		
		for (int l=10; l>=-10; l--) {
			System.out.println(l);
		}
	}

}
