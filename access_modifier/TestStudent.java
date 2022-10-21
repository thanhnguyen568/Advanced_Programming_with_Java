package access_modifier;

public class TestStudent {
    public static void main(String[] args) {
        Student studentA = new Student();

        System.out.print("information of studentA before: ");
        System.out.println(studentA);
        System.out.println();

        studentA.setClasses("A0722I1");
        studentA.setName("Thanh");

        System.out.print("information of studentA after: ");
        System.out.println(studentA);
    }

}
