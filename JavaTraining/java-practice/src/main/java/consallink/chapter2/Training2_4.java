package consallink.chapter2;

public class Training2_4 {

    public static void main(String[] args) {
        // 実行したい練習問題のコメントアウトを外そう
        // practice1();
        practice2();
    }

    public static void practice1() {
        // char型の変数名「shape」を、文字「円」というデータで初期化してください
        char shape = '円';
        
        // int型の変数名「diameter」を、整数値「30」というデータで初期化してください
        int diameter = 30;

        // float型の定数名「PI」を、小数で3.14159265359というデータで初期化してください
        float PI = 3.14159265359f; 

        System.out.print("形状：");
        // 「shape」のデータを出力してください
        System.out.println(shape);

        System.out.print("直径：");
        // 「diameter」のデータを出力してください
        System.out.println(diameter);

        System.out.print("円周率：");
        // 「PI」のデータを出力してください
        System.out.println(PI);
    }

    public static void practice2() {
        // int型の変数名「binary」を、2進数の「11110」というデータで初期化してください
        int binary = 0b11110;
        // int型の変数名「octal」を、8進数の「17」というデータで初期化してください
        int octal = 017;
        // int型の変数名「hexadecimal」を、16進数の「AF」というデータで初期化してください
        int hexadecimal = 0xAF;
        System.out.println("変数binaryのデータ");
        // binaryのデータを出力してください
        System.out.println(binary);

        System.out.println("変数octalのデータ");
        // octalのデータを出力してください
        System.out.println(octal);

        System.out.println("変数hexadecimalのデータ");
        // hexadecimalのデータを出力してください
        System.out.println(hexadecimal);
    }
}
