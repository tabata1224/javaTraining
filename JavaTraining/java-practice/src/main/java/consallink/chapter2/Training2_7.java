package consallink.chapter2;

public class Training2_7 {

    public static void main(String[] args) {
        System.out.println("practice1");
        practice1();
        System.out.println("practice2");
        practice2();
        System.out.println("practice3");
        practice3();
    }

    public static void practice1() {

        // 以下の演算がどのような結果になるか予想してみましょう。
        // 実行時エラーになる場合もあるので、エラーになってしまう行はコメントアウトしてください。
        System.out.println(7 / 0);
        System.out.println(0 / 7);
        System.out.println(0 / 0);
        System.out.println(50 - 8 * 4);
        System.out.println(8 * 2 - 2);
        System.out.println(5 / 3 * 4 + 2);
        System.out.println(8 * 3 + 4 - 2);
        System.out.println(10 * 5 + 3 * 3);
        System.out.println((7 + 3) / (7 - 3));
        System.out.println(11 / 2 + 5 / 1);
        System.out.println(3 * 2 + 6 / 3);
        System.out.println((7 * 3) / 3 - 3);
        System.out.println(12 / (5 - 2));
        System.out.println((8 * 5 - (8 - 4)) / 3);
        System.out.println((10 - 2 / 2) * (3 + 4 * 2));
        System.out.println((3 - 1 / (5 + 1)) + 4);
        System.out.println(5 % 1);
        System.out.println(7 % 2);
        System.out.println(21 % 7);
        System.out.println(21 % 11);
        System.out.println(21 % 0);
        System.out.println(5 % 5 + 8 * 4);
        System.out.println(7 % 4 / 3 - 1);
        System.out.println(8 + 8 * 2 % 3);
        System.out.println((5 % 3) - (20 % 5));
    }

    public static void practice2() {

        // 以下の演算がどのような結果になるか予想してみましょう。
        System.out.println((int) 7.2);
        System.out.println((int) 8);
        System.out.println((byte) 127);
        System.out.println((byte) 128);
        System.out.println((double) 5.2F);
        System.out.println((float) 5.2D);
        System.out.println((double) 5.2);
        System.out.println((double) 6);
        System.out.println((double) 6 % 3);
        System.out.println((double) (1 % 5));
        System.out.println((double) 7 / (double) 4);
        System.out.println((double) (9 / 2));
        System.out.println(11 / 4 - (double) 5);
        System.out.println(11 / 4 - (int) 4.8);
        System.out.println((double) 7 / (int) 1 + (double) (7 / 3));
        System.out.println(10 / (3 * 1 + 2) - (double) 5);
        System.out.println((short) 8 + (short) 120);
        System.out.println((double) (int) 7.2);
        System.out.println((int) ((short) 9.1));
        System.out.println((int) ((double) (5 / 2 + 3)));
    }

    public static void practice3() {

        // 以下の演算がどのような結果になるか予想してみましょう。
        int a2 = 5;
        System.out.println(a2++ + ++a2);

        int a3 = 6;
        System.out.println(++a3 + ++a3 + ++a3);

        int a4 = 7;
        System.out.println(--a4 + --a4 + a4--);

        int a5 = 8;
        System.out.println(8 + a5++ + +8 - --a5);

        int a6 = 9;
        int b6 = 9;
        System.out.println(++a6 + b6++ + b6++);

        int a7 = 4;
        System.out.println(a7++ + --a7 + a7++ + ++a7 + a7--);

        int a8 = 5;
        System.out.println(--a8 - --a8 + --a8 + --a8 - ++a8 + ++a8);

        int a9 = 7;
        System.out.println(a9 - --a9 - --a9 / ++a9);

        int a10 = 9;
        System.out.println(++a10 * a10 / a10-- + a10-- + a10++);

        int a12 = 7, b12 = 5;
        System.out.println(a12 += (a12 + b12));

        int a13 = 6, b13 = 4;
        System.out.println(a13 += a13 + b13);

        int a15 = 9, b15 = ++a15 + 10;
        System.out.println(a15 + b15);

        int a16 = 3, b16 = a16++ + ++a16;
        System.out.println(a16 + b16);

        int a17 = 6, b17 = a17++ + ++a17;
        System.out.println(a17 += b17);

        int a18 = 4, b18 = (a18 = 7) * a18;
        System.out.println(a18 + b18);

        int a19 = 5;
        System.out.println(a19 + (a19 = 5));

        int a20 = 4;
        System.out.println(a20 += (a20 = 5));

        int a21 = 5;
        System.out.println(a21 += (a21 = a21++ + a21++));
    }
}
