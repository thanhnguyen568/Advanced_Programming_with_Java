package comparable_comparator;

import java.util.*;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            return (int) (o1.getScore() - o2.getScore());
        }
        return result;
    }

}
