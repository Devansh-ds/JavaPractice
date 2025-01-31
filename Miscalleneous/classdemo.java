class Box {
    double length;
    double width;
    double height;

    void volume() {
        System.out.print("Volume is ");
        System.out.println(length*width*height);
    }
}

class classdemo  {
    public static void main(String args[]) {
        Box box1 = new Box();
        box1.length = 10;
        box1.width = 15;
        box1.height = 69;
        box1.volume();
    }
}