package it.develhope.encapsulation;

public class Start {
    public static void main(String[] args) {

        System.out.println("-------Creating a new person------");

        Person person = new Person();

        person.setName("Monica");
        System.out.println("Her name is " + person.getName());

        System.out.println("----------------------------------");

        person.setSurname("Poli");
        System.out.println("Her surname is " + person.getSurname());

        System.out.println("----------------------------------");

        person.setHeight(165.57);
        System.out.println("Her height is " + person.getHeight());

        System.out.println("----------------------------------");

        person.setAge(24);
        System.out.println("Her age is " + person.getAge());

        System.out.println("----------------------------------");

    }
}
