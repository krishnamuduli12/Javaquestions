package JavaQuestions;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 10011011 ;
		int decimal = convertBinaryToDec(num);
		
		System.out.println("The converted decimal number is : "+ decimal);
		

	}
public static int convertBinaryToDec(long num) {
	int  decimalNum = 0;
	int i=0;
	long reminder;
	while(num != 0) {
		reminder= num % 10;
		num = num/10;
		decimalNum += reminder * Math.pow(2, i);
		++i;
		
	}
	return decimalNum;
}

}

