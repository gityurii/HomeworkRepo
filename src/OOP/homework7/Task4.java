package OOP.homework7;

public class Task4 {
    /*
    Создайте класс (сущность) Bill, с атрибутом amount (приватные поля, конструктор, сеттеры и геттеры)
    Создайте класс (сущность) Person, с атрибутами String name, Bill account (приватные поля, конструктор, сеттеры и геттеры)
    Создайте класс (сущность) Сервис или опишите все в методе main - следующие функции -

    Перевод средств на счет пользователя
    Перевод средств со счета пользователя
    Транзакция между пользователями
    У вас должно получиться 2 объекта класса Person (со своим личный счетом (класс Bill))

Пример метода:
    public void replenishment(Bill account, int amount) {
        Внутри метода логика по которому на счет (account) падают средства (amount)
    }
    */
    public static void main(String[] args) {
        Person Ivan = new Person("Ivan", new Bill(10000));
        Person Petya = new Person("Petya", new Bill(5000));

        System.out.println(Ivan);
        System.out.println(Petya);

        int transferAmount = 2000;

        Service transfers = new Service();
        transfers.transfer(Ivan, Petya, transferAmount);

        System.out.println();
        System.out.println("Transaction succeeded: ");
        System.out.println(Ivan.toString());
        System.out.println(Petya.toString());
    }
}

class Bill {
    private int amount;

    public Bill(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    public void addAmount(int amount) {
        this.amount += amount;
    }
    public void subtractAmount(int amount) {
        this.amount -= amount;
    }

    @Override
    public String toString() {
        return "" + amount;
    }
}

class Person {
    String name;
    Bill account;
    public Person(String name, Bill account) {
        this.name = name;
        this.account = account;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Bill getAccount() {
        return account;
    }
    public void setAccount(Bill account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name ='" + name + '\'' +
                ", account ammount = " + account.toString() +
                '}';
    }
}
class Service {

    void transfer(Person p1, Person p2, int amount) {
        p1.getAccount().subtractAmount(amount);
        p2.getAccount().addAmount(amount);
    }
}