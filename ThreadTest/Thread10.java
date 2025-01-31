public class Thread10 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run() {
                System.out.println("task one.");
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            public void run() {
                System.out.println("task two.");
            }
        };
        t2.start();
    }
}
