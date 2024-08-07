import java.util.List;
import java.util.stream.Stream;

public class StreamTerminationMethods {
    public static void main(String[] args) {
        Stream<Integer> s2 = Stream.of(1,2,3,5, 9, 3,5,7,8,3,3,6);
        //System.out.println(s2.count());
        //System.out.println(s2.min(Integer::compareTo).get());
        System.out.println(s2.max(Integer::compareTo).get());

        Stream<String> s1 = Stream.of("Java", "shikha", "deep", "sunshine");
        System.out.println(s1.findAny().get());

        var list = List.of("mom", "233", "chimp");
        System.out.println(list.stream().anyMatch(s-> Character.isDigit(s.charAt(0))));
        System.out.println(list.stream().allMatch(s-> Character.isLetter(s.charAt(0))));
        System.out.println(list.stream().noneMatch(s-> Character.isDigit(s.charAt(0))));
        list.stream().forEach(System.out::println);



    }

}
