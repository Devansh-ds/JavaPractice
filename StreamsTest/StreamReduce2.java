import java.util.*;

public class StreamReduce2 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(8, -2, 3, 54, -24, -32, 6, 10);

        float sum = num.stream().reduce(0, (first, second) -> first + second);
        System.out.println("sum is " + sum);
    }
}
