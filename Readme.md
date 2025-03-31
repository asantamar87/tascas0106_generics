# Java Generics

This repository contains Java exercises structured into three levels. Each level consists of multiple exercises focusing on different aspects of Java programming, including generics, object-oriented programming, and interface implementation.

## Level 1

### Exercise 1: NoGenericMethods Class
Create a class named `NoGenericMethods` that stores three arguments of the same type. Implement methods to store and retrieve these objects, and a constructor to initialize all three. Ensure that the arguments can be passed in any order when calling the constructor.

### Exercise 2: GenericMethods Class
1. Create a class named `Persona` with attributes: `name`, `surname`, and `age`.
2. Create a class named `GenericMethods` with a generic method that accepts three arguments of generic types. The method should simply print the received arguments.
3. In the `main()` method of the principal class, call the generic method with different types of parameters, such as:
    - An object of the `Persona` class
    - A `String`
    - A primitive type

This demonstrates that any type of parameter can be passed in any order.

## Level 2

### Exercise 1: Modify the Generic Method
Modify the previous exercise so that one of the arguments of the generic method is not generic.

### Exercise 2: Variable-Length Generic Method
Modify the previous exercise so that the generic method accepts a variable-length list of arguments.

## Level 3

### Exercise 1: Implementing an Interface with Generics
This exercise requires an interface and three classes:

1. **Telefon Interface**:
    - Define an interface named `Telefon` with a method `call()`.

2. **Smartphone Class**:
    - Implement the `Telefon` interface.
    - Include an additional method `takePhotos()`.

3. **Generica Class**:
    - Define two generic methods:
        - The first method should accept an argument limited by the `Telefon` interface.
        - The second method should accept an argument limited by the `Smartphone` class.
    - Call the appropriate methods from `Telefon` and `Smartphone` within these methods.

4. **Principal Class**:
    - In the `main()` method, pass a `Smartphone` object to both generic methods in the `Generica` class.
    - Answer the question: _Can the method limited by the `Telefon` interface call the `takePhotos()` method?_

## Technologies Used
- Java

## Author
[Aldo Santa María]

