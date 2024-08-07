// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class PermutationWithBacktracking {
//UniquePermutations
    static List<List<String>> res = new ArrayList<>();

    static void solve(String s, int start){ //"aba"

        if(start == s.length()-1){
            List<String> output = new ArrayList<>();
            output.add(s);
            res.add(output);
            return;
        }

        Set<Character> set = new HashSet<>();
        for(int i=start; i< s.length(); i++){ //O(n)
            // to handle duplicate characters
            if(set.add(s.charAt(i))){
                //Pass By Reference
                s =swap(s, start, i);
                solve(s, start+1);
                s =swap(s, start, i);
            }

        }
    }
    static String swap(String s, int i, int j){

        char[] c = s.toCharArray();
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;

        return new String(c);  // Correctly convert char array back to string
    }


    public static void main(String[] args){
        PermutationWithBacktracking s = new PermutationWithBacktracking();
        //Set<String> set = new HashSet<>();
        s.solve("abca", 0);
        for(List<String> ans : res){
            System.out.print(ans + " ");
        }

    }


}