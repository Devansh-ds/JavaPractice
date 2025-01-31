class Cube {
    double length;
    double width;
    double height;

    Cube() {
        length = width = height = -1;
    }
    Cube(double len) {
        length = width = height = len;
    }

    double volume() {
        return length*width*height;
    }
}
class constoverloading {
    public static void main(String args[]) {
        Cube cube1 = new Cube();
        Cube cube2 = new Cube(9);
        double vol;
        System.out.println(cube1.volume());
        System.out.println(cube2.volume());
    }
}