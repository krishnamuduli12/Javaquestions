package JavaQuestions;

public class LargestAmongThreeNum {

	public static void main(String[] args) {
		
		int x =500;
		int y = 200;
		int z = 500;
		
		
		if (x > y && x>z)
			System.out.println("Num " + x + " is greatest number !!!");
		else if (y>z)
			System.out.println("Num " + y + " is greatest number !!!");
		else
			System.out.println("Num " + z + " is greatest number !!!");
		
		
		if (x >= y) {
			if (x >= z) {
				System.out.println("x is greatest number !!!");
			}
			else {
				
				System.out.println("z is gretest number !!!");
			     }
			}
		else {
			if (y>=z) {
				System.out.println("y is gretest number !!!");
			}
			else {
				System.out.println("z is gretest number !!!");
			}
		}
				
			
		
		
	}

}
