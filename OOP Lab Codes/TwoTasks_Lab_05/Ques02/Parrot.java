package Ques02;

public class Parrot extends Animal {
    String color;

    public Parrot(String name, String species, int age, String color) {
        super(name, species, age);
        this.color = color;
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Color: " + color);
    }
}
