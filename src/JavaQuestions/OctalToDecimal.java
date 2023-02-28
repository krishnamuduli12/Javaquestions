package JavaQuestions;

public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The Converted decimal no is: " + convertOctalToDecimal(116) );

	}

	public static int convertOctalToDecimal(int octal) {
		int decimalNum=0, i = 0;
		
		while(octal != 0) {
			decimalNum += (octal % 10) * Math.pow(8, i);
			++i;
			octal/=10;
			
		}
	return decimalNum;
	}
	
}
