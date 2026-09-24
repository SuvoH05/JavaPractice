class Student{
    String name;
    int age;
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "suvo";
        s1.age = 21;

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}