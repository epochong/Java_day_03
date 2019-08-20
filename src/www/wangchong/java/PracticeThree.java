package www.wangchong.java;
/*
3.写出下面程序运行结果:
class A{
    public A(){
        System.out.println(“A”);
    }
}

class B extends A{
    public B(){
        System.out.println(“B”);
    }

    public static void main(String[] args){
        B b=new B();
    }
}*/
class A{
    public A(){
        System.out.println("A");
    }
}

class B extends A{
    public B(){
        System.out.println("B");
    }


    }
public class PracticeThree {
    public static void main(String[] args) {
        B b = new B();
    }
}
/*
A
B
 */