public class Domashka {
    public static void main(String[] args) {
        Student student = new Student("Sasha", "10-52");
        Teacher teacher = new Teacher("Katya", "Technology");

        System.out.println(student.getGroopName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();

        System.out.println(student.getName());
        System.out.println(teacher.getName());
    }
}
