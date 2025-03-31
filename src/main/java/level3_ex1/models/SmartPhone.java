package level3_ex1.models;

import level3_ex1.interficies.Phone;

public class SmartPhone implements Phone {
    @Override
    public void call() {
        System.out.println("Calling...");
    }

    public void takePhoto() {

        System.out.println("Taking photo...");
    }
}
