/*package lab4.Example;

import java.util.Arrays;

public class Main {
    static void myMethod() {
        System.out.println("In myMethod()! :)");
    }

    public static void main(String[] args) {

        Plane[] students = new Plane[3];

        students[0] = new Plane(2, "ПК-71", "Владимир", "Алещенко", 85.5);
        students[1] = new Plane(2, "ПК-71", "Алексей", "Алещенко", 91.5);
        //...
        students[2] = new Plane(2, "ПК-71", "Борис", "Борисов", 98.0);
        for (Plane student : students) {
            System.out.println(student);
        }

        Arrays.sort(students, new MyComparator());
        System.out.println("+++++++++++");
        for (Plane student : students) {
            System.out.println(student);
        }
        System.out.println("++++++++++++");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
//        System.out.println(Arrays.toString(students));
//        Arrays.sort(students, Comparator.comparing(Student::getSurname).reversed());

        System.out.println("Done!");
    }
}*/