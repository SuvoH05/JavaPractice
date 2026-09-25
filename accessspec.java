// 1️⃣ private
// class Student {
//     private int age;

//     void setAge(int age) {
//         this.age = age;
//     }

//     void showAge(){
//         System.out.println(age);
//     }
// }

// 2️⃣ public

// class Student {
//     public String name;
//     void showName(){
//         System.out.println(name);
//     }
// }

// 3️⃣ default (has default/package-private access.

// It can be accessed by classes in the same package.

// But not normally from a different package.)

class Student {
    
    int age;

}

// 4️⃣ protected (protected allows access:Same package)
// and also Subclasses A subclass can access it even if the subclass is in another package.


class Person {

    protected String name;

}


// MAIN CLASS

class accessspec{
    public static void main(String[] args) {
        Person n = new Person();

        n.name = "Debayan gay";
        System.out.println(n.name);
        
    }
}

// public

// Accessible from anywhere in the program, subject to the accessibility of the containing class.

// private

// Accessible only within the class in which it is declared.

// protected

// Accessible within the same package and by subclasses, including subclasses in other packages subject to Java's protected-access rules.

// default / package-private

// If no access modifier is specified, the member is accessible within the same package.