package Lesson10HomeWork;

import Lesson10HomeWork.dto.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Lesson10HomeWork.Service.RandomeStudentService.*;

public class StudentMain1 {
    public static void main(String[] args) {

        List<Student> data = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            int number = 1 + i;
            data.add(new Student(number,String.valueOf(randomName()),Integer.valueOf(randomAge(7,17)),Double.valueOf(randomGrade(0.0,10.0)),Boolean.valueOf(randomPartOlimpiad())));
        }
        System.out.println(data);
    }

}
