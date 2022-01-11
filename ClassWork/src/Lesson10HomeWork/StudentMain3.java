package Lesson10HomeWork;

import Lesson10HomeWork.Comparators.StudentAgeFromGrade;
import Lesson10HomeWork.dto.Student;

import java.util.ArrayList;
import java.util.List;

import static Lesson10HomeWork.Service.RandomeStudentService.*;
import static Lesson10HomeWork.Service.RandomeStudentService.randomPartOlimpiad;

public class StudentMain3 {
    public static void main(String[] args) {
        List<Student> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = 1 + i;
            data.add(new Student(number,String.valueOf(randomName()),Integer.valueOf(randomAge(15,17)),Double.valueOf(randomGrade(0.0,10.0)),Boolean.valueOf(randomPartOlimpiad())));
        }

     System.out.println("_________________________________________________________ ");
        data.sort(new StudentAgeFromGrade());
        System.out.println(data);

      int maxAge = 17;
      int b = 0;
      int maxAge2 = 17;

            //int index = data.indexOf(student2.getAge(17));
           // System.out.println(index);

        for (Student student:data) {
            if (maxAge2 == maxAge){
                System.out.println("____________ТОП ПО ВОЗРОСТУ " + maxAge + "_______");
            }
            ++maxAge2;
           if (student.getAge() == maxAge && b < 10){
               ++b;
               System.out.println(student);
           } else if (b == 10 && student.getAge() == maxAge ) {
               --maxAge;
               b = 0;
               System.out.println("____________ТОП ПО ВОЗРОСТУ " + maxAge + "_______");
           } else if (b < 10 && b != 0){
               --maxAge;
               System.out.println("____________ТОП ПО ВОЗРОСТУ " + maxAge + "_______");
               System.out.println(student);
           }


        }
}
}
