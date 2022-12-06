package telephone;



public class Screen implements IObserver{

	private final PhoneModel model;

	

	public Screen(PhoneModel model) {
		this.model = model;
	}



	public void numberRecent() {
		// TODO Auto-generated method stub
		
		System.out.println(model.getLastNumber());
		
	}



	public void listNumbers() {
		// TODO Auto-generated method stub
		
	}
	

	


}
