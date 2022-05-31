package Baitest;

import java.util.Date;

public class ClassCG {
    private String nameClass;
    private Date createDay;
    private String course;
    private int quantity;

    public ClassCG() {
    }

    public ClassCG(String nameClass, Date dayJoin, String course, int number) {
        this.nameClass = nameClass;
        this.createDay = dayJoin;
        this.course = course;
        this.quantity = number;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public Date getCreateDay() {
        return createDay;
    }

    public void setCreateDay(Date createDay) {
        this.createDay = createDay;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Class{" +
                "nameClass='" + nameClass + '\'' +
                ", dayJoin=" + createDay +
                ", course='" + course + '\'' +
                ", number=" + quantity +
                '}';
    }

}
