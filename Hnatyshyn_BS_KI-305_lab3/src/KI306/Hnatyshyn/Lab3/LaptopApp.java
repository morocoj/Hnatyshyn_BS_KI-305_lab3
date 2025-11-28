package KI306.Hnatyshyn.Lab3;

import java.io.FileNotFoundException;

public class LaptopApp {
    public static void main(String[] args) throws FileNotFoundException {
        // Створюємо ноутбук
        Laptop myLaptop = new Laptop("Apple M2", 3.5, 16, 512, 1.4);

        // Тестуємо методи
        myLaptop.openLid();
        myLaptop.turnOn();
        myLaptop.checkBattery();

        myLaptop.closeLid();
        myLaptop.carry("Університет");

        // Завершуємо роботу
        myLaptop.dispose();
    }
}