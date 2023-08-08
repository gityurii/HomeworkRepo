package OOP.homework6;

import java.util.Objects;

public class Car_Hw5 {
    /* Создать класс Car с какими либо приватными переменными,
        минимум 2 ( на ваш выбор) так что бы они логически подходили,
        например "двигатель", "коробка передач" и т.д. Определить setters и getters
        ( не генерировать через идею, писать самостоятельно) ,
        метод toString и метод Equals, далее создать 2 объекта и сравнить их. */

    private String engine;
    private String gearBox;
    private String color;
    private int price;

    public Car_Hw5(String engine, String gearBox, String color, int price) {
        this.engine = engine;
        this.gearBox = gearBox;
        this.color = color;
        this.price = price;
    }

    public Car_Hw5() {
    }

    public String getEngine() {
        return engine;
    }
    public String getGearBox() {
        return gearBox;
    }
    public String getColor() {
        return color;
    }
    public int getPrice() {
        return price;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car_Hw5 {" +
                "engine='" + engine + '\'' +
                ", gearBox='" + gearBox + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car_Hw5 carHw5 = (Car_Hw5) o;
        return price == carHw5.price
                && Objects.equals(engine, carHw5.engine)
                && Objects.equals(gearBox, carHw5.gearBox)
                && Objects.equals(color, carHw5.color);
    }
    /* Перепишите метод equals так, что бы сравнить объекты только по 1 полю */
    public boolean oneFieldEquals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car_Hw5 carHw5 = (Car_Hw5) o;
        return price == carHw5.price;
    }

}
