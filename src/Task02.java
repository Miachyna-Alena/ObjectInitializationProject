public class Task02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        student01.name = "Alex";
        student01.age = 20;
        System.out.println(student01.name);
        System.out.println(student01.age);
        System.out.println(student01.gradePointAverage);
        System.out.println(student01.alive);

        Student student02 = new Student();
        student02.name = "Anna";
        student02.age = 18;
        System.out.println(student02.name);
        System.out.println(student02.age);
        System.out.println(student02.gradePointAverage);
        System.out.println(student02.alive);

        Student student03 = new Student();
        student03.name = "Peter";
        student03.age = 21;
        System.out.println(student03.name);
        System.out.println(student03.age);
        System.out.println(student03.gradePointAverage);
        System.out.println(student03.alive);
    }
}
