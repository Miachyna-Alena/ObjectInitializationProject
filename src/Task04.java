public class Task04 {
    public static void main(String[] args) {
        Student student = new Student("Alex", 20, 10, true);
        Student student01 = new Student(student);
        Student student02 = new Student(student);
        Student student03 = new Student(student);
        Student student04 = new Student(student);
    }
}
