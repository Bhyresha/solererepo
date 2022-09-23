package StringBuffer;

public class StringBufferExample {
	
	public static void main(String[] args) {
		
		
		String x = "abc";
	    x=x.concat("def");
	    System.out.println("x="+x);
        StringBuffer sb= new StringBuffer("fgh");
	    System.out.println("sb="+sb);
	    System.out.println(sb.hashCode());
	    sb.append("ijk");
	    System.out.println("sb="+sb);
	    System.out.println(sb.hashCode());
	    
	    //String class exactly the same API as the StringBuffer  class 
	    //It is not thread safe (not synchronized). it runs fatser than string 
	    
	    sb.insert(2,"hello");
	    System.out.println("sb="+sb);
	    sb.replace(8, 11, "hi");
	    System.out.println("sb="+sb);
	    sb.delete(0, 2);
	    System.out.println("sb="+sb);
	    sb.reverse();
	    System.out.println("sb="+sb);
	    System.out.println(sb.capacity());


		
		StringBuffer sbuff = new StringBuffer();//16
		System.out.println("Default capacity ----"+sbuff.capacity());
		sbuff.append("lunch");//capacity still 16
		System.out.println("capacity ----"+sbuff.capacity());
		System.out.println(sbuff); //(16*2)+2=34
		sbuff.append("its lunch time");//
		System.out.println("capacity ----"+sbuff.capacity());
		
	}
}
