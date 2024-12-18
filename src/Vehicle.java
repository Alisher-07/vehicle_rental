public class Vehicle {
    // Поля (атрибуты)
    private String brand; // Марка машины
    private String model; // Модель машины
    private double pricePerDay; // Цена аренды за день

    // Конструктор
    public Vehicle(String brand, String model, double pricePerDay) {
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
    }

    // Геттеры (методы для получения значений полей)
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    // Сеттеры (методы для изменения значений полей)
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    // Метод для вывода информации
    public void displayInfo() {
        System.out.println("Vehicle: " + brand + " " + model + ", Price per day: $" + pricePerDay);
    }
}
