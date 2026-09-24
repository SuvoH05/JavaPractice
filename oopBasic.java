class Student{
    String name;
    int age;

    private int age1;

    void setAge1(int age1){
        if (age1 >= 0) {
            this.age1 = age1;
        }
    }

    int getAge1(){
        return age1;
    }

    void introduce(){
        System.out.println("Hi, I am "+ name);
    }

    void greet(String person){
        System.out.println("Hi, person is "+ person);
    }

    int add(int a,int b){
        return a+b;
    }
}

class oopBasic {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student();

        s1.setAge1(-30);
        System.out.println(s1.getAge1());

        // s1.name = "suvo";
        // s2.name = "hagu";
        // s1.age = 21;
        // s1.age1 = 20;
        // System.out.println(s1.age1);
        // System.out.println(s1.name);
        // System.out.println(s1.age);

        // s1.introduce();
        // s1.greet("GUGUGAGA");
        // System.out.println(s1.add(10, 20));
        // s2.introduce();
    }
}