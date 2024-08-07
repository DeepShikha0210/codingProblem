// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class CircularFriends {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(friends(n, k));

    }

    public static int friends(int n, int k){

        List<Integer> persons = new ArrayList<>();
        for(int i =0; i< n; i++){
            persons.add(i+1);
        }

        for(int i : persons){
            System.out.print(i + " ");
        }
        System.out.println();



        solve(n, 0, persons, k);
        return persons.get(0);
    }

    static void solve(int n, int index, List<Integer> persons, int k){

        if(persons.size() == 1)
            return;

        index = (index+k-1)%persons.size();
        persons.remove(index);
        for(int i : persons){
            System.out.print(i + " ");
        }
        System.out.println();

        solve(n, index, persons, k);


    }
}