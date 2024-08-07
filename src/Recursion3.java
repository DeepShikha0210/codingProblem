// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Recursion3 {
    //Reverse a stack
    Stack<Integer> reverseStack(Stack<Integer> stack){
        if(stack.size() <= 1){
            return stack;
        }

        int popped = stack.pop();
        reverseStack(stack);
        insertBack(stack, popped);
        return stack;
    }

    void insertBack(Stack<Integer> stack, int val){

        if(stack.isEmpty()){
            stack.push(val);
            return;
        }

        int popped = stack.pop();
        insertBack(stack, val);
        stack.push(popped);
    }

    public static void main(String[] args) {
        Recursion3 h = new Recursion3();
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(6);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(5);
        stack.push(8);
        // Creating an iterator
        Iterator value = stack.iterator();

        // Displaying the values 
        // after iterating through the stack 
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.print(value.next() + " ");
        }
        System.out.println();
        //System.out.println("stack.size(): "+ stack.size());

        //int size= stack.size();
        // int mid = size/2 + 1;
        Stack<Integer> res = h.reverseStack(stack);

        // Creating an iterator
        value = res.iterator();

        // Displaying the values 
        // after iterating through the stack 
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.print(value.next()+ " ");
        }
    }
}