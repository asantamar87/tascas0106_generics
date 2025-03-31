package level3_ex1.models;

import level3_ex1.interficies.Phone;

public class GenericClass {
    public <T extends Phone> void usePhone(T device) {
        device.call();
        // device.takePhotos(); // This would cause a compilation error, That's not possible.
    }

    public <T extends SmartPhone> void useSmartPhone(T device) {
        device.call();
        device.takePhoto();
    }
}
