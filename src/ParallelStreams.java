import java.util.List;
import java.util.stream.Stream;

public class ParallelStreams {
    public static void main(String[] args) {
        Stream<Integer> s1 = List.of(1,2,3).stream();
        Stream<Integer> s2 = s1.parallel(); //Method-1
        Stream<Integer> s3 = List.of(1,2,3).parallelStream(); //Method-2
        System.out.println(s1.isParallel());
        //Stream.concat(Stream s1, Stream s2) is parallel if either of the stream is parallel

        //flatMap() creates a new stream which is not parallel by default



    }
}
