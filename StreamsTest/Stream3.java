import java.util.stream.*;

public class Stream3 {
    public static void main(String[] args) {
        Stream.iterate(1, element -> element % 5 == 0, element + 1)
        .limit(5)
        .forEach(System.out::println);
    }
}
