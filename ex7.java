
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
class Teacher extends Person {
    private String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}
public class ex7 {
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30);
        person1.displayInfo();
        Teacher teacher1 = new Teacher("Alice Smith", 40, "Mathematics");
        teacher1.displayInfo();
    }
}


