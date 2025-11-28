package KI306.Hnatyshyn.Lab3;

import java.io.*;

public abstract class Computer {
    protected Processor cpu;
    protected RAM memory;
    protected HDD storage;
    protected boolean isPoweredOn;
    protected PrintWriter fout;

    public Computer() throws FileNotFoundException {
        cpu = new Processor("Intel Core i5", 2.5);
        memory = new RAM(8);
        storage = new HDD(512);
        isPoweredOn = false;
        fout = new PrintWriter(new File("Log.txt"));
        fout.print("Створено екземпляр Computer.\n");
        fout.flush();
        System.out.println("[Computer] Створено базовий комп'ютер: CPU=" + cpu.getName() + ", RAM=" + memory.getSize() + "GB.");
    }

    public Computer(String cpuName, double cpuFreq, int ramSize, int hddSize) throws FileNotFoundException {
        cpu = new Processor(cpuName, cpuFreq);
        memory = new RAM(ramSize);
        storage = new HDD(hddSize);
        isPoweredOn = false;
        fout = new PrintWriter(new File("Log.txt"));
        fout.print("Створено екземпляр Computer з параметрами.\n");
        fout.flush();
        System.out.println("[Computer] Ініціалізація системи: " + cpuName + " (" + cpuFreq + "GHz), RAM: " + ramSize + "GB, HDD: " + hddSize + "GB.");
    }

    public void turnOn() {
        isPoweredOn = true;
        fout.print("Комп'ютер ввімкнено.\n");
        fout.flush();
        System.out.println("[System] Живлення УВІМКНЕНО. Завантаження ОС...");
    }

    public void turnOff() {
        isPoweredOn = false;
        fout.print("Комп'ютер вимкнено.\n");
        fout.flush();
        System.out.println("[System] Живлення ВИМКНЕНО. Завершення сеансу.");
    }

    public void dispose() {
        fout.print("Завершення роботи. Лог закрито.\n");
        fout.close();
        System.out.println("[File] Лог-файл успішно збережено та закрито.");
    }
}

// Допоміжні класи
class Processor {
    private String name;
    private double frequency;
    public Processor(String name, double frequency) { this.name = name; this.frequency = frequency; }
    public String getName() { return name; }
}

class RAM {
    private int size;
    public RAM(int size) { this.size = size; }
    public int getSize() { return size; }
}

class HDD {
    private int capacity;
    public HDD(int capacity) { this.capacity = capacity; }
}