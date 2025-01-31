class figure {
    double dim1;
    double dim2;

    figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    double area() {
        System.out.println("Area is undefined");
        return 0;
    }
}
class rectangle extends figure {
    rectangle(double a, double b) {
        super(a, b);
    }
    double area() {
        System.out.println("Inside rectangle's area.");
        return dim1*dim2;
    }
}
class triangle extends figure {
    triangle(double a, double b) {
        super(a, b);
    }
    double area() {
        System.out.println("Inside triangle's area.");
        return dim1*dim2/2;
    }
}
class figurearea {
    public static void main (String args[]) {
        figure f = new figure(4, 5);
        rectangle r = new rectangle(6, 7);
        triangle t = new triangle(10, 10);

        figure figref;
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
        figref = f;
        System.out.println("Area is " + figref.area());
    }
}