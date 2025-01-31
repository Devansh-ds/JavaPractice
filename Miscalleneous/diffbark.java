class dog {
    int size;
    String name;

    void bark() {
        if (size > 60) {
            System.out.println("Roar! Roar!");
        } else if (size > 15) {
            System.out.println("Woof! Woof!");
        } else {
            System.out.println("Meow! Meow!");
        }
    }

    String timebark(int num) {
        while (num > 0) {
            System.out.println("bark " + num);
            num = num - 1;
        }
        return "John Cena";
    }
}

class diffbark {
    public static void main (String[] args) {
        dog one = new dog();
        one.size = 75;
        dog two = new dog();
        two.size = 45;
        dog three = new dog();
        three.size = 5;

        one.bark();
        two.bark();
        
        String rvalue = three.timebark(5);
        System.out.println("Return value : " + rvalue);
    }
}
