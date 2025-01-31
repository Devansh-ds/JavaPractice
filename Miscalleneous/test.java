class test {
    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] / 2 == arr[j] && arr[i] % 2 == 0)
                System.out.println("arr[i]/2 " + arr[i]/2 + " arr[j] " + arr[j]);
                System.out.println("True");;
            }
        }
        System.out.println("False");;
    }
}