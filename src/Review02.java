//課題FizzBuzz問題のプログラムを作成しよう
//繰り返し回数が分っている場合  for文

/*FizzBuzz問題】
1から100までの連続した整数を画面に表示する。ただし、下記の条件にしたがうこと：
・もし、その整数が3で割り切れる数なら "Fizz" と表示する
・もし、その整数が5で割り切れる数なら "Buzz" と表示する
・上記2つの条件は同時に満たせる。つまり、もし、その整数が3で割り切れ、なおかつ5で割り切れる数なら "FizzBuzz" と表示する
・それ以外の数は、その数をそのまま表示する*/

public class Review02 {

    public static void main(String[] args) {
        for(int i=1; i<=100; i++) {//i++=i=1に1加算
            if(i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");//3,5割り切り
            }else if(i%3==0) {
                System.out.println("Fizz");//3割り切れます
            }else if(i%5==0) {
                    System.out.println("Buzz");//5割り切れます
            }else {
                System.out.println(i);//条件以外のi(1)表示
                }
            }
        }
    }