package Lesson5.oop.service;

import Lesson5.oop.dto.Student;

;

public class OopService1 {
    private Object print;

    public void run(){
        Student s = new Student();
//        int age = s.getAge();
//        String name = s.getName();
//        System.out.println(age);
//        System.out.println(name);
        System.out.println(s.getAge());
        System.out.println(s.getName());
//        System.out.println("Меня зовут " + s.getName());
//        System.out.println("Мне " + s.getAge() + " лет");
        ptintStudent(s);
        System.out.println("____");
        System.out.println(s.getName());

        s.setAge(10);
        s.setName("Илья");
//        System.out.println("Меня зовут " + s.getName());
//        System.out.println("Мне " + s.getAge() + " лет");
        ptintStudent(s);

        System.out.println("____");
        Student s2 = new Student();
//        System.out.println("Меня зовут " + s2.getName());
//        System.out.println("Мне " + s2.getAge() + " лет");

        ptintStudent(s2);
    }
    public void ptintStudent(Student student){
        System.out.println("Меня зовут " + student.getName());
        System.out.println("Мне " + student.getAge() + " лет");
        student.setName("blablab");
    }

}
