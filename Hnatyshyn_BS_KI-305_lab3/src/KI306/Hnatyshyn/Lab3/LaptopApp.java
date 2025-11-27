package KI306.Hnatyshyn.Lab3;

import java.io.FileNotFoundException;

public class LaptopApp {
    public static void main(String[] args) throws FileNotFoundException {
        // Створюємо ноутбук (як нащадок Computer)
        Laptop myLaptop = new Laptop("Apple M2", 3.5, 16, 512, 1.4);

        // Використовуємо методи ноутбука
        myLaptop.openLid();
        myLaptop.turnOn(); // Метод успадкований від Computer
        myLaptop.checkBattery();

        // Використовуємо метод інтерфейсу
        myLaptop.closeLid();
        myLaptop.carry("Університет");

        // Завершуємо роботу
        myLaptop.dispose();
    }
}