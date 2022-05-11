package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("jorj");
        cat.setAge(2);
        cat.setColor("black");
        cat.setBreed("tiger");
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getColor());
        System.out.println(cat.getBreed());


        Dog dog = new Dog();
        dog.setAge(5);
        dog.setName("misha");
        dog.setColor("white");
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        System.out.println(dog.getColor());
    }
}
