package level1_ex2;

public class GenericMethods {
    public static <T, U, V> void genericMethod(T arg1, U arg2, V arg3) {
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);
    }
}
