import java.util.*;
import java.util.stream.*;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,3,4,5);
        System.out.println(number);

        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(square);

        List<String> names = Arrays.asList("simon", "goes", "says", "did he?");
        System.out.println(names);
        List<String> result = names.stream().filter(x -> x.startsWith("s")).collect(Collectors.toList());
        System.out.println(result);

        List<String> order = names.stream().sorted().collect(Collectors.toList());
        System.out.println(order);

        Set<Integer> settest = number.stream().map(x -> x*x).collect(Collectors.toSet());
        System.out.println(settest);
    }
}
