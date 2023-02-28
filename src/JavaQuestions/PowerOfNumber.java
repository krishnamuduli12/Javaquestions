package JavaQuestions;

public class PowerOfNumber {

	public static void main(String[] args) {
		
		//3^4 = 81 
		int base = 4;
		int exp = 4;
		int exp1 = exp;
		
		System.out.println(Math.pow(base, exp));
		
		long result =1;
		
		while(exp != 0) {
			result = result * base;
			--exp;
			
		}
	System.out.println("The Power of " + base + " ^ " + exp1 + " is " + result );
	}
	

}
