package JavaQuestions;

public class NumberExpressedAsTwoPrimeNum {

	public static void main(String[] args) {
		// To find out if a number e.g. 34 is expressed as sum of two prime number
		// 34 is sume of two prime number 3+31 5 +29, 11+23, 17+17
		
		//System.out.println(checkPrimeNumber(20));
		
		int num = 34;
		boolean flag =false;
		
		for(int i=2; i <= num/2; i++) {
			if(checkPrimeNumber(i)){
				if(checkPrimeNumber(num-i)) {
					System.out.println(num + " = " + i + " + " + (num-i));
					flag = true;
				}
			}
		}
		
		if(!flag) {
			System.out.println("Can not be expressed as sum of two prime numbers !!! ");
		}
		
	}
	
	public static boolean checkPrimeNumber(int num) {
		boolean isPrime =true;
		for(int i =2; i <= num/2; i++) {
			if(num % i == 0) {
				isPrime = false;
			break;
			}
		}
		return isPrime;
		
	}

}
