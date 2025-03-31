package level3_ex1;

import level3_ex1.models.GenericClass;
import level3_ex1.models.SmartPhone;

public class Main {

    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        GenericClass genericClass = new GenericClass();

        genericClass.usePhone(myPhone);
        genericClass.useSmartPhone(myPhone);
    }
}
