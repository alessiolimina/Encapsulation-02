package it.develhope.encapsulation;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        System.out.println("-------Creating a new person------");

        Person person = new Person();
        Scanner scanner = new Scanner(System.in);

        person.setName(scanner.nextLine());
        System.out.println("Her name is " + person.getName());

        System.out.println("----------------------------------");

        person.setSurname(scanner.nextLine());
        System.out.println("Her surname is " + person.getSurname());

        System.out.println("----------------------------------");

        person.setHeight(scanner.nextDouble());
        System.out.println("Her height is " + person.getHeight());

        System.out.println("----------------------------------");

        person.setAge(scanner.nextInt());
        System.out.println("Her age is " + person.getAge());

        System.out.println("----------------------------------");

    }
}
