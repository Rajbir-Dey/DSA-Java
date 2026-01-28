class Encapsulation {
    // Step 1: private variables which cannot be accessed out of class
    private String name;
    private int age;

    // Step 2: public getters/setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // controlled access
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age; // validation
        } else {
            System.out.println("Age must be positive!");
        }
    }

    
    public static void main(String args[]) {
        Encapsulation s = new Encapsulation();
        s.setName("Raj");
        s.setAge(20);

        System.out.println(s.getName() + " - " + s.getAge());
    }
}


/* roll = money in a locker (private)

getRoll() = bank clerk

You ask the clerk → clerk tells you the amount

You never touch the locker directly */
