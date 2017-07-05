package baseJava;

/**
 * Created by xhm on 2017/6/6.
 */
public class TryDemo {
    public static void main(String[] args){
        try {
            Class.forName("com.test");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
