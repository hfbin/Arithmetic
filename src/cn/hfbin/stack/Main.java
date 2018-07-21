package cn.hfbin.stack;
/**
 * Created by: HuangFuBin
 * Date: 2018/7/21
 * Time: 23:03
 * Such description: Stack 测试
 */
public class Main {

    public static void main(String[] args) {

        ArrayStack<Integer> stack = new ArrayStack<>();

        for(int i = 0 ; i < 5 ; i ++){
            //入栈
            stack.push(i);
            System.out.println(stack);
        }

        //出栈
        stack.pop();
        System.out.println(stack);
    }
}
