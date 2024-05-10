package baseball;

public class BaseBallTeam {
    // フィールド
    // private：同じクラス内からのみアクセス可能
    private String name;// 名前
    private int win;// 勝ち
    private int lose;// 負け
    private int draw;// 引き分け

    // コンストラクタ（引数あり）
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

//1カプセル化　private にしてデータを守り、そのかわりにフィールドにアクセスするためのメソッドであるgetterやsetterを定義する
    public String getName() {
        return name;
    }

    public void setNAme(String name) {
        this.name = name;// 代入式左辺に「this.」
    }

//2カプセル化　private にしてデータを守り、そのかわりにフィールドにアクセスするためのメソッドであるgetterやsetterを定義する
    public String getWin() {
        return name;
    }

    public void setWin(int win) {
        this.win = win;
    }

//3カプセル化　private にしてデータを守り、そのかわりにフィールドにアクセスするためのメソッドであるgetterやsetterを定義する
    public String getLose() {
        return name;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

//4カプセル化　private にしてデータを守り、そのかわりにフィールドにアクセスするためのメソッドであるgetterやsetterを定義する
    public String getBraw() {
        return name;
    }

    public void setBraw(int draw) {
        this.draw = draw;
    }





// 勝率を計算するメソッド
    public double getRate() {// getter
        return (double) win / (win + lose);// 計算結果を小数値（double）で戻り値
    }

// レポートを表示するメソッド
    public void report() {
        System.out.println(name + "の2022年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、勝率は " + getRate());
        // getRate;勝率 フィールドの勝ち数や負け数の値を利用して勝率を計算、戻り値として返すという処理をするメソッド

    }
}
