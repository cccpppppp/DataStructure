package linear.test;

import linear.Stack;
import org.junit.Test;

import java.util.Scanner;

public class ParenthesisMatchingTest {
    //括号匹配
    public static void main(String[] args) {
        System.out.print("请输入待检验字符串：");

        Stack<Character> characters = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        char[] chars = s.toCharArray();

        for (char c : chars) {
            if(c == '(' || c == '（'){
                characters.push(c);
            }
            if(c == ')' || c == '）'){
                if(characters.pop() == null){
                    System.out.println("字符串括号不匹配");
                    return;
                }
            }
        }
        //左括号清0没有
        if(characters.isEmpty()){
            System.out.println("字符串括号匹配");
            return;
        }
        System.out.println("字符串括号不匹配");
    }

    @Test
    public void newStack(){
        Stack<Integer> integers = new Stack<>();

        System.out.println(integers.push(1));
        integers.push(2);
        integers.push(3);
        integers.push(4);
        System.out.println(integers.push(5));

        System.out.println("-------------------");
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        integers.pop();
        integers.pop();

        System.out.println("-------------------");
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        
    }
}
