public class Constructors {
    // constructors is a special method
    //  which is invoked automatically at the time of object creation.
    // - Constructors have the same name as class or structure
    // - constructors don't have a return type. (Not even void)
    // - constructors are only called once, at object creation
    // - Memory allocation happens when constructore is called.

    public static void main(String[] args) {
        Student s1 = new Student();
        // System.out.println(s1);

        Student s2 = new Student("Nishan");
        Student s3 = new Student(423);
        System.out.println(s2.name);
        

    }
}

class Student {
    String name;
    int roll;

    Student(){
        System.out.println("Non-parameterized Constructors");
        
    }

    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll=roll;
    }
}
