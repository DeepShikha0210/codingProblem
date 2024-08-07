import java.util.*;

class Recursion2 {
    //Delete middle element from the stack
    Stack<Integer> deleteMiddle(Stack<Integer> stack, int k){
        if(k == 1){
            stack.pop();
            return stack;
        }

        int popped = stack.pop();
        deleteMiddle(stack, k-1);
        stack.push(popped);
        return stack;
    }

    public static void main(String[] args) {
        Recursion2 h = new Recursion2();
        // System.out.println(h.reverseString("circus"));
        //Reverse a string ( word or a sentence) iterative/recursive way
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
        System.out.println("stack.size(): "+ stack.size());

        int size= stack.size();
        int mid = size/2 + 1;
        Stack<Integer> res = h.deleteMiddle(stack, mid);

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