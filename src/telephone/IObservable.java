package telephone;

public interface IObservable {
	
	
	//method to notify observers of change
	public void notifyObservers();
	
	//method to get updates from subject
	public void getUpdate();
	
	//methods to register and unregister observers
	public void register(IObserver obj);
	public void unregister(IObserver obj);

	
}
