package lopinjava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name hoc sinh: ");

        String name = scanner.nextLine();
        System.out.println("Enter name lop ");

        String classes = scanner.nextLine();
        Student student = new Student();

        student.setName(name);
        student.setClasses(classes);

        System.out.println(student.showList());
    }
}