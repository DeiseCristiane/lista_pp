package telephone;

import java.util.List;
import java.util.Random;

/**
 * Mimic the data input ability of a physical phone's keypad;
 * however, here we're just sending it fake digits.
 */
public class KeyPad implements IObservable {
	
    private final PhoneModel model;
    private List<IObserver> observers;

    public KeyPad(PhoneModel model) {
        this.model = model;
    }
    

    public void setObservers(List<IObserver> observers) {
		this.observers = observers;
		this.notifyObservers();
	}


	public void simulateKeyPresses(int numKeyPresses) {
        final int MAX_DIGIT = 12;
        Random rnd = new Random();
        for (int i = 0; i < numKeyPresses; i++) {
            int newDigit = rnd.nextInt(MAX_DIGIT);
            System.out.println("Pressing: " + newDigit);
            model.addDigit(newDigit);
        }
        
        
    }

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (IObserver observer : observers) {
			observer.numberRecent();
		}
	}

	@Override
	public void getUpdate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void register(IObserver o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void unregister(IObserver o) {
		// TODO Auto-generated method stub
		observers.remove(o);
		
	}
	
	//method to get updates from subject
	public void getUpdate(IObserver o) {
		for (IObserver observer: observers) {
			observer.numberRecent();
			
		}
		
	}
	
	public void printScreen() {
		
		System.out.println("Agora discando: " + observers);
		
	}
	
	

}
