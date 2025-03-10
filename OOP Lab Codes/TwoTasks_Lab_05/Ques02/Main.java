package Ques02;

public class Main {
    public static void main(String[] args) {
        Lion l = new Lion("Mufasa", "Lion", 10, 400);
        Elephant e = new Elephant("Dumbo", "Elephant", 20, 800);
        Parrot p = new Parrot("Tweety", "Parrot", 5, "Green");

        l.displayData();
        System.out.println();
        
        e.displayData();
        System.out.println();
        
        p.displayData();
    }
}
