package Baitest;

import io.ReaderAndWrite;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ManageStudent {
    ReaderAndWrite readerAndWrite = new ReaderAndWrite();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<ClassCG> classCGs = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    ManageStudent() {
        classCGs.add(new ClassCG("C0322G1", new Date(), "Java", 28));
        classCGs.add(new ClassCG("C0322G1", new Date(), "PHP", 28));
        students = readerAndWrite.reader(classCGs);
    }


    public void menu() {
        while (true) {
            int choice;
            System.out.println("1. Add Students");
            System.out.println("2. Show Students");
            System.out.println("3. Show Student by Class");
            System.out.println("4. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    try {
                        createStudent();
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:

                    break;
                case 3:
                    findAllByClass();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No option!! Choice again");
                    break;
            }
        }
    }


    public void createStudent() throws ParseException {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter date of birth: ");
        SimpleDateFormat dr = new SimpleDateFormat("dd/MM/yyyy");
        Date dateOfBirth = dr.parse(scanner.nextLine());
        System.out.println("Enter phone: ");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter adress: ");
        String adress = scanner.nextLine();

        for (int i = 0; i < classCGs.size(); i++) {
            System.out.println("  " + (i + 1) + ":" + classCGs.get(i).getNameClass() + " - " + classCGs.get(i).getCourse());
        }
        int choice1 = Integer.parseInt(scanner.nextLine());

        //vị trí choice1 - 1 vì get là lấy index nên phải trừ 1 nếu k thì chon 1 thì sẽ ra lớp thứ 2 ở index 1
        Student student = new Student(name, age, dateOfBirth, phone, adress, classCGs.get(choice1 - 1));
        students.add(student);
    }

    public void findAllByClass() {
        System.out.println("Add class want to show");
        String name = scanner.nextLine();
        for (Student hs : students) {
            if (hs.getClassCG().getNameClass().equals(name)) {
                System.out.println(hs);
            }

        }
    }

    public void showAll(){
        for (Student hs : students) {
            System.out.println(hs);
        }
    }
}
