class Animal {

    public Animal(int i){
        System.out.println("Animal eats");
    }
    {
        System.out.println("2");
    }
    
}

class Dog extends Animal {
    Dog(){
        super(2);
        System.out.println("Dog barks");
    }
    
    
}

public class singleinheritance {
    public static void main(String[] args) {
        //Dog d = new Dog();
        //d.eat();  // inherited from Animal

        new Dog();
        
    }
}
