// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class UniqueSubsets{

    Set<String> set = new HashSet<>();

    void subsets(String inp, String out){ //"abc" , ""
        if(inp.length() == 0){
            if(set.add(out)){
                System.out.print("[" + out + "] ");
            }
            return;
        }

        String op1 = out; //"", "a"
        String op2 = out + inp.charAt(0); //"a", 
        String ip = inp.substring(1); //"bc"
        subsets(ip, op1); //"bc", ""
        subsets(ip, op2); //"bc", "a"

    }
    public static void main(String[] args){

        UniqueSubsets h= new UniqueSubsets();
        String input = "aab";
        String output = "";
        h.subsets(input, output);
    }
}