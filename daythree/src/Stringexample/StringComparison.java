package Stringexample;

public class StringComparison {
	// In java we can compare string on the basis of content and reference 
	//By using equals() method
	// By using == operator
	// By comparing To() Method---- in storing
	
	public static void main(String[] args) {
		String str = new String("Hello");
		String s = "Hello";
		String s1 = new String ("Hello");////str==s1 false    s==str false
        
		
		System.out.println(s1==str);
        System.out.println(s==str);
        System.out.println(s.equals(str));
        System.out.println(str.equals(s1));
        
        System.out.println(str.hashCode());
        System.out.println(s1.hashCode());


	}

}
