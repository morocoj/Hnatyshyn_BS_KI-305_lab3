package KI306.Hnatyshyn.Lab3;

/**
 * Інтерфейс для переносних пристроїв.
 */
public interface Portable {
    // Метод перенесення пристрою
    void carry(String destination);

    // Перевірка заряду (константа прикладу)
    int MAX_BATTERY_LEVEL = 100;
}