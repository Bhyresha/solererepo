package daysix;

import java.util.Scanner;

public class ArithmeticOperations {
	 public static void main(String[] args) {
//	        basic();
	        Scanner sc = new Scanner(System.in);
	        String expression = sc.nextLine();
	        String exp[] = expression.split(" ");
	        basic(exp);
	    }
	    public static void basic(String exp[]) {   
//	        String exp[] = {"12", "+", "6", "*", "1","*","6","/","3"};
	        int result=0;
	        for (int i = 1; i < exp.length - 1; i = i + 2) {
	            int counter = 0;
	            counter = i;
	            int res1 = 0;
	            int number1 = 0;
	            int number2 = 0;
	            int number3 = 0;
	          
	            if (i == 1) {
	                number1 = Integer.parseInt(exp[counter - 1]);
	                number2 = Integer.parseInt(exp[counter + 1]);
	                if (exp[i].equals("+")) {
	                    res1 = number1 + number2;
	                } else if (exp[i].equals("-")) {
	                    res1 = number1 - number2;
	                } else if (exp[i].equals("*")) {
	                    res1 = number1 * number2;
	                } else if (exp[i].equals("/")) {
	                    res1 = number1 / number2;
	                }
	                result += res1;
	            } else {
	                int num3 = Integer.parseInt(exp[counter + 1]);
	                if (exp[i].equals("+")) {
	                    result = result + num3;
	                } else if (exp[i].equals("-")) {
	                    result = result - num3;
	                } else if (exp[i].equals("*")) {
	                    result = result * num3;
	                } else if (exp[i].equals("/")) {
	                    result = result / num3;
	                }
	                result += res1;
	            }

	        }
	        System.out.println(result);
	    }



}
