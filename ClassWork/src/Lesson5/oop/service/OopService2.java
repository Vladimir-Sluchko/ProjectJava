package Lesson5.oop.service;

import Lesson5.oop.dto.Student;

import java.util.Scanner;

public class OopService2 {
    public void run(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите колличество студентов ");
//        Student s = new Student();
        Student [] data = new Student[console.nextInt()];

        for (int i = 0; i < data.length; i++){
            data[i]  = new Student();
            data[i].setAge(10 + i);
            data[i].setName("Илья " + i);

//            Student s = new Student();
//            System.out.println("Введите возраст ");
//            s.setAge(console.nextInt());
//            System.out.println("Введите имя ");
//            s.setName(console.next());
//            data[i] = s;
        }


        for (Student value:data) {
//            ptintStudent(value);
            System.out.println(value);

        }
    }
    public void ptintStudent(Student student){
        System.out.println("Меня зовут " + student.getName());
        System.out.println("Мне " + student.getAge() + " лет");
    }
}
