package level2_ex2;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Aldo", "Santa María", 36);
        GenericMethods genericMethods = new GenericMethods();
      genericMethods.printArguments(person, "Hello World", 100, 45.5, true, "Learning Java");
    }
}
