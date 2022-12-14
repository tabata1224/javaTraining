package consallink;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * 標準出力・標準エラー出力の出力先を奪うクラスです.
 * テストなどでコンソール出力の内容を知りたい場合に使います.
 * このクラスはスレッドセーフではありません。
 * マルチスレッド環境では利用しないでください。
 */
public final class StandardOutputSnatcher {

    /** シングルトンパターンのためのインスタンス. */
    private static final StandardOutputSnatcher INSTANCE = new StandardOutputSnatcher();

    /** 元の標準出力. */
    private PrintStream nativeOut = null;

    /** 元の標準エラー出力. */
    private PrintStream nativeErr = null;

    /** 変更後の標準出力. */
    private ByteArrayOutputStream snatchedOut = new ByteArrayOutputStream();

    /** 変更後の標準エラー出力. */
    private ByteArrayOutputStream snatchedErr = new ByteArrayOutputStream();

    /** 奪取済みフラグ. */
    private boolean stealFlag = false;

    /** デフォルトコンストラクタの禁止. */
    private StandardOutputSnatcher() {
    }

    /**
     * このクラスのインスタンスを取得します.
     * このクラスはスレッドセーフ化しにくい形で標準出力に干渉するので、
     * シングルトンパターンを採用しました.
     * 
     * @return インスタンス
     */
    public static StandardOutputSnatcher getInstance() {
        return INSTANCE;
    }

    /**
     * 出力先を奪い、
     * コンソールからこのクラスへ出力するように設定します.
     */
    public void snatch() {
        // ダブルスティールの禁止
        if (!stealFlag) {
            nativeOut = System.out;
            nativeErr = System.err;
            System.setOut(new PrintStream(new BufferedOutputStream(snatchedOut)));
            System.setErr(new PrintStream(new BufferedOutputStream(snatchedErr)));
            stealFlag = true;
        }
    }

    /** 標準出力をクリアします. */
    public void clearOutput() {
        snatchedOut.reset();
    }

    /** 標準エラー出力をクリアします. */
    public void clearErrorOutput() {
        snatchedErr.reset();
    }

    /**
     * 標準出力の出力内容を取得します.
     * 
     * @return 標準出力の出力内容
     */
    public String getOutput() {
        System.out.flush();
        return snatchedOut.toString();
    }

    /**
     * 標準エラー出力の出力内容を取得します.
     * 
     * @return 標準エラー出力の出力内容
     */
    public String getErrorOutput() {
        System.err.flush();
        return snatchedErr.toString();
    }

    /**
     * 奪取した標準出力先を取得します.
     * 
     * @return 奪取した標準出力先
     */
    public PrintStream getNativeOutputStream() {
        return nativeOut;
    }

    /**
     * 奪取した標準エラー出力先を取得します.
     * 
     * @return 奪取した標準エラー出力先
     */
    public PrintStream getNativeErrorOutputStream() {
        return nativeErr;
    }

    /**
     * 出力先を元に戻します.
     * このメソッドの呼び忘れにご注意ください.
     */
    public void release() {
        // ダブルリリースの禁止
        if (stealFlag) {
            clearOutput();
            clearErrorOutput();
            System.setOut(nativeOut);
            System.setErr(nativeErr);
            stealFlag = false;
        }
    }

}