package OOP.homework7;

public class Task2 {
/* Воссоздайте систему multilevel наследования, на примере классов A <- B <- C,
 во всех классах перезапишите какой-то метод (любой), продемонстрируйте работу конструкции super.
  из класса С, объясните результат того что вывелось*/

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.method1();
        b.method1();
        c.method1();
        System.out.println("B calls super method of A:");
        b.super_method1();
        System.out.println("C calls super method of B:");
        c.super_method1();
    }
}

class A {
    void method1() {
        System.out.println("Method from class A");
    }
}
// B extends class A, will call super method only 1 level upper (println from A)
class B extends A {
    void method1() {
        System.out.println("Method from class B");
    }
    void super_method1() {
        super.method1();
    }
}
// C extends class B, will call super method only 1 level upper (println from B, not A)
class C extends B {
    void method1() {
        System.out.println("Method from class C");
    }
    void super_method1() {
        super.method1();
    }
}

