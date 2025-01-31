public class dogarray {
    String name;

    public static void main (String[] args) {

        dogarray dog1 = new dogarray();
        // dog1.name = "Bart";
        dog1.bark();

        dogarray[] mydogs = new dogarray[3];

        mydogs[0] = new dogarray();
        mydogs[1] = new dogarray();
        mydogs[2] = dog1;

        mydogs[0].name = "Fred";
        mydogs[1].name = "Marge";

        System.out.print("Last dogs name is ");
        System.out.println(mydogs[2].name);

        int x = 0;
        while (x < mydogs.length) {
            mydogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " says Ruff!");
    }
}