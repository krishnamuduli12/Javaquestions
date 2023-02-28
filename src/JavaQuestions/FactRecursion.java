package JavaQuestions;

public class FactRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Factorial of number is : " + fact(5));
		
	}
	
	public static int fact(int num) {
		if(num >= 1) {
			return num * fact(num -1);
		}
		else 
			return 1;
	}

}
