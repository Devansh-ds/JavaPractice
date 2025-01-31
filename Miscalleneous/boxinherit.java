class box  {
    private double length;
    private double width;
    private double height;

    box(box ob) {
        length = ob.length;
        width = ob.width;
        height = ob.height;
    }
    box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }
    box() {
        length = width = height = -1;
    }
    box(double len) {
        length = width = height = len;
    }
    double volume() {
        return length*width*height;
    }
}
class boxweight extends box {
    double weight;
    
    boxweight(double l, double w, double h, double wt) {
        super(l, w, h);
        weight = wt;
    }
    boxweight(double l, double wt) {
        super(l);
        weight = wt;
    }
}
class boxinherit {
    public static void main(String args[]) {
        boxweight box1 = new boxweight(1, 2, 8, 2);
        boxweight box2 = new boxweight(10,3);
        double vol;

        //vol = box1.volume();
        vol = box2.volume();
        System.out.println("Volune is "+ vol);
        System.out.println("Weight is "+ box2.weight);
    }
}