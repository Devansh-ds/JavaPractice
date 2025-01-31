class Box {
    double length;
    double width;
    double height;
    //This is constructor.
    Box(double l, double w, double h) {
        System.out.println("In Constructor block");
        length = l; //this.length = length;
        width = w;
        height= h;
    }

    double volume() {
        return length*width*height;
    }
}
class classconstructor {
    public static void main (String args[]) {
        Box box1 = new Box(10, 5, 10);
        Box box2 = new Box(3, 5, 1);
        System.out.println("Volume is " + box1.volume());
        System.out.println("Volume is " + box2.volume());
    }
}