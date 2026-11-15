// Parent Class
class Person {

    void speak() {
        System.out.println("Person can speak");
    }
}

// Child Class
class Teacher extends Person {

    void teach() {
        System.out.println("Teacher can teach");
    }
}

// Main Class
public class InheritanceTest {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();

        teacher.speak();
        teacher.teach();
    }
}