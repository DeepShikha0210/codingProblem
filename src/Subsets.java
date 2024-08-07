import java.util.*;

class Subsets{

    void subsets(String inp, String out){ //"abc" , ""
        if(inp.length() == 0){
            System.out.print("[" + out + "] ");
            return;
        }

        String op1 = out; //"", "a"
        String op2 = out + inp.charAt(0); //"a", 
        String ip = inp.substring(1); //"bc"
        subsets(ip, op1); //"bc", ""
        subsets(ip, op2); //"bc", "a"

    }
    public static void main(String[] args){

        Subsets h= new Subsets();
        String input = "abc";
        String output = "";
        h.subsets(input, output);
    }
}