// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class SpacePermutations{

    void subsets(String input, String out){ //"abc" , ""
        if(input.length() == 0){
            System.out.print("[ " + out + " ] ");
            return;
        }

        String op1 = out + "_" + input.charAt(0);
        String op2 = out + input.charAt(0);
        String inp = input.substring(1);
        subsets(inp, op1);
        subsets(inp, op2);

    }
    public static void main(String[] args){

        SpacePermutations h= new  SpacePermutations();
        String input = "abc";
        String output = "";
        output+= input.charAt(0); //Because we don't want space in front of first character
        input=input.substring(1);
        h.subsets(input, output);
    }
}