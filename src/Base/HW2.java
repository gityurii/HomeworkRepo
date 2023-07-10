package Base;

import java.util.Scanner;

public class HW2 {
    static int iterations_quick = 0;
    static int iterations_bubl = 0;
    public static void main(String[] args) {
        /* #1.1
         * Создать массив integers, и с помощью класса scanner определить его размер,
         * например - int [] array = new int [ ' тут должно быть число со сканнера'],
         * далее заполнить этот массив данными (любыми, используя цикл for) и потом
         * вывести все значения на экран, так же используя цикл for
         */
        System.out.println();
        System.out.println("Task #1.1");

        Scanner scanner = new Scanner(System.in);
        System.out.println("input number ");
        int [] integers = new int[scanner.nextInt()];

        for (int i = 0; i < integers.length; i++)
            integers [i] = i*2;

        for (int i: integers) {
            System.out.println(i);
        }

        /* #2
         * Используя вложенный цикл for, вывести на экран таблицу умножения наоборот
         * (как делали на занятии)
         */
        System.out.println();
        System.out.println("Task #1.2");

        int c = 5;
        for (int i = c; i >= 1; i--) {
            for (int j = c; j >= 1; j--) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }

        /* #3
         * Напишите любые примеры использования, циклов while и do - while по одному
         * на каждый цикл. (можно самые простые)
         */
        System.out.println();
        System.out.println("Task #1.3");

        int d = 1;
        int e = 10;
        while (d <= e) {
            System.out.println("d * e = " + d + " * " + e + " = " + d * e);
            d++;
            e--;
        }

        int f;
        do {
            System.out.println("input number ");
            f = scanner.nextInt();
            if (f > 0) System.out.println("go on");
            else System.out.println("stop");
        } while (f > 0);

        /* #4
         * Создайте двух мерный массив чисел, например int [] [] array = new [4][8] и
         * заполните его данными через вложенные циклы и выведите на экран его значения,
         * через другие вложенные циклы
         */
        System.out.println();
        System.out.println("Task #1.4");

        int [] [] array = new int [4][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array [i][j] = i + j;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        /* #1
         * Используя вложенные циклы for найдите минимальное число в массиве.
         * (Подсказка - создайте переменную с очень большим числом и
         * сравнивайте значение из массива с этим большим числом, если число из массива
         * меньше = присваивайте новое)
         */
        System.out.println();
        System.out.println("Task #2.1");

        int [][] array2 = {{3, 6, 1, 8, 0, -2}, {4, -3, 0}};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (array2[i][j] < min) {
                    min = array2[i][j];
                    System.out.println("найден новый минимум = " + min);
                }
            }
        }
        System.out.println("минимум в массиве = " + min);

        /* #2
         * Используя интернет, найдите другой вид сортировки (мы проходили пузырьком) и
         * напишите его вдумываясь во все нюансы, напишите почему такой или иной
         * тип сортировки лучше
         */
        System.out.println();
        System.out.println("Task #2.2");


        //подсчет кол-ва итераций при сортировке методом пузырька
        int[] sortArr = {12, 6, 4, 1, 15, 10, 44, 9, 12, -3, 0, 32, 87, 21, 99, -1};
        bubbleSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "  ");
        }
        System.out.println();
        System.out.println("Количество перестановок пузырьком = " + iterations_bubl);

        //подсчет кол-ва итераций при сортировке методом быстрой сортировки

        int[] sortArr2 = {12, 6, 4, 1, 15, 10, 44, 9, 12, -3, 0, 32, 87, 21, 99, -1};
        quickSort(sortArr, 0, sortArr.length - 1);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "  ");
        }
        System.out.println();
        System.out.println("Количество перестановок быстрой сортировки= " + iterations_quick);
    }
    // код алгоритма сортировки методом пузырька, сложность О(n2)
    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                    iterations_bubl++;
                }
            }
        }
    }
    // код алгоритма быстрой сортировки, сложность O(n log n), эффективен для больших массивов.

    public static void quickSort(int[] sortArr, int low, int high) {

        //завершить,если массив пуст или уже нечего делить
        if (sortArr.length == 0 || low >= high) return;

        //выбираем опорный элемент
        int middle = low + (high - low) / 2;
        int border = sortArr[middle];

        //разделияем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (sortArr[i] < border) i++;
            while (sortArr[j] > border) j--;
            if (i <= j) {
                int swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
                iterations_quick++;
            }
        }

        //рекурсия для сортировки левой и правой части
        if (low < j) quickSort(sortArr, low, j);
        if (high > i) quickSort(sortArr, i, high);
    }
}