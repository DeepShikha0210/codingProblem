// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Recursion1 {

    String reverseString(String s){

        if(s.length() <= 1)
            return s;

        char rev = s.charAt(0);

        String ans = reverseString(s.substring(1, s.length())) + rev;

        return ans;
        //abcd
        //a  //bcd--->dcb + a
        //b  //cd  ---> dc + b
        //c  //d  ----> d + c
    }

    Stack<Integer> sortStack(Stack<Integer> stack){

        if(stack.size() <= 1)
            return stack;

        //[4,3,2,1]
        //[4,3,2], [1] -->
        //[4,3] , [2] -->[1,3,4]
        //[4], [3] --> [1, 4]
        //[], 
        int temp = stack.pop();
        System.out.println("temp " + temp);
        System.out.println("stack size here " + stack.size());
        sortStack(stack);
        insert(stack, temp);
        //[4], 1, [1,4], 3
        //[1,4]
        return stack;
    }

    void insert(Stack<Integer> stack, int temp){  //[4], 1
        if(stack.size() == 0 || stack.peek()<= temp){
            stack.push(temp);
            return;
        }

        int val = stack.pop();//4
        System.out.println("val " + val);
        insert(stack, temp); //[1], 3--> [1,3]
        stack.push(val);//[1, 3, 4]


    }
    public static void main(String[] args) {
        Recursion1 h = new Recursion1();
        System.out.println(h.reverseString("circus"));
        //Reverse a string ( word or a sentence) iterative/recursive way
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(6);
        stack.push(3);
        stack.push(2);
        // Creating an iterator
        Iterator value = stack.iterator();

        // Displaying the values 
        // after iterating through the stack 
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
        System.out.println("stack.size(): "+ stack.size());
        Stack<Integer> res = h.sortStack(stack);

        // Creating an iterator
        value = res.iterator();

        // Displaying the values 
        // after iterating through the stack 
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}