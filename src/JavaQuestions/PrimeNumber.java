package JavaQuestions;

public class PrimeNumber {

	public static void main(String[] args) {
		//A prime number which is divisible by 1 or by itself 
		
		int num = 29 ;
		boolean flag = false;
		
		for(int i =2; i<= num/2; i++) {
			
			if (num % i == 0) {
				flag = true;
			break;
			}
		}
		
		if(flag) {
			System.out.println("The number is not a Prime number");
		}
		else
		{
			System.out.println("The number is a Prime number");
		}
	}

}
