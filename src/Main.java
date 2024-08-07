import java.time.LocalDate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<String> s1= ()-> "JAVA";
        Supplier<String> s2 = String::new;

        Supplier<LocalDate> s3 = ()->LocalDate.now();
        Supplier<LocalDate> s4 = LocalDate::now;

        System.out.println(s1);
        System.out.println(s1.get());
        System.out.println(s1.toString());
        System.out.println(s2.get());
        System.out.println(s2.getClass());
        System.out.println(s3.get());
        System.out.println(s4.get());

    }
}