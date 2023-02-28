package JavaQuestions;

public class Palindrom {

	public static void main(String[] args) {
		// Palindrom = 12321
		
		int num =12321;
		int rev =0;
		int actualNum = num;
		
		while(num != 0) {
			int n = num%10;
			rev = rev*10 + n;
			num = num/10;
		}
		
		if (rev == actualNum) {
			System.out.println("The number " + actualNum + " is a Palindrom !!!");
		}
		else {
		
			System.out.println("The number " + actualNum + " is not a Palindrom !!!");
		}
		

	}

}
