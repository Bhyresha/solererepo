package confirmedTicket.java;

public class mainTicket {
	public static void main(String[] args) {
	confirmedTicket tkt = new confirmedTicket();
	//if (tkt instanceof Ticket){
	if(tkt instanceof Object) {
System.out.println("tkt is an instance of Ticket");
	}else {
		System.out.println("tkt is not an instance of Ticket");
	}
	
	
	}

}
