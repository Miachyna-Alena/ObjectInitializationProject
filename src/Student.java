public class Student {
    public String name;
    public int age;
    public double gradePointAverage;
    public boolean alive;

    public Student() {
        name = "no name";
        age = 16;
        gradePointAverage = 4;
        alive = true;
    }

    public Student(String n, int a, double m, boolean al){
        name = n;
        age = a;
        gradePointAverage = m;
        alive = al;
    }

    public String getInformation() {
        return name + ":\nAge = " + age
                + "\nGPA = " + gradePointAverage
                + "\nShe/He is alive? -> " + (alive ? "Yes" : "No");
    }
}
