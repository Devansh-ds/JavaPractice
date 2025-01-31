public class idk {
    public static void main(String[] args) {
        int[] heights = {3,5,7,4,3,90,4,2,1};
        int[] count = new int[101];

        for (int height : heights)
        ++count[height];

        for (int i = 0; i < heights.length; i++) {
            System.out.print(count[i] + " ");
        }
    }
}
