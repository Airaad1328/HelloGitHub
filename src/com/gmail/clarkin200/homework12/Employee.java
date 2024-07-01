package com.gmail.clarkin200.homework12;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String number;
    private int age;

    Employee(String fullName, String position, String email, String number, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void print() {
        System.out.println(fullName + " " + position + " " + email + " " + number + " " + age);
    }
}


