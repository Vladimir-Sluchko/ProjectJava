package Lesson10HomeWork;

import Lesson10HomeWork.Comparators.StudentAgeFromGrade;
import Lesson10HomeWork.Comparators.StudentGradeComparator;
import Lesson10HomeWork.Comparators.StudentNameComparator;
import Lesson10HomeWork.dto.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import static Lesson10HomeWork.Service.RandomeStudentService.*;

public class StudentMain1 {
    public static void main(String[] args) {

        int minAge = 12;//Задаем минимальный возраст для сортировки
        int minGrade = 8; //Задаем минимальную оценку для сортировки
        int sumAge = 0;
        /*
        * Создаем 10_000 объектов класса Student и помещаем их в коллекцию. Данные заполняются рандомно при момощи методов
        * randomName() - Отдает рандомное имя. Первый символ заглавный остальные прописные от 3 до 10 русских символов
        * randomeAge( x1 , x2) Отдает  рандомный возраст. x1 - минимально создаваемый рандомом возраст. x2 - максимально создаваемый рандомом возраст
        * randomeGrade(x1 , x2 ) Отдает рандомную оценку.x1 - минимально создаваемая рандомом оценка. x2 - максимально создаваемая рандомом оценка
        * randomePartolimpiad() Отдает переменную типа boleean признак участия в олимпиаде true или false
        * */
        List<Student> data = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            int number = 1 + i;
            data.add(new Student(number,String.valueOf(randomName()),Integer.valueOf(randomAge(7,17)),Double.valueOf(randomGrade(0.0,10.0)),Boolean.valueOf(randomPartOlimpiad())));
        }
        /*
        * Отфильтровываем данную коллекцию студентов по следующим параметрам.
        * По возрасту (тем кому minAge = 12 и выше), по оценке (выше minGrade = 8)
        * и помещаем их в отдельный список data2
        * sumAge считает общий возраст отфильтрованых студентов
        * */
        List<Student> data2 = new ArrayList<>();
        for (Student student: data) {
            if(student.getAge() >= minAge && student.getGrade() > minGrade){
                data2.add(student);
                sumAge = sumAge + student.getAge();
            }
        }

        //System.out.println("Отфильтрованная коллекция студентов (Student) " + "Колличество студентов в коллекции " + data2.size());
        //System.out.println(data2);
        System.out.println("Колличество студентов в коллекции " + data2.size());
        System.out.println("Средний возраст отсортированных студентов " + 1.0*(sumAge / data2.size()));
        /*
        * StudentNameComparator() класс компоратор для сортировки поля имени по алфавиту
        */
        data2.sort(new StudentNameComparator());
        /*
        * создаем новый список dataName из топ 10 человек
        * */
        List<Student> dataName = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dataName.add(data2.get(i));
        }
        System.out.println("____________________Топ 10 по имени____________________________ ");
        System.out.println(dataName);
        /*
        *
        * StudentGradeComparator() класс компоратор для сортировки поля оценки по возрастанию*/
        data2.sort(new StudentGradeComparator());
        List<Student> dataGrade = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dataGrade.add(data2.get(i));
        }
        System.out.println("____________________Топ 10 по оценкам____________________________ ");
        System.out.println(dataGrade);
        //System.out.println(data2);

        System.out.println("____________________Топ 10 в каждом возрасте____________________________ ");
        data2.sort(new StudentAgeFromGrade());
        System.out.println("_________________________________________________________ ");
        //System.out.println(data2);
        int maxAge = 17;
        int maxAge2 = 17;
        int b = 0;
        for (Student student:data2) {
            if (maxAge == maxAge2 ){
                System.out.println("____________________ТОП ПО ВОЗРОСТУ " + maxAge + "________________");
            }
            ++maxAge2;
            if (student.getAge() == maxAge && b < 10){
                ++b;
                System.out.println(student);
            } else if (b == 10 && student.getAge() == maxAge){
                --maxAge;
                b = 0;
                System.out.println("____________________ТОП ПО ВОЗРОСТУ " + maxAge + "________________");
            } else if (b < 10 && b != 0){
                --maxAge;
                System.out.println("____________________ТОП ПО ВОЗРОСТУ " + maxAge + "________________");
                System.out.println(student);
            }

        }
    }


}
