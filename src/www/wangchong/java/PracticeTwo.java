package www.wangchong.java;
  /*    2.简述下列程序运行结果:
class A{
    int y=6;
    class Inner{
        static int y=3;
        void show(){
            System.out.println(y);
        }
    }
}
class Demo{
    public static void main(String [] args){
        A.Inner inner=new A().new Inner();
        inner.show();
    }
}*/

/*
class A{
    int y=6;
    class Inner{
        static int y=3;
        void show(){
            System.out.println(y);
        }
    }
}
class Demo{
    public static void main(String [] args){
        A.Inner inner=new A().new Inner();
        inner.show();
    }
public class PracticeTwo {
    }*/
// 内部类不能有静态变量
