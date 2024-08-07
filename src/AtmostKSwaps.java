// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class AtmostKSwaps{

    //static List<List<String>> res = new ArrayList<>();
    static int maxNumber= Integer.MIN_VALUE;
    static int ans = 0;
    static void solve(String s, int start, int k){ //"aba"

        if(start == s.length()-1 || k == 0){
            return;
        }

        //Set<Character> set = new HashSet<>();
        boolean flag = false;
        for(int i=start; i< s.length(); i++){

            // char[] ch = s.toCharArray();
            System.out.println("start - >  " + start);
            System.out.println("index - >  " + i);
            int maxD = maxDigit(s, start);//7
            System.out.println("maxD " + maxD);
            int iNum = Character.getNumericValue(s.charAt(i));
            System.out.println("iNum " + iNum);
            int sNum = Character.getNumericValue(s.charAt(start));
            System.out.println("sNum " + sNum);
            if(iNum > sNum && iNum == maxD){
                //Pass By Reference
                s =swap(s, start, i);
                System.out.println("s -> " + s );
                maxNumber = Math.max(maxNumber, Integer.parseInt(s));
                solve(s, start+1, k-1);
                s =swap(s, start, i);
                flag = true;
            }
            System.out.println("index - >  " + i);
            if(i == s.length()-1 && flag == false){
                System.out.println("entered at index - >  " + i);
                System.out.println("entered at start - >  " + start);
                System.out.println("entered at index - >  " + i);
            }
        }
    }
    static int maxDigit(String s, int i){
        char[] c = s.toCharArray();
        //, Integer.parseInt() expects a string argument,
        int max =Integer.parseInt(String.valueOf(c[i]));
        for(int a =i; a < s.length(); a++){
            max = Math.max(Integer.parseInt(String.valueOf(c[a])), max);
        }
        return max;
    }
    static String swap(String s, int i, int j){

        char[] c = s.toCharArray();
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;

        return new String(c);  // Correctly convert char array back to string
    }


    public static void main(String[] args){
        AtmostKSwaps s = new AtmostKSwaps();
        //Set<String> set = new HashSet<>();
        int k =4;
        //String s ="1234567";
        s.solve("12344", 0, k);
        System.out.print(maxNumber);
        
        /*for(List<String> ans : res){
            System.out.print(ans + " ");
        }*/

    }


}