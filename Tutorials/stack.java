package Tutorials;

import java.util.Stack;

public class stack {

  public static void main(String[] args) {
    System.out.println("This is the stack: ");
    Stack<Integer> stack = new Stack<Integer>();
    stack.push(12);
    stack.push(13);
    stack.push(14);
    stack.push(15);
    stack.push(16);
    stack.push(17);
    System.out.println(stack);
    stack.pop();
    System.out.println(stack);
    System.out.println(stack.peek());
    if (stack.isEmpty()) {
      System.out.println("stack is empty");
    } else {
      System.out.println("stack is not empty");
    }
    System.out.println(stack.search(13));
  }
}