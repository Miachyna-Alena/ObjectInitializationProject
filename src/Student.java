public class Student {
    public String name;
    public int age;
    public double gradePointAverage;
    public boolean alive;

    //  default constructor (with no params/args)
    public Student() {
        name = "no name";
        age = 16;
        gradePointAverage = 4;
        alive = true;
    }

    //    full constructor with params/args
    public Student(String n, int a, double m, boolean al) {
        name = n;
        age = a;
        gradePointAverage = m;
        alive = al;
    }

    //    copy-constructor
    public Student(Student student) {
        name = student.name;
        age = student.age;
        gradePointAverage = student.gradePointAverage;
        alive = student.alive;

    }

    public String getInformation() {
        return name + ":\nAge = " + age
                + "\nGPA = " + gradePointAverage
                + "\nShe/He is alive? -> " + (alive ? "Yes" : "No");
    }
}
