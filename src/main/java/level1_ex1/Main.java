package level1_ex1;

public class Main {

    public static void main(String[] args) {
        NoGenericMethods obj1 = new NoGenericMethods("Hello", "World", "Java");
        NoGenericMethods obj2 = new NoGenericMethods("Java", "World", "Hello");
        NoGenericMethods obj3 = new NoGenericMethods("World", "Java", "Hola");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);



    }
}
