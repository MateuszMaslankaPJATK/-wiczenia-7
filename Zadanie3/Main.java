package Zadanie3;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Lion(),
                new Wolf()
        };

        for (Animal animal : animals) {
            animal.eat();
            animal.makeSound();
            System.out.println("---");
        }
    }
}
