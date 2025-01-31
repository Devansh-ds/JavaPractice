public class Sorting {
    public static void main (String[] args) {
        // SelectionSort();
        // InsertionSort();
        ShellSort();
    }
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void SelectionSort() {
        int[] arr = {3,5,2,4,10,3,42,4};
        int tmp;

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
        print(arr);
    }
    public static void InsertionSort() {
        int[] arr = {4,2,6,3,6,3,5,9,8,1};
        int tmp;

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j-1]; j--) {
                tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
            }
        }
        print(arr);
    }
    public static void ShellSort() {
        int[] arr = {4,5,6,3,10,9,8,7,6,5,4,3,2,1,4,9,8,7,5,4,1,0};
        int N = arr.length;
        int h = 1, tmp;

        while (h < N/3) h = h*3 + 1;
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && arr[j] < arr[j-h]; j -= h) {
                    tmp = arr[j];
                    arr[j] = arr[j-h];
                    arr[j-h] = tmp;
                    System.out.print("h : " + h + " | j : " + j + " | j-h : " + (j-h) + " | ");
                    print(arr);
                }
            }
            h = h/3;
        }
        //print(arr);
    }
}