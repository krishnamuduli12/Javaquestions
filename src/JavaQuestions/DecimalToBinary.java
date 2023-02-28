package JavaQuestions;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		long binary = convertDecimalToBinary(156);
		System.out.println("Binary number is :" + binary);
		
		
	}

	public static long convertDecimalToBinary(int num) {
		long binaryNum =0;
		int remainder = 1, i = 1;
		int step =1;
		
		while (num != 0) {
			remainder = num % 2;
			num = num/2 ;
			binaryNum += remainder *i;
			i = i*10;
		}
		
		return binaryNum;
	}
}
