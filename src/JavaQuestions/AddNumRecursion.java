package JavaQuestions;

public class AddNumRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10 ;
		int sum = addNum(num);
		
		System.out.println("Sum of Natural numbers is " + sum);
	}

	public static int addNum(int num) {
		if(num != 0) {
			return num + addNum(num-1);
		}
		else 
			return num;
	}
	
}
