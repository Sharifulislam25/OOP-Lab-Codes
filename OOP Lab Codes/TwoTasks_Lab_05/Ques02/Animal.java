package Ques02;

public class Animal {
    String name;
    String species;
    int age;

    // Correct constructor without void
    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age);
    }
}
