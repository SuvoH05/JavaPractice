class Animal {
    String name;
    void eat(){
        System.out.println("Eating");
    }

    void sleep(){
        System.out.println("Sleeping");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking");

    }
}

class inheritance{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "duglee";
        d.eat();
        d.sleep();
        d.eat();

    }
}