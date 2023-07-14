package Base;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW4 {
    public static void main(String[] args) {
        /* 1.1 Создать строки "Hello" и "World" и объединить их всеми 3 способами конкатенации.*/

        System.out.println("#1.1");
        String h = "Hello";
        String w = "World";
        System.out.println(h + w);
        System.out.println(h.concat(w));
        System.out.println(String.format("Hello%s", w));

        /* 1.2 Найти среднее значение в строке "Concatenation" - результатом должно быть "te".
        Например для строки "String" - это будет "ri", "Code" - "od".*/

        System.out.println("#1.2");
        String [] array = {"Concatenation", "String", "Code"};

        for (String word: array) {
            System.out.println("Middle of " + word + " = " + middle(word));
        }

        /* 1.3 Составить список студентов используя метод format.
        Например - Студент [Имя] [Фамилия] [Факультет],
        вместо значений в скобках подставить %s и соответствующее значение */

        System.out.println("#1.3");
        String [] names = {"Ivan", "Petro", "Sidor"};
        String [] surnames = {"Ivanov", "Petrov", "Sidorov"};
        String [] faculties = {"Mathematics", "Physics", "Chemistry"};

        for (int i = 0; i < names.length; i++) {
            System.out.printf("Студент %s %s %s%n", names[i], surnames[i], faculties[i]);
        }

        /* 2.1 Создать метод который принимает на вход строку и
        проверяет является ли она палиндромом (т.е. она должна читаться одинаково
        как обычно так и задом наперед, например - око, мадам и др.) */

        System.out.println("#2.1");
        String [] polyWords = {"око", "мадам", "дерево"};

        for (String word: polyWords) {
            System.out.println(String.format("Слово %s полиндром = ", word) + poly(word));
        }

        /* 2.2 Создать метод который принимает на вход строку и
        проверяет является ли номер телефона корректным,
        например +380637777777 - является корректным, а номер 380637777777 - не корректный, используя regex */

        System.out.println("#2.2");

        String [] testNumbers =  {"380501234567", "+380501234567", "-380507777777", "+", "+38050123456"};
        for (String number: testNumbers) System.out.println(checkNumber(number));

    }

    // #1.2 implementation
    public static String middle(String a) {
        return a.substring(a.length() / 2 - 1, a.length() / 2 + 1);
    }

    // #2.1 implementation

    public static String poly(String word) {

        int end = word.length() - 1;
        int count = word.length() / 2;
        int iterations = 0;
        for (int i = 0; i < count; i++) {
            if (word.charAt(i) != word.charAt(end - i))
                break;
            else iterations++;
        }
        if (count == iterations)
            return "Правда";
        else return "Ложь";
    }
    // #2.2 implementation
    public static boolean checkNumber (String number) {
        // "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$"
        Pattern pattern = Pattern.compile("\\+[0-9]{12}");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
