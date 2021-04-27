public class Student extends Human {
    private String groopName;

    public Student(String name, String groopName) {
        super(name);
        this.groopName = groopName;
    }

    public String getGroopName() {
        return groopName;
    }

    public void setGroopName(String groopName) {
        this.groopName = groopName;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());
    }
}
