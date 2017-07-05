package baseJava;

/**
 * Created by xhm on 2017/6/6.
 */
public class TryDemo3 {
    public void printBugInfo(){
        try {
            int x=100;
            int y=0;
            int z=x/y;
            System.out.println(x+"乘以"+y+"的商是："+z);
        }catch (Exception e){
            //输出异常的标准错误流
            e.printStackTrace();
            //使用getMessage（）方法输出异常信息
            System.out.println("getMessage方法："+e.getMessage());
            //使用getLocalizedMessage()方法输出异常信息
            System.out.println("getLocalizedMessage方法"+e.getLocalizedMessage());
            //使用 toString（）方法输出异常信息
            System.out.println("toString方法："+e.toString());
        }
    }
    public static void main(String[] args){
        TryDemo3 ex = new TryDemo3();
        ex.printBugInfo();
    }
}
