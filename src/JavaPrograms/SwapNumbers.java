package JavaPrograms;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Swap 2 numbers without using 3rd variable
		
		int x=10;
		int y=15;
		
		x=x+y;  //x=25
		y=x-y; // y=10
		x=x-y;
		
		System.out.println("value of x="+" "+x);
		System.out.println("value of y="+" "+y);
		
	}

}
