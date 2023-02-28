package JavaQuestions;

public class DecimalToOctal {

	public static void main(String[] args) {
		 		
		System.out.println("Decimal No converted to Octal is : " + convertDecimalToOctal(109));

	}

	public static long convertDecimalToOctal(int num) {
		int octalNum =0, i=1;
		
		while(num != 0) {
			
			octalNum += (num % 8) * i;
			num /=	8;
			i *= 10;
		}
	return octalNum;	
	}
}
