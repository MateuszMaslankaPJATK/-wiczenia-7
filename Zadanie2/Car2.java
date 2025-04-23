package Zadanie2;

import zadanie1.Vehicle;

public class Car2 extends Vehicle {
    private int numberOfSeats;

    public Car2(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void start() {
        System.out.println("Samochód został uruchomiony.");
    }

    @Override
    public void stop() {
        System.out.println("Samochód został zatrzymany.");
    }

    public void drive() {
        System.out.println("Samochód jedzie...");
    }

    public void honk() {
        System.out.println("Samochód trąbi!");
    }
}
