package Baitest;

import java.util.Date;

public class Student {
    private String name;
    private int age;
    private Date dateOfBirth;
    private int phone;
    private String adress;
    private ClassCG classCG;

    public Student(String name, int age, String phone, String adress, ClassCG cl) {
    }

    public Student(String name, int age, Date dateOfBirth, int phone, String adress, ClassCG aClass) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.adress = adress;
        this.classCG = classCG;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public ClassCG getClassCG() {
        return classCG;
    }

    public void setaClass(ClassCG classCG) {
        this.classCG = classCG;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", phone=" + phone +
                ", adress='" + adress + '\'' +
                ", aClass=" + classCG +
                '}';
    }

    public String write(){
        return name + "," + age + "," + dateOfBirth + "," + phone + "," + adress + "," + classCG.getNameClass();
    }
}
