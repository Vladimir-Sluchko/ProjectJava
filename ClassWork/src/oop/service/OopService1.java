package oop.service;


import oop.dto.Student;

public class OopService1 {
    public void run(){
        Student s = new Student();
        //int age = s.getAge();
        //String name = s.getName();
        //System.out.println(age);
        //System.out.println(name);
        System.out.println(s.getAge());
        System.out.println(s.getName());
        System.out.println("___");
        //System.out.println("Меня зовут" + s.getName());
        //System.out.println("мне " + s.getAge() + " лет");
        printStudent(s);
        System.out.println("___");
        System.out.println(s.getName());

        s.setAge(18);
        s.setName("Владимир");
        //System.out.println("Меня зовут" + s.getName());
        // System.out.println("мне " + s.getAge() + " лет");
        printStudent(s);

        System.out.println("___");
        Student s2 = new Student();
        s2.setAge(18);
        s2.setName("Владимир");
        printStudent(s2);
    }
    public void printStudent(Student student){
        System.out.println("Меня зовут" + student.getName());
        System.out.println("мне " + student.getAge() + " лет");
        student.setName("blablabla");
    }
}
