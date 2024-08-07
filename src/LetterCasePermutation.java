// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class LetterCasePermutation {

    List<String> res = new ArrayList<>();
    public List<String> letterCasePermutation(String s) {

        solve(s, "");
        return res;
    }

    void solve(String input, String output){

        if(input.length() == 0){
            res.add(output);
            return;
        }
        String op1, op2, inp;
        Character ch = input.charAt(0);
        String c = String.valueOf(ch);
        if(Character.isLetter(ch)){
            op1 = output + c.toLowerCase();
            op2 = output + c.toUpperCase();
            inp = input.substring(1);
            solve(inp, op1);
            solve(inp, op2);
        }
        else{

            op1 = output + c;
            inp = input.substring(1);
            solve(inp, op1);
        }
    }
    public static void main(String[] args){
        LetterCasePermutation s = new LetterCasePermutation();
        List<String> result = s.letterCasePermutation("a1b2");
        for(String ans : result){
            System.out.print("[ " + ans + " ]");
        }
    }


}