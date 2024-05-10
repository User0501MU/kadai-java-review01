//課題プロ野球チームの勝ち負け数を管理しよう
/*2022年のプロ野球セントラル・リーグの勝敗表
 勝ち負け数を管理するためのクラスを作成して、
 インスタンスを6チーム分生成した後各チームの勝ち負け数を表示するプログラムを作成してください。

 ・baseball というパッケージを作成します。そのなかに、以下の2つのクラスを作成します
 ・BaseBallTeam という名前のクラスを作ってください
 name（String型）
win（int型）
lose（int型）
draw（int型）

それぞれのフィールドに値が設定できるようにします
勝率はフィールドとして持たせず、メソッドにします。「勝ち数/(勝ち数+負け数)」の計算で求められるからです。
この計算結果を小数値（double）で戻す getRate メソッドを BaseBallTeam に作ってください
もうひとつ、 report というメソッドを BaseBallTeam に作ります。
○○ の2022年の成績は △△勝 □□敗 ☆☆分、勝率は 0.▽▽▽▽▽▽です。と表示するメソッドです

チーム名／勝数／負け数／引き分け数は、以下のどちらかの方法で参照してください：
自クラス内のフィールドを直接参照する方法
getterメソッドを用いて値を参照する方法

※いずれにしても勝率はgetRateメソッドを用いて値を取得してください

 ・Review03 という名前のクラス（メインメソッドあり）を作成してください
Review03 という名前のクラス（メインメソッドあり）を作成してください
メインメソッドの中で BaseBallTeam のインスタンスを6個生成し、
それぞれのチームの名前、勝ち数、負け数、引き分け数を格納してください
report メソッドを呼び出して、勝敗情報を表示してください*/

package baseball;

public class Review03 {
//メソッド
    public static void main(String[] args) {
        //それぞれのチームの名前、勝ち数、負け数、引き分け数
        //変数任意　
        BaseBallTeam  A1= new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);//東京ヤクルトスワローズ
        BaseBallTeam  A2= new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);//横浜DeNAベイスターズ
        BaseBallTeam  A3= new BaseBallTeam("阪神タイガース",68,71,4);//阪神タイガース
        BaseBallTeam  A4= new BaseBallTeam("読売ジャイアンツ",68,72,3);//読売ジャイアンツ
        BaseBallTeam  A5= new BaseBallTeam("広島東洋カープ",66,74,3);//広島東洋カープ
        BaseBallTeam  A6= new BaseBallTeam("中日ドラゴンズ",66,75,2);//中日ドラゴンズ

    //試合勝率の計算　勝ち数/(勝ち数+負け数)
    //report メソッドを呼び出して、勝敗情報を表示してください
        A1.report();
        A2.report();
        A3.report();
        A4.report();
        A5.report();
        A6.report();

    }
}


