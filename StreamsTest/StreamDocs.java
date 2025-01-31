import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamDocs {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(4, 5, 6, 6, 3);
        // allmatch() checks that every element follows given condition or not
        // return true for empty list.
        boolean check = ls.stream().allMatch(element -> element > 0);
        System.out.println(check);
        // anyMatch() if any one element matches codition then return true
        boolean check2 = ls.stream().anyMatch(element -> element % 2 == 0);
        System.out.println(check2);

        // concat() It concatented stream first stream elements then second stream elements
        Stream<String> stream1 = Stream.of("JOhn");
        Stream<String> stream2 = Stream.of("cena", "yay", "!");
        Stream.concat(stream1, stream2).forEach(e -> System.out.println(e));

        // It counts no. of elements.
        long count = ls.stream().count();
        System.out.println(count);
        
        // distict() returns a new stream with unique elements.
        Stream<?> st = ls.stream().distinct();
        long distinct = st.count();
        System.out.println(distinct);
        
        // empty() creates an empty stream
        Stream.empty().forEach(e -> System.out.println(e));
        
        // flatMap() combines different stream into one single stream
        List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");  
        List<String>  productlist2 = Arrays.asList("Scanner", "Projector", "Light Pen");      
        List<String> productlist3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");  
        List<String> productlist4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");
        List<List<String>> all = new ArrayList<List<String>>();
        all.add(productlist1);  
        all.add(productlist2);  
        all.add(productlist3);  
        all.add(productlist4);  
        List<String> result = all.stream().flatMap(pl -> pl.stream()).collect(Collectors.toList());
        System.out.println(result);
    }
}
