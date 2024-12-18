public class RentalService {
    // Поля (атрибуты)
    private Vehicle vehicle; // Транспортное средство
    private Client client; // Клиент
    private int rentalDays; // Количество дней аренды

    // Конструктор
    public RentalService(Vehicle vehicle, Client client, int rentalDays) {
        this.vehicle = vehicle;
        this.client = client;
        this.rentalDays = rentalDays;
    }

    // Метод для подсчета общей стоимости аренды
    public double calculateTotalPrice() {
        return vehicle.getPricePerDay() * rentalDays;
    }

    // Метод для вывода информации об аренде
    public void displayRentalInfo() {
        System.out.println("Rental Information:");
        client.displayInfo();
        vehicle.displayInfo();
        System.out.println("Rental days: " + rentalDays);
        System.out.println("Total price: $" + calculateTotalPrice());
    }
}
