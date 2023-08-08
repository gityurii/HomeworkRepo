package OOP.homework7;

public class Task3 {
    /* Создайте класс Car с какими либо параметрами (двигатель, цвет и т.п.),
    сделайте поля приватными и создайте сеттеры  и геттеры,
    укажите какие-нибудь условия на сеттеры для создания объекта*/
    public static void main(String[] args) {
        Car car = new Car();

        car.setColor("Black");
        System.out.println(car.getColor());

        car.setEngine("Automatic 2.0L");
        System.out.println(car.getEngine());

        car.setPrice(19000);
        System.out.println(car.getPrice());

        Car car2 = new Car("Mechanic 1.5L", "Red",15000);
        System.out.println();
    }
}

class Car {
    private String engine;
    private String color;
    private int price;
    public Car() {};
    public Car(String engine, String color, int price) {
        this.engine = engine;
        this.color = color;
        this.price = price;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 0)
            try {
                throw new Exception("Price should be positive value");
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        this.price = price;
    }
}