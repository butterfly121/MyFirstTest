package baseJava;

/**
 * Created by xhm on 2017/6/6.
 */
public class B extends javaClass {
    public B(String mess){
        super(mess);
    }
    public static void main(String args[]){
        B f=new B("hello");
        System.out.println(f);
    }
}
