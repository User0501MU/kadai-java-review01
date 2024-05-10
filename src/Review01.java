//引数に配列を用いることも可能　int[]で、引数に配列型を指定。
//今回はオーバーロードと一部戻り値

//税込価格を計算しよう
/*○○円の商品の税込価格は○○円（消費税は○○円）です。
 税込価格 = 商品価格 + 消費税額 となるように計算してください
と表示するプログラムを書きましょう。

ただし、下記の仕様を満たしてください。
mainメソッドとtaxメソッドを切り分けて作成してください
※taxメソッドは消費税額（商品価格の10％）が戻り値となるメソッドにしてください

任意：1800円の飲み放題3人分税込5400円　税抜4910円
4910円×0.10=491 消費税490*/

public class Review01 {

    public static void main(String[] args) {
        //追記：呼び出す
        tax(4910,490);

        //main処理
//再：税込み価格を手動で入力されていたのですが、今回のプログラムで分かるのは商品の価格と、税率のみとなります。この2つの値から、消費税を計算して、税込み価格を求めるようにしましょう
        int num1 = 4910;//商品の価格4910

        double result = tax(4910,0.10);//戻り値
//★キャスト型変換で小数点を整数に正す。※変数に対してキャストを付ける
        double num3 = (int)result + num1;//return戻り値+商品価格

        System.out.println (num1+"円の商品の税込価格は"+(int)num3+"円（消費税は"+(int)result+"円です)");//結果戻り値
    }
    //tax処理 return有
    public static double tax (int num1,double num2) {
        double result = 4910*0.10;
        return result;
    //※taxメソッドは消費税額（商品価格の10％）が戻り値となるメソッドにしてください
    //条件的に消費税価格の計算のみreturn
    }
}

//補足確認観点：問題文の指示戻り値は何処か、そもそも戻り値はあるのか？呼び出しメソッドaddは任意　int型かdobule型（ダブル）か。
