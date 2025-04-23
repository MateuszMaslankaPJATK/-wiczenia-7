package Zadanie2;

public class Main2 {
    public static void main(String[] args) {
        Car2 myCar = new Car2(5);

        System.out.println("Liczba miejsc: " + myCar.getNumberOfSeats());
        myCar.start();
        myCar.drive(); // nowa metoda
        myCar.honk();  // nowa metoda
        myCar.stop();
    }
}
