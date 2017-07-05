package baseJava; /**
 * Created by xhm on 2017/6/6.
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class TestJava {
    private static Scanner input;
    public static void main(String[] ards){
//       test();
//       test01();
//       test02();
//        test03();
        test04();
    }
    public static void  test(){
        input = new Scanner(System.in);
        System.out.println("你刚才输入了："+input.nextLine());
        String name="小明";
        char sex='男';
        System.out.println("name:"+name+";sex:"+sex);
    }
    public static void test01(){
        int a=1,b=2;
        if (a>b){
            System.out.printf("%d big",a);
        }else {
            System.out.printf("%d big",b);
        }
        int result=61;

        if(result>=90){
            System.out.println("优秀");
        }
        else if(result>=70) {
            System.out.println("良好");
        }
        else if(result>=60) {System.out.println("及格");
        }


    }
    public static void test02(){
        String s=" ";
        for (int i=1;i<=10;i=i+2){
            System.out.print(s+i);
        }
        System.out.print("\n");
        for (int i=1;i<=5;i++){
            for (int j=5-i;j>0;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void test03(){
        String[] str=new String[5];
        str[0]="小明";
        str[1]="老师";
        str[2]="老王";
        str[3]="张三";
        str[4]="李四";
        for (int i=0;i<5;i++){
            System.out.println(str[i]);
        }
        String[] fruits={"bananas", "apples", "pears", "oranges"};
        for (int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }
    }
    private static void test04(){
        HashMap<String,String> hm=new HashMap<String, String>();
        //添加字典
        hm.put("username","password");
        hm.put("Jim","1155689");
        hm.put("Jane","1255669");
        hm.put("Kevin","1165669");
        //测试key是否包含username，返回值是布尔类型
        System.out.println(hm.containsKey("username"));
        System.out.println("==================>");
        //获取keys所对应的vlaue
        System.out.println(hm.get("Jim"));
        System.out.println("==================>");
        //获取整个字典的数据
        System.out.println(hm.entrySet());
        System.out.println("==================>");
        //循环打印每一对key:value
        Iterator<?> it=hm.entrySet().iterator();
        while (it.hasNext())
            System.out.println(it.next());
        System.out.println("==================>");
        //分别取key的值和value的值
        Iterator<String> it2=hm.keySet().iterator();
        while (it2.hasNext()){
            //获得字典的key
            String username=(String)it2.next();
            System.out.println(username);
            //获取字典的value
            String password=hm.get(username);
            System.out.println(password);
        }



    }
}
