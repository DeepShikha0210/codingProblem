// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class BalancedParenthesis {

    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {

        solve(n, n, "");
        return res;
    }

    void solve(int open, int close, String output){ //2,2,"" //1,1,"()"

        if(open == 0 && close == 0){
            res.add(output);
            return;
        }
        String op1, op2;

        if(open == close){
            op1 = output + "(";  //"("
            open--; //2
            solve(open, close, op1); //(1,2,"(")  //(0,1"()(")
        }

        else if(open == 0 && close > 0){
            op1 = output + ")";
            close--;
            solve(open, close, op1);
        }

        else{
            op1 = output + "("; //"(("
            op2 = output + ")"; //"()"
            open--;
            solve(open, close, op1); // (0,2,"((")
            open++;
            close--;
            solve(open, close, op2); //(1,1, "()")
        }

    }
    public static void main(String[] args){
        BalancedParenthesis s = new BalancedParenthesis();
        List<String> result = s.generateParenthesis(3);
        for(String ans : result){
            System.out.print("[ " + ans + " ]");
        }
    }


}