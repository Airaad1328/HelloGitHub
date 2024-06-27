package com.gmail.clarkin200;

public class PersonClassWork {
    public static void main(String[] args) {
        Person firstPerson = new Person("Renat", 18, "Developer");
        Person secondPerson = new Person("Ilya", 20, "Artis");
        Person thirdPerson = new Person("Bogdan", 30, "Doctor");

        printObject(firstPerson);
        printObject(secondPerson);
        printObject(thirdPerson);

        firstPerson.setProfession("Pilot");
        secondPerson.setAge(27);
        thirdPerson.setName("Dima");

        System.out.println("--After changing data--");

        printObject(firstPerson);
        printObject(secondPerson);
        printObject(thirdPerson);
    }

    public static void printObject(Person data) {
        System.out.println("Name: " + data.getName() + " Age: " + data.getAge() + " profession: " + data.getProfession());
    }
}
