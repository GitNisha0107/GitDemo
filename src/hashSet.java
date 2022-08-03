import java.util.HashSet;
import java.util.Iterator;



public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs= new HashSet<String>();
		hs.add("Nisha");
		hs.add("USA");
		hs.add("INDIA");
		hs.add("INDIA");
		System.out.println(hs);
		
		Iterator<String> i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			
			
		}
		
		
		
		
		
		

	}

}
