package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Неизвестнов Чебурашка Геннадиевич");
        student.setGroup("3570К");
        student.setEnrollment(new Date());

        System.out.print(student.getFullName() + " зачислен в группу " + student.getGroup() + " ");
        System.out.println(student.getEnrollment());
    }
}
