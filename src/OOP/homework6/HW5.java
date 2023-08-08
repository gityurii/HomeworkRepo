package OOP.homework6;

import OOP.homework6.Car_Hw5;

public class HW5 {
    public static void main(String[] args) {
        /* Создать класс Car с какими либо приватными переменными,
        минимум 2 ( на ваш выбор) так что бы они логически подходили,
        например "двигатель", "коробка передач" и т.д. Определить setters и getters
        ( не генерировать через идею, писать самостоятельно) ,
        метод toString и метод Equals, далее создать 2 объекта и сравнить их. */
        Car_Hw5 greenCar = new Car_Hw5("1.5L","Manual", "Green",12500);
        Car_Hw5 redCar = new Car_Hw5("2.0L","Automatic", "Red",12500);
        Car_Hw5 notBlackCar = greenCar;

        System.out.println("#1: ");

        /* Выведете объект класса на консоль ( с описанным в нем методом toString).
        По желанию: его(метод toString) можно видоизменить что бы объект вывелся по другому формату. */
        System.out.println("greenCar toString: " + greenCar);
        System.out.println("redCar toString: " + redCar);
        System.out.println("notBlackCar toString: " + notBlackCar);
        System.out.println();

        System.out.println("greenCar == redCar = " + (greenCar == redCar));
        System.out.println("greenCar.equals(notBlackCar) = " + (greenCar.equals(notBlackCar)));
        System.out.println();

        /* Перепишите метод equals так, что бы сравнить объекты только по 1 полю */
        System.out.println("greenCar.equals(redCar) = " + (greenCar.equals(redCar)));
        System.out.println("greenCar.oneFieldEquals(redCar) = " + (greenCar.oneFieldEquals(redCar)));

    }
}
