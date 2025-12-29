import model.Student;
import models .*;

import java.util.ArrayList;
import java.util.Comparator;

public class MyApplication {

    public static void main(String[] args){

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student());
        list.add(new Student());
        list.add(new Student());
        list.add(new Student());
        list.add(new Student());

        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        })

    }
}