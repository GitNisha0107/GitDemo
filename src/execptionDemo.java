
public class execptionDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		int b=0;

		
		try {
			int arr[]=new int[5];
			
			System.out.println(arr[7]);
			
		}
		
		catch(ArithmeticException et)
		{
			System.out.println("I am in Maths catch block");
		}
		
		catch(IndexOutOfBoundsException ets)
		{
			System.out.println("I am in Array Error");
		}
		catch(Exception e)
		{
			System.out.println("I am in catch block");
			
		}
		finally
		{
			System.out.println("Delete Cookies");
		}
		
		
		
		
		
		

	}

}
