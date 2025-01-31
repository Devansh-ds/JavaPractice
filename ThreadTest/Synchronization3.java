class Customer {
    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("Going to withdraw");
        if (this.amount < amount) {
            System.out.println("Less balance.");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.amount -= amount;
        System.out.println("withdraw completed");
    }

    synchronized void deposit(int amount) {
        System.out.println("Going to deposit");
        this.amount += amount;
        System.out.println("deposit completed");
        notify();
    }
}

public class Synchronization3 {
    public static void main(String[] args) {
        final Customer c = new Customer();
        new Thread(){
            public void run() {
                c.withdraw(14000);
            }
        }.start();
        new Thread() {
            public void run() {
                c.deposit(200000);
            }
        }.start();
    }
}   
