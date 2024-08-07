// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class TowerOfHanoi{
    //Reverse a stack
    void solve(int n, String s, String d, String h){

        if(n == 1){
            System.out.println("Moving plate " + n + " from "+ s + " to " + d );
            return;
        }

        solve(n-1, s, h, d);
        System.out.println("Moving plate " + n + " from "+ s + " to " + d );
        solve(n-1, h, d, s);

    }

    public static void main(String[] args) {
        TowerOfHanoi h = new TowerOfHanoi();
        h.solve(4, "source", "destination", "helper");

    }
}