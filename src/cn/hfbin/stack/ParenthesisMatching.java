package cn.hfbin.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by: HuangFuBin
 * Date: 2018/7/22
 * Time: 12:54
 * Such description:  栈括号匹配应用   https://leetcode-cn.com/problems/valid-parentheses/description/
 */
public class ParenthesisMatching {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i < s.length() ; i ++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                //入栈
                stack.push(c);
            }else {
                if (stack.isEmpty())
                    return false;
                //移除栈顶
                char topChar = stack.pop();
                if(c ==')' && topChar != '(')
                    return false;
                if(c =='}' && topChar != '{')
                    return false;
                if(c ==']' && topChar != '[')
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        ParenthesisMatching solution = new ParenthesisMatching();
        System.out.println(solution.isValid(s));
    }
}
