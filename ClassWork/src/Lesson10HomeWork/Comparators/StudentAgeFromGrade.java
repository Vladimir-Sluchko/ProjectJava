package Lesson10HomeWork.Comparators;


import Lesson10HomeWork.dto.Student;

import java.util.Comparator;

public class StudentAgeFromGrade implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() == o2.getAge()){
            return o1.getGrade()>o2.getGrade() ? -1 : (o1.getGrade()<o2.getGrade() ? 1 : 0);
        }
        return o1.getAge()>o2.getAge() ? -1 : (o1.getAge()<o2.getAge() ? 1 : 0);
    }
}
