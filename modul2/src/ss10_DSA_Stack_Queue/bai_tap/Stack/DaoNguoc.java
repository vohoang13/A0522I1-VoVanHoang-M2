package ss10_DSA_Stack_Queue.bai_tap.Stack;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguoc {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stackTwo = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        for(int i = 0 ;i < stack.size();i++){
            stackTwo.push(stack.pop());
        }
        stackTwo.push(stack.pop());
        stack.addAll(stackTwo);
        System.out.println(stack);
    }
}
