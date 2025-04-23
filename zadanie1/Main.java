package zadanie1;

import Zadanie2.Car2;

public class Main {
    public static void main(String[] args) {
        Car2 myCar = new Car2(5);

        System.out.println("Liczba miejsc: " + myCar.getNumberOfSeats());
        myCar.start(); // Nadpisana metoda
        myCar.stop();  // Nadpisana metoda
    }
}
