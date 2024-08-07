import java.util.Optional;

public class OptionalFunctions {

    public static void main(String[] args) {

        //Optional<String> name= Optional.of(null);
       // Optional<String> name2= Optional.ofNullable(null);
        //System.out.println(name.get());
        // System.out.println(name2.get());
        Optional<String> name3= Optional.ofNullable("Java");
        System.out.println(name3);

        Optional<String> empty= Optional.empty();
        System.out.println(empty);
        //System.out.println(empty.get());

        name3.ifPresent(System.out::println);
        System.out.println(name3.orElse("default"));
        System.out.println(empty.orElse("default"));







    }
}
