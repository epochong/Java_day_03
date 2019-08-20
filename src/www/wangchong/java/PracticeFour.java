package www.wangchong.java;
/*
4.编程题：
        打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，
        因为153=1的三次方＋5的三次方＋3的三次方。

*/

public class PracticeFour {
    public static void main(String[] args) {
        int i = 0;
        for(i = 100; i < 1000; i++) {
            if(isShuiXian(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isShuiXian(int num) {
        if(num < 100 || num > 999 ) {
            return false;
        } else {
            int shiwei = num / 10 % 10;
            int baiwei = num / 100;
            int gewei = num % 10;
            if(num == shiwei * shiwei * shiwei+ baiwei * baiwei * baiwei + gewei * gewei * gewei) {
                return true;
            }else {
                return false;
            }
        }
    }
}
