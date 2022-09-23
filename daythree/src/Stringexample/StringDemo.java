package Stringexample;

public class StringDemo {
public static void main(String[] args) {
	//IN eNGLISH sTRING -group of characters 
	// In String is an object that represents sequence or char value 
	//An array of character.
	// 0 1 2 3 4 
	char[]c = {'H','e','l','l','o'};
	String s = new String(c);//takes array of characters as args
	String str =("Hello");//will get dereffered and is collected by garbage collector
	String str1="hi";
	System.out.println(str1);
}
}
