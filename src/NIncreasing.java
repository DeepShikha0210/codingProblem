// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class NIncreasing{
    static List<String> out = new ArrayList<>();
    static void solve(String s, int start, int N){
        if(N == 0){
            out.add(s);
            return;
        }
//Handle N=1 case with i = 0 to 9 separately in the main call function
        for(int i= 1; i<= 9; i++){

            if(s.length() == 0 || i > Integer.parseInt(String.valueOf(s.charAt(s.length()-1)))){//0>0//1>0

                s+=String.valueOf(i);
                solve(s, start+1, N-1);
                s = s.substring(0, s.length() - 1);
            }
        }

    }
    public static void main(String[] args){
        NIncreasing s = new NIncreasing();

        s.solve( "", 0, 2);

        for(String ans : out){
            System.out.print(ans + " ");
        }
    }


}