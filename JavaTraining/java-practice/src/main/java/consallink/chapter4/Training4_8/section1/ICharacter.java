package consallink.chapter4.Training4_8.section1;

/*
 * 指示に従ってインターフェースを完成させてください。
 * 
 * メソッド
 * 
 * 【修飾子】public abstract
 * 【メソッド名】setName
 * 【戻り値】void
 * 【引数】String name
 * 【処理内容】抽象メソッドのためなし
 * 
 * 【修飾子】public abstract
 * 【メソッド名】getName
 * 【戻り値】String
 * 【引数】なし
 * 【処理内容】抽象メソッドのためなし
 * 
 * 【修飾子】public abstract
 * 【メソッド名】getType
 * 【戻り値】String
 * 【引数】なし
 * 【処理内容】抽象メソッドのためなし
 * 
 * 【修飾子】public abstract
 * 【メソッド名】speedCorrection
 * 【戻り値】void
 * 【引数】int value
 * 【処理内容】抽象メソッドのためなし
 * 
 * 【修飾子】public abstract
 * 【メソッド名】printStatus
 * 【戻り値】void
 * 【引数】なし
 * 【処理内容】抽象メソッドのためなし
 */

public interface ICharacter {

    void speedCorrection(int value);

    void printStatus();
}
