package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Thanh", 9));
        studentList.add(new Student(2, "Giang", 10));
        studentList.add(new Student(3, "Baby", 8));

        /**
         * Comparable
         */
//        Collections.sort(studentList);

        /**
         * Comparator with class NameComparator
         */
//      Collections.sort(studentList, new NameComparator());

        /**
         * Collection no class implement Comparator
         */
//        Collections.sort(studentList, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                int result = o1.getName().compareTo(o2.getName());
//                if (result == 0) {
//                    return (int) (o1.getScore() - o2.getScore());
//                }
//                return result;
//            }
//        });

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
