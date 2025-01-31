class gooddog {
    private int size = 10;

    public int getsize() {
        return size;
    }

    public void setsize(int value) {
        size = value;
    }
}

class privatedog {
    public static void main (String[] args) {

    gooddog one = new gooddog();
    gooddog two = new gooddog();

    one.setsize(15);
    //two.size  = 56;
    System.out.println("Dog one " + one.getsize());
    System.out.println("Dog two " + two.getsize());
    }
}