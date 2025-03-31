package level2_ex2;


public class GenericMethods {

    public  <T> void printArguments(Person person, T... args) {
        System.out.println("Person: " + person);
        for (T arg : args) {
            System.out.println("Argument: " + arg);
        }
    }
}
