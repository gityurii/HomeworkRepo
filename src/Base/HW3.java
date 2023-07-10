package Base;

public class HW3 {
    public static void main(String[] args) {
        // 1
        System.out.println("#1");
        printSymbols();
        System.out.println();

        //2
        System.out.println("#2");
        System.out.println(cube(4));
        System.out.println();

        //3
        System.out.println("#3");
        System.out.println(someFunc(4));
        someFunc(false);
        System.out.println(someFunc(3, 5));
        System.out.println(someFunc(5, true));
        System.out.println();

        //4
        System.out.println("#4");
        System.out.println(sum(3, 8));
        System.out.println(multi(3, 8));
        System.out.println(sub(3, 8));
        System.out.println(div(3, 8));
        System.out.println();

    }

    /* #1. Написать метод который выводит на экран 3 символа(любые) из таблицы
     * unicode https://wpfan.com.ua/symvoly-yunikod-unicode-shparhalka-2/ */
    public static void printSymbols() {
        System.out.println((char) 914);
        System.out.println((char) 1014);
        System.out.println((char) 1114);
    }

    /* #2. Напишите метод, например public static int getSum(int a) и перегрузите его 8 раз, т.е
     * у вас должно получиться всего 8 методов с одинаковым названием */
    public static int someFunc(int a) {return    a;}
    public static int someFunc(int a, int b) {return    a + b;}
    public static long someFunc(int a, long b) {return a / b;}
    public static int someFunc(int a, boolean b) {
        if (b) return a;
        else return -a;
    }
    public static String someFunc(String a, String b) {return a + b;}
    public static void someFunc(boolean a) {
        System.out.println(a);}
    public static float someFunc(float a, float b, int c) { return    a * b - c;}
    public static double someFunc(double a) { return    a * a;}

    /* #3. Написать метод который возвращает куб числа и вывести на экран */
    public static int cube(int a) {
        return a*a*a;
    }

    /* #4. Напишите основные функции калькулятора - сложение, умножение, вычитание и деление,
     * т.е4 метода принимающие значения */

    public static int sum(int a, int b) {return a + b;}
    public static int multi(int a, int b) {return a * b;}
    public static int sub(int a, int b) {return a - b;}
    public static int div(int a, int b) {return a / b; }

}
