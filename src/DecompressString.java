import java.util.HashMap;

public class DecompressString {
    static String decompress(String s){

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =1; i< s.length(); i+=2){
            char a = s.charAt(i-1);
            char b = s.charAt(i);
            int c = Character.getNumericValue(b);
            //Character.getNumericValue(b)
            //Integer.parseInt(String.valueOf(b));
            map.put(a, c);

        }
        //w-->4
        //a-->3

        StringBuffer ans = new StringBuffer("");
        // for(Map.Entry<Character, Integer> mp : map.entrySet()){
        for(int i = 0; i< s.length(); i+=2){
            char d = s.charAt(i);
            int f = map.get(d);
            while(f!=0){
                ans.append(d);
                f--;
            }
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(DecompressString.decompress("w4a3d1e1x6"));
    }
}
