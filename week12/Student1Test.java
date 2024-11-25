public class Student1Test {
    public static void main(String[] args) {
        Student1 student = new Student1("Alice",20);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student);
        student.setName("Bob");
        student.setAge(25);
        student.setAge(-5);

        System.out.println("Update Name " + student.getName());
        System.out.println("Update Age: " + student.getAge());

    }
}
