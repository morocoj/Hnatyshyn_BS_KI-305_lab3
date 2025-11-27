package KI306.Hnatyshyn.Lab2;

import java.io.FileNotFoundException;

/**
 * Клас-драйвер для тестування класу Computer.
 * @author Hnatyshyn
 * @version 1.0
 */
public class ComputerApp {
    /**
     * Головний метод програми.
     * @param args аргументи командного рядка
     * @throws FileNotFoundException якщо файл логу не створено
     */
    public static void main(String[] args) throws FileNotFoundException {
        // Створення об'єкту з параметрами
        Computer myPC = new Computer("AMD Ryzen 7", 3.8, 16, 1024);

        // Демонстрація методів
        myPC.printSystemInfo();
        myPC.turnOn();
        myPC.runProgram("IntelliJ IDEA");
        myPC.scanForViruses();
        myPC.saveFile(50);
        myPC.saveFile(200);

        // Апгрейд та перевірка
        myPC.upgradeRAM(16);
        myPC.printSystemInfo();

        myPC.formatDrive();
        myPC.turnOff();

        // Важливо: закриваємо файл логу
        myPC.dispose();
    }
}