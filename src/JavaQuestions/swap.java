package JavaQuestions;

public class swap {

	public static void main(String[] args) {
		int a =10;
		int b = 15 ;
		
		System.out.println("Before Swapping !!!");
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : "+ b);
		
		int temp ;
		
		temp = a ;
		a = b;
		b = temp ;
		
		System.out.println("After Swapping !!!");
		System.out.println("Value of a : " + a );
		System.out.println("Value of b : " + b);
		
		a = a -b ;
		b = a+b;
		a = b-a;
		
		System.out.println("Again After Swapping !!!");
		System.out.println("Value of a : " + a );
		System.out.println("Value of b : " + b);
		
		

	}

}
