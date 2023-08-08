package OOP.homework7;

public class Task1 {
    /*Создайте иерархию животных используя где логически необходимо абстрактные классы или интерфейсы,
     должно быть 3 класса животных ( любых) которые должны унаследовать базовые методы из класса родителя,
     далее напишите интерфейсы с какими-либо дополнительными методами,
     например - flyable и допишите к тем животным которым это подходит*/

    public static void main(String[] args) {
        Dog dog = new Dog();
        Frog frog = new Frog();
        Eagle eagle = new Eagle();

        dog.drink();
        dog.jump();
        dog.eat();
        dog.roar();
        System.out.println();

        frog.drink();
        frog.jump();
        frog.eat();
        System.out.println();

        eagle.drink();
        eagle.fly();
        eagle.eat();
        System.out.println();
    }
}

abstract class Animal {
    abstract void drink();
    abstract void eat();
}

interface flyable {void fly();}
interface jumping {void jump();}
interface roaring {void roar();}
class Dog extends Animal implements jumping, roaring{
    @Override
    void drink() {System.out.println("Dog drinks");}
    @Override
    void eat() {System.out.println("Dog eats");}
    @Override
    public void roar() {System.out.println("Dog roars");}
    @Override
    public void jump() {System.out.println("Dog eats");}
}
class Frog extends Animal implements jumping{
    @Override
    void drink() {System.out.println("Frog drinks");}
    @Override
    void eat() {System.out.println("Frog eats");}
    @Override
    public void jump() {System.out.println("Frog jumps");
    }
}
class Eagle extends Animal implements flyable{
    @Override
    void drink() {System.out.println("Eagle drinks");}
    @Override
    void eat() {System.out.println("Eagle eats");}
    @Override
    public void fly() {System.out.println("Eagle flies");
    }
}