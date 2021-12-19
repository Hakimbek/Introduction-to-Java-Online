package account;

public class Client {
    // Имя клиента
    private String name;

    // Конструктор с входными параметрами
    public Client(String name) {
        this.name = name;
    }

    // Default constructor
    public Client() {
    }

    // Методы get- и set-
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}
