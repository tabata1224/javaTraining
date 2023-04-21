package consallink.ecfTech._09_collection.q004;

public class Main {
    public static void main(String[] args) {
        MenuManager manager = new MenuManager();
        //サンドイッチメニューの表示
        manager.showMenu("sandwitch");
        //サンドイッチメニューにビッグバーガーを追加
        manager.setMenu("sandwitch", "ビッグバーガー");
        //サンドイッチメニューの表示
        manager.showMenu("sandwitch");
        //「ホットミルク」をメニューから検索
        manager.searchMenu("ホットミルク");
        //「オレンジジュース」をメニューから検索
        manager.searchMenu("オレンジジュース");
    }
}
