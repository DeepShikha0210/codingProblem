import java.util.Arrays;
import java.util.List;

public class UnorderedStreams {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        long start = System.currentTimeMillis();
        long count = words.parallelStream()
                .filter(s -> s.length() > 5)
                .unordered()  // Indicates that the processing order doesn't matter
                .count();

        System.out.println();
        var timeTaken = (System.currentTimeMillis()-start);
        System.out.println("Time : " + timeTaken + " milliseconds");
        System.out.println("Count: " + count);


    }

}
