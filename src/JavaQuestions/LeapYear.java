package JavaQuestions;

public class LeapYear {

	public static void main(String[] args) {
		//divisible by 4 for all the century years ends with 00
		//Century year is a leap year if it is divisible by 400
		//1900 is not a leap year
		//2012 is a leap year 
		
		int year = 2012;
		boolean leap = false;
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					leap = true;
				}
				else {
					leap = false;
				}
			}
			else {
				leap = true;
			}
		}
		else {
			leap = false;
		}
		
		if (leap)
		 System.out.println("Its a Leap Year !!!");
		else
			System.out.println("Its not a Leap Year !!!");
		
	}

}
