public class Main {
    public static void main(String[] args) {
        // Создаем объект Vehicle (машина)
        Vehicle car = new Vehicle("Toyota", "Camry", 50.0);

        // Создаем объект Client (клиент)
        Client client = new Client("Alisher", "123-456-789");

        // Создаем объект RentalService (сервис аренды)
        RentalService rental = new RentalService(car, client, 3);

        // Выводим информацию об аренде
        rental.displayRentalInfo();
    }
}
