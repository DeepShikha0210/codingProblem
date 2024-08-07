import java.util.List;

public class ParallelDecomposition {

    private static int doWork(int input){
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){}
            return input;
        }

    public static void main(String[] args) {

        //Serial Stream - returns ordered result in 25 seconds
        /*long start = System.currentTimeMillis();
        List.of(1, 2, 3, 4, 5)
                .stream()
                .map(w-> doWork(w))
                .forEach(s-> System.out.print(s + " "));

        System.out.println();
        var timeTaken = (System.currentTimeMillis()-start)/1000;
        System.out.println("Time : " + timeTaken + " seconds");*/

        /*//Parallel Processing - returns unordered result in 5 seconds
        long start = System.currentTimeMillis();
        List.of(1, 2, 3, 4, 5)
                .parallelStream()
                .map(w-> doWork(w))
                .forEach(s-> System.out.print(s + " "));

        System.out.println();
        var timeTaken = (System.currentTimeMillis()-start)/1000;
        System.out.println("Time : " + timeTaken + " seconds");*/

        //Parallel Processing with forEachOrdered() - returns ordered result in 5 seconds
        long start = System.currentTimeMillis();
        List.of(1, 2, 3, 4, 5)
                .parallelStream()
                .map(w-> doWork(w))
                .forEachOrdered(s-> System.out.print(s + " "));
        //forEachOrdered() forces our stream into a single-threaded processwhen

        System.out.println();
        var timeTaken = (System.currentTimeMillis()-start)/1000;
        System.out.println("Time : " + timeTaken + " seconds");


    }
}
