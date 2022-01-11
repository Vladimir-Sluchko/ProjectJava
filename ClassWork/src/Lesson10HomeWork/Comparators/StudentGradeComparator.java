package Lesson10HomeWork.Comparators;

import Lesson10HomeWork.dto.Student;

import java.util.Comparator;

public class StudentGradeComparator implements Comparator<Student> {
    public StudentGradeComparator() {
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGrade()>o2.getGrade() ? -1 : (o1.getGrade()<o2.getGrade() ? 1 : 0);
    }
}
