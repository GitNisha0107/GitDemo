
public class Javaprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int val[]= {4,5,6,4};
		int k=0;
		
		for(int i=0;i<val.length;i++)
		{
			
			if(val[i]%2==0)
			{
				System.out.println("This is even number");
				k++;
				
			}
			
			else
				System.out.println("this is odd number");
		}
		
		System.out.println(k);
	
	}
	
}
	
	


