package telephone;

import java.util.ArrayList;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        final int NUM_DIGITS = 12;

        // Build the object graph
        PhoneModel model = new PhoneModel();
        Screen screen = new Screen(model);
        KeyPad keyPad = new KeyPad(model);
        
		//create observers
		Observer obj1 = new KeyPad(1);
		
		Observer obj2 = new Screen("Obj2");
		Observer obj3 = new Screen("Obj3");

        // Run the program
        keyPad.simulateKeyPresses(NUM_DIGITS);
        System.out.println("hello");
    }
}
