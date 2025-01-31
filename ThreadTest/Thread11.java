public class Thread11 {
    public static void main(String[] args) throws Exception{
        System.out.println("Yo");
        Runtime r = Runtime.getRuntime();
        int a = r.availableProcessors();
        System.out.println(a);
        System.out.println("hi");

        System.out.println(r.freeMemory());
        System.out.println(r.totalMemory());
        System.out.println("Used memory : " + (r.totalMemory() - r.freeMemory()));
        r.exec("notepad");
    }
}
