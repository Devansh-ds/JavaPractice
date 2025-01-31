class ThreadInterrupt extends Thread{

    public void run() {
        try {
            System.out.println("hi");
            Thread.sleep(10000);
            System.out.println("task");
        } catch (InterruptedException e) {
            throw new RuntimeException("thread interr : " + e + " Yo");
        }
        System.out.println("still working");
    }
    public static void main(String[] args) {
        ThreadInterrupt t1 = new ThreadInterrupt();
        t1.start();
        
        t1.interrupt();
    }
}