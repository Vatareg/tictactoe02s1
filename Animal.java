package ru.ah;

public class Animal {
    private final String name;
    private final int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    protected String animalInfo(){
        return "Animal info";
    }
}
