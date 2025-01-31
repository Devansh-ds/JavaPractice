enum Apple {
    John(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    private int price;

    Apple(int p) {
        price = p;
    }
    int getprice() {
        return price;
    }
}
class enumdemo3 {
    public static void main(String args[]) {
        System.out.println("All apple prices are :");
        for (Apple a : Apple.values()) {
            System.out.println(a + " costs " + a.getprice() + " cents.");
        }
    }
}