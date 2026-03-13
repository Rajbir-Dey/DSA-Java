class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {

        Animal a;   // Superclass reference

        // Upcasting
        a = new Dog();  
        a.sound();      // Calls Dog's sound()

        a = new Cat();  
        a.sound();      // Calls Cat's sound()
    }
}