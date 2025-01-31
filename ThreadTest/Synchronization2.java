class Sender {
    public void senderMsg(String msg) {
        System.out.println("\nSending a message : " + msg);
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sent : " + msg);
    }
}
class SenderWThread extends Thread {
    private String msg;
    Sender sd;
    SenderWThread(String msg, Sender obj) {
        this.msg = msg;
        sd = obj;
    }
    public void run() {
        synchronized(sd) {
            sd.senderMsg(msg);
        }
    }
}

public class Synchronization2 {
    public static void main(String[] args) {
        Sender obj = new Sender();
        SenderWThread s1 = new SenderWThread("yooohooohooo", obj);
        SenderWThread s2 = new SenderWThread("Welcome.", obj);

        s1.start();
        s2.start();

        try {
            s1.join();
            s2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
