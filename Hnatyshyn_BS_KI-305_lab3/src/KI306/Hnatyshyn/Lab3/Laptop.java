package KI306.Hnatyshyn.Lab3;

import java.io.FileNotFoundException;

public class Laptop extends Computer implements Portable {

    private int batteryLevel;
    private double weight;
    private boolean isLidOpen;

    public Laptop(String cpuName, double cpuFreq, int ramSize, int hddSize, double weight) throws FileNotFoundException {
        super(cpuName, cpuFreq, ramSize, hddSize);
        this.weight = weight;
        this.batteryLevel = 100;
        this.isLidOpen = false;
        fout.print("Створено ноутбук вагою " + weight + " кг.\n");
        fout.flush();
        System.out.println("[Laptop] Ноутбук готовий до роботи. Вага: " + weight + " кг. Батарея: 100%.");
    }

    @Override
    public void carry(String destination) {
        if (!isLidOpen) {
            fout.print("Ноутбук перенесено в: " + destination + ".\n");
            System.out.println("[Action] Ноутбук успішно транспортовано в локацію: " + destination + ".");
        } else {
            fout.print("Помилка: Не можна нести ноутбук з відкритою кришкою!\n");
            System.out.println("[Error] ОБЕРЕЖНО! Закрийте кришку перед транспортуванням!");
        }
        fout.flush();
    }

    public void openLid() {
        isLidOpen = true;
        fout.print("Кришку ноутбука відкрито.\n");
        fout.flush();
        System.out.println("[Action] Кришку відкрито. Екран активний.");
    }

    public void closeLid() {
        isLidOpen = false;
        fout.print("Кришку ноутбука закрито.\n");
        fout.flush();
        System.out.println("[Action] Кришку закрито. Перехід у режим очікування.");
    }

    public void checkBattery() {
        fout.print("Перевірка батареї: " + batteryLevel + "%.\n");
        System.out.println("[Battery] Поточний рівень заряду: " + batteryLevel + "% (Живлення від мережі не підключено).");
        fout.flush();
    }
}