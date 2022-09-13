package course07.exercises.ex4;

import java.lang.constant.Constable;

public class Student {

    public static int numberOfStudents = 0;
    public static float averageGrades = 0;
    private final String name;
    private final int grade;

    public static float getAverageGrades() {
        return averageGrades;
    }
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        averageGrades = averageGrades * numberOfStudents;
        numberOfStudents++;
        averageGrades = (averageGrades + grade) / numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getNoOfStudents() {
        return numberOfStudents;
    }
}
