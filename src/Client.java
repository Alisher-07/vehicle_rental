public class Client {
    // Поля (атрибуты)
    private String name; // Имя клиента
    private String phoneNumber; // Номер телефона клиента

    // Конструктор
    public Client(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Метод для вывода информации
    public void displayInfo() {
        System.out.println("Client: " + name + ", Phone: " + phoneNumber);
    }
}
