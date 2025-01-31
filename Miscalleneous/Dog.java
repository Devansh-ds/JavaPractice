class Dog {
    int size;
    String name;
    String breed;

    void bark() {
        System.out.println("Ruff Ruff");
    }
}

class Dogtestdrive {
    public static void main (String[] args) {
        Dog d = new Dog();
        d.size = 40;
        d.bark();
    }
}