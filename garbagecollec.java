class Student {
    String name;
}

class garbagecollec {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Suvo";

        s1 = null;
    }
}

// When s1 = null executes, s1 no longer refers to the Student object. If no other references can reach that object, it becomes eligible for garbage collection.

// Important: eligible doesn't mean Java deletes it immediately. The garbage collector decides when to reclaim the memory.


// Java provides:
// System.gc();