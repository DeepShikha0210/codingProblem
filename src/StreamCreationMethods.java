import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class StreamCreationMethods {
    public static void main(String[] args) {

        Stream<String> s1 = Stream.of("Java");
        Stream<Integer> s2 = Stream.of(1,2,3,5);

        Stream<Integer> empty = Stream.empty();

        List<String> stringList = new ArrayList<>();
        stringList.add("qwerty");
        stringList.add("zxcvbn");

        Stream<String> stringStream = stringList.stream();

        Stream<Double> infiniteRandoms = Stream.generate(Math::random);

        //Infinite stream using iterate
        Stream<Integer> infiniteOddNumbers = Stream.iterate(1, n-> n+2);

        // Finite stream using iterate
        Stream<Integer> finiteOddNumbers = Stream.iterate(1, n -> n< 100, n -> n+2);


    }
}

class HelloWorld {
    Map<Character, Integer> frequency(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for(char c: ch){
            if(map.containsKey(c)){
                int f = map.get(c);
                f+=1;
                map.put(c,f);
            }
            else
                map.put(c,1);
        }

        return map;
    }
    public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
        Map<Character, Integer> res = h.frequency("Hello");

        for(Map.Entry<Character, Integer> entry: res.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

       /* Map<Character, Integer> mp = res.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey())
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,LinkedHashMap::new ));
        */

        res.keySet()
                .stream()
                .sorted()
                .forEach(key-> System.out.println(key + " -> " + res.get(key)));


         /*for(Map.Entry<Character, Integer> entry: mp.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }*/

    }
}