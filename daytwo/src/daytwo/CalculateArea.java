package daytwo;

public interface CalculateArea {

	//abstract method--without body
		public int calculateArea(int length, int breadth); 
		
		default int  calculaterArea(int length, int breadth) {
			return length*breadth;
		}
			default int  calculateperimeter(int length, int breadth) {
				return length+breadth;
		}
		}
		

	



