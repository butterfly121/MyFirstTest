package baseJava;

/**
 * Created by xhm on 2017/6/6.
 */
public class javaClass {
    //构造方法
    public javaClass(){
        System.out.println("调用了无参的构造函数.");
    }
    public javaClass(String mess){
        System.out.println("调用了有参的构造函数:"+mess);
    }
    public static void main(String[] args){
        start();
        Count c=new Count();
        System.out.println(c.add(3,6));
        end();
        javaClass fl=new javaClass();
        javaClass f2=new javaClass("Hello");
        System.out.println(fl);
        System.out.println(f2);
    }
    public static void start(){

        System.out.println("This is start method.");
    }

    public static void end(){
        System.out.println("This is end method.");
    }


}
