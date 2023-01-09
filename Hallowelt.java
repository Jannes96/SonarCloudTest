package a_1;

public class Hallowelt {

	 static int i = 2;
	 static int j = 5;
	 static int k = 3;
	 static int min ;
	 static int max ;
	
		public static void main(String[] args) {

		
       if (i > j) {
    	   min = j;
    	   max = i;
    	   if (k > i) {
    		   max = k;  		   
    		   }
    	   if (k < j) {
			   min = k;
    	   }
       }
       else {
    	   min = i;
    	   max = j;
    	   if (k < i) {
    		   min = k;  		   
          }
    	   if (k > j) {
			   max = k;
		   }
       }
	
		 
		
		System.out.println(max);
		System.out.println(min);
		
	}
}
	

