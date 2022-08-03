
public class AustralianTraffic implements CentralTraffic,ContinentTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a= new AustralianTraffic();
		AustralianTraffic at= new AustralianTraffic();
		ContinentTraffic ct=new AustralianTraffic();
		a.greenGo();
		a.redStop();
		a.flashYellow();
		ct.ContinentT();
		at.walking();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("GreenGo Implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop Implementation");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("redStop Implementation");
		
	}
	
	
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("Walking Implementation");
		
	}

	@Override
	public void ContinentT() {
		// TODO Auto-generated method stub
		System.out.println("Continet Implementation");
	}

}
