package Ques02;

public class Lion extends Animal {
    int weight;

    public Lion(String name, String species, int age, int weight) {
        super(name, species, age);
        this.weight = weight;
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Weight: " + weight);
    }
}
