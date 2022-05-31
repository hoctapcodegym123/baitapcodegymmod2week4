package io;

import Baitest.ClassCG;
import Baitest.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class ReaderAndWrite {
    public void write(ArrayList<Student> students) {
        File file = new File("student.csv");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student hs : students) {
                bufferedWriter.write(hs.write());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Student> reader(ArrayList<ClassCG> classCGs) {
        ArrayList<Student> students = new ArrayList<>();
        File file = new File("student.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = bufferedReader.readLine();
            while (str != null) {
                String[] arr = str.split(",");
                String name = arr[0];
                int age = Integer.parseInt(arr[1]);
                String phone = arr[2];
                String adress = arr[3];
                String nameClass = arr[4];

                for (ClassCG cl : classCGs) {
                    if (cl.getNameClass().equals(nameClass)) {
                        students.add(new Student(name,age,phone,adress,cl));
                        break;
                    }
                }
                str = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.err.println("File chưa tồn tại.");
        }
        return students;
    }
}
