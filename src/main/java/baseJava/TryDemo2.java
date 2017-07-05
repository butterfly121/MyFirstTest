package baseJava;

/**
 * Created by xhm on 2017/6/6.
 */
public class TryDemo2 {
    int[] number={100,80,50};
    public int getNum(int index){
        return number[index];
    }
    public static void main(String[] args){
        TryDemo2 ex=new TryDemo2();
        int value=ex.getNum(0);
        System.out.println(value);
        value=ex.getNum(3);
        System.out.println(value);
    }
}
