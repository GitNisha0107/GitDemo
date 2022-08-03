package JavaPrograms;

public class reverseNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=543;
		int reverse =0;
		
		while(num!=0)
		{
			int digit = num%10;
			
			reverse = digit +reverse*10;
			
			num=num/10;
			
		}
		
		System.out.println(reverse);
		

	}

}
