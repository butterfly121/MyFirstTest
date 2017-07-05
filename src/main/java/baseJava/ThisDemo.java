package baseJava;

/**
 * Created by xhm on 2017/6/6.
 */
public class ThisDemo {
    String name;
    public ThisDemo(String input){
        name=input;
    }
    //this调用本类中的其他构造方法
    public ThisDemo(){
        this("Hello!");
    }
    public static void main(String args[]){
        ThisDemo p1=new ThisDemo("digger");
        ThisDemo p2=new ThisDemo();
        System.out.println(p1.name);
        System.out.println(p2.name);
    }
}
