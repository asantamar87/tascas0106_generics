package level1_ex2;

public class Main {

    public static void main(String[] args) {

            Person person = new Person("John", "Doe", 37);
            String text = "Hello, world!";
            int num = 40;

        System.out.println("Example 1:");
        GenericMethods.genericMethod(person, text, num);
        System.out.println("\nExample 2:");
        GenericMethods.genericMethod(num, person, text);
        System.out.println("\nExample 3:");
        GenericMethods.genericMethod(text, num, person);


        //
    }
}
