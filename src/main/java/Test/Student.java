package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
        private String name;
        private int age;

        public  Student(String name, int age) {
            this.name = name;
            this.age = age;
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

        public static void main(String[] args) {

            List<Test.Student> studentList = new ArrayList<>();
            studentList.add(new Test.Student("Pea", 20));
            studentList.add(new Test.Student("Ni", 35));
            studentList.add(new Test.Student("Pang", 30));
            studentList.add(new Test.Student("Tum", 25));
            studentList.add(new Test.Student("Sombut", 22));

            Test.Student student =  Collections.max(studentList, Comparator.comparing(s -> s.getAge()));
            System.out.println("The older student is : " + student.getName());

            student =  Collections.min(studentList, Comparator.comparing(s -> s.getAge()));
            System.out.println("The youngest student is : " + student.getName());

        }

}

