// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class PermutationWithRecursion {

    static List<List<String>> res = new ArrayList<>();

    static void solve(String inp, String out){ //abc, //""

        if(inp.length() == 0){
            List<String> output = new ArrayList<>();
            output.add(out);
            res.add(output);
            return;
        }
        Set<Character> set = new HashSet<>();
        String newInp, newOut;
        for(int i=0; i< inp.length(); i++){
            // to handle duplicate characters
            if(set.add(inp.charAt(i))){
                newInp = inp.substring(0,i) + inp.substring(i+1);
                newOut = out + inp.charAt(i);
                //Pass By Value
                solve(newInp,newOut);
            }

        }

    }
    public static void main(String[] args){
        PermutationWithRecursion s = new PermutationWithRecursion();
        s.solve("abcc", "");
        for(List<String> ans : res){
            System.out.print(ans + " ");
        }

    }


}