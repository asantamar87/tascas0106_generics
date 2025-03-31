package level2_ex1;

public class GenericMethods {
    public static <T, U> void genericMethod(Person person, T arg1, U arg2) {
        System.out.println("Person: " + person);
        System.out.println(arg1);
        System.out.println(arg2);
    }
}


