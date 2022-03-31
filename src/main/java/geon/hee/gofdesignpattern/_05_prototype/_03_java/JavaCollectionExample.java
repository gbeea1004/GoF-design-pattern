package geon.hee.gofdesignpattern._05_prototype._03_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student geonhee = new Student("geonhee");
        Student mozi = new Student("mozi");
        List<Student> students = new ArrayList<>();
        students.add(geonhee);
        students.add(mozi);

        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
