package Ques02;

public class Elephant extends Animal {
    int height;

    public Elephant(String name, String species, int age, int height) {
        super(name, species, age);
        this.height = height;
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Height: " + height);
    }
}
