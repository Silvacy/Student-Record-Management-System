public class Student {

    private String name;
    private int id;
    private int age;
    private double grade;

    public Student(String name, int id, int age, double grade) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }
    // No id setter method as ID is unique and should not be changed once assigned
    public void setAge(int age) {
        this.age = age;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void displayStudentInformation() {
        
    System.out.println("\n----- Student Information -----");
    System.out.println("Name : " + name);
    System.out.println("ID   : " + id);
    System.out.println("Age  : " + age);
    System.out.println("Grade: " + grade);
    }



}