package Stringexample;

public class StringOperation {
	

public static void main(String[] args) {
	//01234---- start index position is 0 and end position is length-1
	String hello ="Hello";
	
	System.out.println("Length or size of the string---"+hello.length());
	System.out.println("Index of character 'e' in hello string---"+hello.indexOf('e'));
    System.out.println("Index of character 'l' in hello string ---"+hello.indexOf('l'));
    System.out.println("hello.lastIndexOf('l')");
    System.out.println("Substring from the hello ---"+hello.substring(1,3));
    
    String hi="hi   ";
    System.out.println(hi);
    System.out.println("remove spaces "+hi.trim()); // removes leading and trailing spaces

int num =12345;
String numStr = String.valueOf(num);// converts num value to string
System.out.println(numStr instanceof String);//converts string s1 to integer class
Integer n = Integer.parseInt(numStr);
System.out.println(n instanceof Integer);
System.out.println(n*5);

String emptyString="";
System.out.println(emptyString.isEmpty());// returns null pointer exception

System.out.println(hello.hashCode());
hello=hello.concat("Everyone");//Used to conacte a string to an existing string 
System.out.println("hello");
System.out.println(hello.hashCode());

String leadingSpace = "morning  ";
System.out.println(leadingSpace.trim());// trim() will remove Leading as well as 
String strStrip = "hello World !! ";
System.out.println(strStrip.strip());//It returns a string whose value is given sum 
System.out.println(strStrip.stripLeading());
System.out.println(strStrip.stripTrailing());
System.out.println(strStrip.trim());//this will give you same results as strip()
System.out.println("****************");

strStrip=strStrip.replaceAll(" ", "");
System.out.println("After removing all white spaces ----"+strStrip);
System.out.println(strStrip.toLowerCase());
System.out.println(strStrip.toUpperCase());


String fruit = "Ap ple ";
System.out.println(fruit.length());
System.out.println(fruit.indexOf('l'));
System.out.println(fruit.lastIndexOf("A",2 ));

//api for paragraph --no
System.out.println("***********************");
String paragraph="Hello Everyone, today is very wonderful sunny day.";
String[] splittedParagraph = 

for (String sentence : splittedparagraph) {
	System.out.println(sentence);
	
}
}
}
