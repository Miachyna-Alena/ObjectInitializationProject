public class Task03 {
    public static void main(String[] args) {
        Student student01 = new Student("Alex", 20, 9.5, true);
//      student01.name = "Alex";
//      student01.age = 20;
//      student01.gradePointAverage = 9.5;
//      student01.alive = true;

        System.out.println(student01.getInformation());

        Student student02 = new Student("Anna", 18, 8, true);
//      student02.name = "Anna";
//      student02.age = 18;
//      student02.gradePointAverage = 8;
//      student02.alive = true;

        System.out.println(student02.getInformation());

        Student student03 = new Student("Harry", 16, 10, true);
//      student03.name = "Harry";
//      student03.age = 16;
//      student03.gradePointAverage = 10;
//      student03.alive = true;

        System.out.println(student03.getInformation());
    }
}