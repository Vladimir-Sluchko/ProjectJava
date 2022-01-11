package Lesson10HomeWork.dto;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int number;
    private String name;
    private int age;
    private double grade;
    private boolean partOlimpiad;

    public Student(int number, String name, int age, double grade, boolean partOlimpiad) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.partOlimpiad = partOlimpiad;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean isPartOlimpiad() {
        return partOlimpiad;
    }

    public void setPartOlimpiad(boolean partOlimpiad) {
        this.partOlimpiad = partOlimpiad;
    }

    @Override
    public int compareTo(Student o) {
        return this.number - o.number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return number == student.number && age == student.age && Double.compare(student.grade, grade) == 0 && partOlimpiad == student.partOlimpiad && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, age, grade, partOlimpiad);
    }

    @Override
    public String toString() {
        return "Студент{" +
                "Порядковый номер " + number +
                ", Имя '" + name + '\'' +
                ", Возраст " + age +
                ", Оценка " + grade +
                ", Участвовал в олимпиаде " + partOlimpiad +
                '}' + "\n";
    }
}
