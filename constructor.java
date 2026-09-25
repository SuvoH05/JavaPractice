class Student {
    String name;
    int age;
    int marks;

    Student(String n, int a, int m){
        this.name =n;
        this.age = a;
        this.marks = m;
    }
}

// can do cnstructor overloading


public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student("RajonGandu", 21, 67);
        System.out.println(s1.name+s1.age+s1.marks);
        
    }
    
}