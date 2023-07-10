package Base;

public class HW1 {
    public static void main(String[] args) {
        System.out.println("Examples of data type");

        byte a = 127;
        short b = -32767;
        int c = 2147483647;
        long d = -9223;

        System.out.println("byte a = " + a);
        System.out.println("shor b = " + b);
        System.out.println("int c = " + c);
        System.out.println("long d = " + d);

        float e = 23.32f;
        double f = -435.796;

        System.out.println("float e = " + e);
        System.out.println("double f = " + f);

        char g = 'g';
        boolean h = true;

        System.out.println("char g = " + g);
        System.out.println("boolean not h = " + !h);

        String i = "world";
        System.out.println("String i = " + i);

        System.out.println();

        System.out.println("Arithmetic operations:");
        int res_int = c - 1234;
        System.out.println(res_int);
        System.out.println(c + c);

        byte aa = 12;
        int res_byte = aa + aa;
        System.out.println(res_byte);
        System.out.println(aa + aa);

        long dd = 12345;
        double ff = 12345.12345;

        double j = dd + ff;
        System.out.println(j);
        System.out.println(dd + ff);

        System.out.println("34 * 5 = " + 34 * 5);
        System.out.println("23 / 6 = " + 23 / 6);
        System.out.println("55 % 2 = " + 55 % 2);

        System.out.println();
        System.out.println("Increment operations:");
        double k = 123.4;
        double l = k++;
        System.out.println("l = k++ " + l);
        System.out.println("k = " + k);

        double kk = 123.4;
        double m = ++kk;
        System.out.println("m = " + m);
        System.out.println("kk = " + kk);

        System.out.println();
        System.out.println("Comparison operations:");
        int cc = 44;
        float bb = 44.0f;
        System.out.println( cc == bb);

        System.out.println("true && false =" + (true && false));

        System.out.println("8 >> 1 = " + (8 >> 1));

        System.out.println();
        System.out.println("Явный кастинг:");

        int df = 9;
        long gf = 120;

        byte sf = (byte) (df + gf);
        System.out.println(sf);
        System.out.println(df + gf);
        System.out.println();

        int df2 = 7;
        long gf2 = 120;
        byte sf2 = (byte) (df2 + gf2);
        System.out.println(sf2);
        System.out.println(df2 + gf2);

        System.out.println();
        System.out.println("Неявный кастинг:");

        byte vv = 22;
        short nn = 44;
        int mm = vv + nn;
        System.out.println(mm);

        System.out.println();
        System.out.println("Methods:");

        System.out.println("sum_int_long(int a=22, long b=345) = " + sum_int_long(22, 345));

    }
    public static byte sum_int_long(int a, long b) {
        return (byte) (a + b);
    }
}
