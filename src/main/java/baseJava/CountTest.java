package baseJava;

/**
 * Created by xhm on 2017/6/6.
 */
public class CountTest {
    public static void main(String[] args){
        NewCount cn=new NewCount();
        int result=cn.add(5,9);
        System.out.println(result);
        System.out.println(cn.sub(9,5));
    }
}
