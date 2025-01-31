public class thisdetail {
    int pc = 0;
    String s = "name";
    thisdetail(int pc) {
        this.pc = pc;
        System.out.println("Inside int only");
    }
    thisdetail(String s) {
        this.s = s;
        System.out.println("Inside String only");
    }
    thisdetail(String s, int pc) {
        this(pc);
        // this("hi");
        this.s = s;
        this.pc = pc;
        System.out.println("Inside both string and int");
    }
    thisdetail() {
        this("hi", 47);
        System.out.println("Inside default constructor.");
    }
    public static void main(String[] args) {
        thisdetail ob = new thisdetail();
    }
}
