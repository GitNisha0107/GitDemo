import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(0, "Hello");
		hm.put(1, "Nisha");
		hm.put(2, "Rohit");

		hm.get(2);
		hm.remove(2);
		Set sn=hm.entrySet();
		Iterator it=sn.iterator();
		while(it.hasNext())
		{
			Map.Entry mp= (Map.Entry)it.next();
			mp.getKey();
			mp.getKey();
		}
	
	}

}
