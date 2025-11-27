package KI306.Hnatyshyn.Lab3;

import java.io.*;

/**
 * Абстрактний клас, що описує комп'ютер.
 * @author Hnatyshyn
 * @version 1.0
 */
public abstract class Computer {
    protected Processor cpu;
    protected RAM memory;
    protected HDD storage;
    protected boolean isPoweredOn;
    protected PrintWriter fout;

    /**
     * Конструктор без параметрів.
     * @throws FileNotFoundException якщо не вдалося створити файл логу
     */
    public Computer() throws FileNotFoundException {
        cpu = new Processor("Intel Core i5", 2.5);
        memory = new RAM(8);
        storage = new HDD(512);
        isPoweredOn = false;
        fout = new PrintWriter(new File("Log.txt"));
        fout.print("Створено екземпляр абстрактного класу Computer.\n");
        fout.flush();
    }

    /**
     * Конструктор з параметрами.
     */
    public Computer(String cpuName, double cpuFreq, int ramSize, int hddSize) throws FileNotFoundException {
        cpu = new Processor(cpuName, cpuFreq);
        memory = new RAM(ramSize);
        storage = new HDD(hddSize);
        isPoweredOn = false;
        fout = new PrintWriter(new File("Log.txt"));
        fout.print("Створено екземпляр абстрактного класу Computer з параметрами.\n");
        fout.flush();
    }

    // Методи такі ж, як в Лаб 2, але доступні для нащадків
    public void turnOn() {
        isPoweredOn = true;
        fout.print("Комп'ютер ввімкнено.\n");
        fout.flush();
        System.out.println("System ON.");
    }

    public void turnOff() {
        isPoweredOn = false;
        fout.print("Комп'ютер вимкнено.\n");
        fout.flush();
        System.out.println("System OFF.");
    }

    public void dispose() {
        fout.print("Завершення роботи. Лог закрито.\n");
        fout.close();
    }

    // Інші геттери та методи з Лаб 2 можна залишити тут
    // ... (вони успадкуються автоматично)
}

// Допоміжні класи можна залишити в цьому ж файлі або винести окремо
class Processor {
    private String name;
    private double frequency;
    public Processor(String name, double frequency) { this.name = name; this.frequency = frequency; }
}

class RAM {
    private int size;
    public RAM(int size) { this.size = size; }
    public void setSize(int s) { size = s; }
    public int getSize() { return size; }
}

class HDD {
    private int capacity;
    public HDD(int capacity) { this.capacity = capacity; }
}