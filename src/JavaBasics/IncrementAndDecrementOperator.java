package JavaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {

		// Incremental ++
		// Decremental --
		
		/**
		 * 1. Post increment
		 */
		int i =1;   //--> so the standard execution is first it will check if there is main method or not, then it will check
		int j=i++;  //--> this is called post increment--> here 1st it assign value of i to j (j=i) so 1st value of i =1 so now j is also equal to 1 then i++ means increase value of i by1 so now the new value of i is 2  
		
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("******************************");
		
		int k=2;
	    int l=k++;
	    System.out.println(k);
	    System.out.println(l++);//-->1st value of k =1 so now l is also equal to 2 then k++ means increase value of k by1 so now the new value of k is 3  
	
	    System.out.println("****************************************");
	    
	    
	    /**
		 * 2. pre increment
		 */
	
	    int a= 1;
	    int b= ++a;//-->here we increased a by1 so now a =2 and its given to b so value of b is "2" and as we already increased a by 1 so value of a is also "2"
	    System.out.println(a);
	    System.out.println(b);
	    
	    System.out.println("********************************");
	    
	    /**
	     * 3. post decrement
	     */
	    
	    int m = 2;
	    int n= m--; //--> 1st value of m (i.e 2) assigned to n so n="2" and then decrese the value of m by 1 (m--) so m =2-1 ="1"
	    System.out.println(m);
	    System.out.println(n);
	    
        System.out.println("********************************");
	    
	    /**
	     * 3. pre decrement
	     */
        
        int x = 2;
        int y= --x; //--> 1st reduce x by 1 ( so x= 1) then assign this value to y (so y =1)
        System.out.println(x);
        System.out.println(y);
	}

}
