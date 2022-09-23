package daytwo;

public class calculateAreaMain {

	public static void main (String[] args) {
		
		CalculateArea calculateArea = new calculateAreaimpl();
		calculateAreaimpl calculateAreaimpl = new calculateAreaimpl();
		int result = calculateArea.calculateArea(10, 2);

		System.out.println(result);
		
		int perimeter = calculateArea.calculateperimeter(10, 2);
		System.out.println(perimeter);
		
					

	}
}
// control shift t to check for collection