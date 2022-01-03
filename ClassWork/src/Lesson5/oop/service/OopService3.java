package Lesson5.oop.service;

import Lesson5.oop.dto.Starosta;
import Lesson5.oop.dto.Student;

public class OopService3 {
    public void run(){
        Student student = new Student();
        student.setName("Илья");
        student.setAge(28);

        printStudent(student);

        Starosta starosta = new Starosta();
        starosta.setName("Илья");
        starosta.setAge(22);

        printStudent(starosta);
        System.out.println(starosta);

    }
    public void printStudent(Student student) {
        System.out.println("Меня зовут " + student.getName());
        System.out.println("Мне " + student.getAge() + " лет");
    }
}
