package www.wangchong.java;
/*  5.编程题：
          定义一个抽象的"Role"类，有姓名，年龄，性别等成员变量
          1）要求尽可能隐藏所有变量(能够私有就私有,能够保护就不要公有)，
          再通过GetXXX()和SetXXX()方法对各变量进行读写。具有一个抽象的play()方法，
          该方法不返回任何值，同时至少定义两个构造方法。Role类中要体现出this的几种用法。
          2）从Role类派生出一个"Employee"类，该类具有Role类的所有成员（构造方法除外），
          并扩展salary成员变量，同时增加一个静态成员变量“职工编号（ID）”。
          同样要有至少两个构造方法，要体现出this和super的几种用法，还要求覆盖play()方法，
          并提供一个final sing()方法。
          3）"Manager"类继承"Employee"类，有一个final成员变量"vehicle"
          在main()方法中制造Manager和Employee对象,并测试这些对象的方法。*/
abstract class Role {
    private String name;
    private int age;
    private String sex;

    public Role(String name) {
        this.name = name;
    }

    public Role( int age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    abstract void play();
}
class Employee extends Role {
    int salay;
    String ID;

    public Employee(int age, String sex, String ID) {
        super(age, sex);
        this.ID = ID;
    }

    public Employee(String name, int salay) {
        super(name);
        this.salay = salay;
    }

    void play() {
        System.out.println("Employee 的对象" + this);
    }
    final void sing() {
        System.out.println(this.getAge());
        System.out.println(this.getName());
        System.out.println(this.getSex());
    }
}
class Manager extends Employee {
    final int  vehicle = 0;
    public Manager(int age, String sex, String ID) {
        super(age, sex, ID);
    }

    public Manager(String name, int salay) {
        super(name, salay);
    }
}
public class PracticeFive {
    public static void main(String[] args) {
        Manager manager = new Manager(20,"man","17407110333");
        Employee employee = new Employee(18,"woman","17408110333");
        Employee employee1 = new Employee("lige",10000);
        Manager manager1 = new Manager("wangchong",50000);
        manager1.sing();
        employee1.play();
    }
}
