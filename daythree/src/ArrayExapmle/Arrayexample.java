package ArrayExapmle;

public class Arrayexample {
	
	public static void main(String[] args) {
	
		// Declare an array
		int[] intArr;
		double[] doubleArr;
		double num = 1.0;
		doubleArr = new double [3];
	    intArr = new int[5];
	    System.out.println(intArr[0]);
	    System.out.println(doubleArr[0]);
	    
	    intArr[0] = 1;
	    intArr[1] = 2;
	    intArr[3] = 3;
	    intArr[4] = 4;
	    intArr[5] = 5;
	     // intArr[5]=6;
	    System.out.println(intArr);
	    System.out.println(intArr.toString());
	    
	    System.out.println(intArr[0]);
	    System.out.println(intArr[2]);
	    
	    System.out.println("**************************");
	    //intArr[5] --- 0 1 2 3 4 
	
	    // 1 2  3 4 
	    
	}


}
