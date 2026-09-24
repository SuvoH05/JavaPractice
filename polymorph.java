class Animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}


class polymorph {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Animal();

        d.sound();
        c.sound();
        a1.sound();
        a2.sound();
        a3.sound();
    }
}