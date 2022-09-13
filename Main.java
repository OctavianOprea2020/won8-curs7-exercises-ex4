package course07.exercises.ex4;

public class Main {
    public static void main(String[] args) {
        Student myStudent1 = new Student("Ionescu Ion", 10);
        System.out.println("No of Students:" + myStudent1.getNoOfStudents());
        Student myStudent2 = new Student("Popescu Pop", 7);
        System.out.println("No of Students:" + myStudent2.getNoOfStudents());
        Student myStudent3 = new Student("Georgescu George", 5);
        System.out.println("No of Students:" + myStudent3.getNoOfStudents());

        System.out.println();
        System.out.println(myStudent1.getName());
        System.out.println(myStudent1.getGrade());
        System.out.println("No of Students:" + myStudent1.getNoOfStudents());

        System.out.println();
        System.out.println(myStudent2.getName());
        System.out.println(myStudent2.getGrade());
        System.out.println("No of Students:" + myStudent2.getNoOfStudents());

        System.out.println();
        System.out.println(myStudent3.getName());
        System.out.println(myStudent3.getGrade());
        System.out.println("No of Students:" + myStudent3.getNoOfStudents());

        System.out.println();
        System.out.println("Average Grade (call from Student() class): " + myStudent3.getAverageGrades());

        System.out.println();
        System.out.println("Verify Average from main:");
        float averageGrade = myStudent1.getGrade() + myStudent2.getGrade() + myStudent3.getGrade();
        averageGrade /= myStudent3.getNoOfStudents();
        System.out.println("Average Grade (computed from Main): " + averageGrade);
    }
}
