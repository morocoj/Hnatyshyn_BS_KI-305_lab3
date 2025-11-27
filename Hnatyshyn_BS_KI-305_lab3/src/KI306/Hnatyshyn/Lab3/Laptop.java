package KI306.Hnatyshyn.Lab3;

import java.io.FileNotFoundException;

/**
 * Клас Ноутбук, що розширює Комп'ютер та реалізує інтерфейс Portable.
 * @author Hnatyshyn
 */
public class Laptop extends Computer implements Portable {

    private int batteryLevel;
    private double weight;
    private boolean isLidOpen;

    /**
     * Конструктор ноутбука.
     */
    public Laptop(String cpuName, double cpuFreq, int ramSize, int hddSize, double weight) throws FileNotFoundException {
        // Виклик конструктора батьківського класу Computer
        super(cpuName, cpuFreq, ramSize, hddSize);
        this.weight = weight;
        this.batteryLevel = 100; // Повністю заряджений
        this.isLidOpen = false;
        fout.print("Створено ноутбук вагою " + weight + " кг.\n");
        fout.flush();
    }

    /**
     * Реалізація методу з інтерфейсу Portable.
     */
    @Override
    public void carry(String destination) {
        if (!isLidOpen) {
            fout.print("Ноутбук перенесено в: " + destination + ".\n");
            System.out.println("Laptop carried to " + destination);
        } else {
            fout.print("Не можна нести ноутбук з відкритою кришкою!\n");
            System.out.println("Close the lid first!");
        }
        fout.flush();
    }

    // Власні методи ноутбука
    public void openLid() {
        isLidOpen = true;
        fout.print("Кришку ноутбука відкрито.\n");
        fout.flush();
    }

    public void closeLid() {
        isLidOpen = false;
        fout.print("Кришку ноутбука закрито.\n");
        fout.flush();
    }

    public void checkBattery() {
        fout.print("Перевірка батареї: " + batteryLevel + "%.\n");
        System.out.println("Battery: " + batteryLevel + "%");
        fout.flush();
    }
}