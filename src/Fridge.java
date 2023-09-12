// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Fridge {
    private int numberOfDoors, capacity, temperature;
    private String brand, color;

    public Fridge(int numberOfDoors, int capacity, int temperature, String brand, String color) {
        this.numberOfDoors = numberOfDoors;
        this.capacity = capacity;
        this.temperature = temperature;
        this.brand = brand;
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Fridge samsungFridge = new Fridge(15, 113, -150, "Saimon", "Оранжевый");

        System.out.println("Бренд холодильника: " + samsungFridge.getBrand());
        System.out.println("Количество дверей: " + samsungFridge.getNumberOfDoors());
        System.out.println("Цвет холодильника: " + samsungFridge.getColor());
        System.out.println("Объем холодильника: " + samsungFridge.getCapacity() + " литров");
        System.out.println("Температура в холодильнике: " + samsungFridge.getTemperature() + " градусов");

    }
}