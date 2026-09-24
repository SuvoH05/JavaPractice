abstract class Animal{
    abstract void sound();
}

class Dog extends Animal {
    void sound(){
        System.out.println("dog barks!");
    }
}
class Cat extends Animal {
    void sound(){
        System.out.println("Cat meows!");
    }
}

class abstraction{
    public static void main(String[] args) {
        // cant create abstract class object as we said that animal is an incomplete/general concept
        // Animal a = new Animal();
        Animal a = new Dog();
        a.sound();

    }
}