package comparable_comparator;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double score;

    public Student() {
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.score, score) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(score);
    }

    /*
    0 : Không làm gì cả
    >= 1: Sắp xếp
    <= -1: Không sắp xếp => Ứng dụng trong Collections.reverseOrder()
     */
    // Sắp xếp theo điểm tăng dần
    @Override
    public int compareTo(Student o) {
        return Double.compare(this.score, o.score);

//        int result = this.getName().compareTo(o.getName());
//        if (result == 0) {
//            return (int) (this.getScore() - o.getScore());
//        }
//        return result;
    }

}
