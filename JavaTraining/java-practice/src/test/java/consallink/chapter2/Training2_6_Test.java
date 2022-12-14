package consallink.chapter2;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;

public class Training2_6_Test {
    Training2_6 training2_6 = new Training2_6();
    private StandardOutputSnatcher sos;

    public Training2_6_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void practice1() throws Exception {

        training2_6.practice1();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "パソコンを13台購入します。\n合計は1605500円です。\n税込み価格は1733940円です。\n";

        assertEquals(actual, expected);
    }

    @Test
    public void practice2() throws Exception {

        training2_6.practice2();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "変数hiraganaには「あ」が保存されています。\n「あ」の文字コードは12354\ncodeの文字コードをインクリメントすると「ぃ」となります。\n";

        assertEquals(actual, expected);
    }
}
