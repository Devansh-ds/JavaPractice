import java.util.*;

public class StreamReduce {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Emma Watson", "Paul Walker", "Leesa",   
        "James", "Lilly");
        String str = ls.stream().reduce("ohn",(fname, lname) -> fname + "-" + lname);
        System.out.println(str);
        System.out.println(str);
    }
}
