class Newthread implements Runnable {
    Thread t;

    Newthread() {
        t = new Thread(this, "Demo thread");
        System.out.println("Child thread : " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread : "+ i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child INterrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}
class Threadtest {
    public static void main(String[] args) {
        new Newthread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}