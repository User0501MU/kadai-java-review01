package baseball;

public class BaseBallTeam {
    //フィールド
    String name;
    int win;//勝ち
    int lose;//負け
    int draw;//引き分け

    //コンストラクタ
public BaseBallTeam(String name, int win, int lose, int draw) {
    System.out.println();
        this.name =name;
        this.win =win;
        this.lose =lose;
        this.draw =draw;
    }

// 勝率を計算するメソッド
public double getRate() {
    return (double) win / (win + lose);//計算結果を小数値（double）で戻り値
}

// レポートを表示するメソッド
public void report() {
    System.out.println(name + "の2022年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、勝率は " + getRate());


}
    }
//getRate;勝率 フィールドの勝ち数や負け数の値を利用して勝率を計算、戻り値として返すという処理をするメソッド



