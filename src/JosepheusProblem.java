// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class JosepheusProblem {

    static int ans = -1;
    void solve(int n, int index, List<Integer> persons, int k){

        if(persons.size() == 1){
            ans = persons.get(0);
            return;
        }

        index=(index+k)%persons.size();
        persons.remove(index);
        solve(n, index, persons, k);

    }
    public static void main(String[] args){
        JosepheusProblem s = new JosepheusProblem();
        int n = 40, k= 7;
        List<Integer> persons = new ArrayList<>();
        for(int i=1; i<=n; i++ ){
            persons.add(i);
        }
        k=k-1;
        s.solve(n, 0, persons, k);
        System.out.println(ans);

    }


}