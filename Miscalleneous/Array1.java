class Array1 {
    public static void main(String[] args) {
        // reverseArray();
        // findSecondMax();
        fuck();
    }
    static void evenArray(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        int idx = 0;
        int[] evenarr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                evenarr[idx] = arr[i];
                idx++;
            }
        }
        printArray(evenarr);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverseArray() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int start = 0, end = arr.length - 1;
        while (start < end) {
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
        printArray(arr);
    }
    static void findSecondMax() {
        int[] arr = {1,2,3,4,5,6,7,10,-9,10};
        int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }
        System.out.println(max + " " + smax);
    }

    static void zerosAtEnd() {
        int[] arr = {0,1,0,4,12};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[j] == 0 && arr[i] != 0) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        printArray(arr);
    }
    static void fuck() {
        int[] nums = {3,2,2,3};
        int val = 3;
                int k = 0;
                for (k = 0; k < nums.length; k++) {
                    if (nums[k] != val) k++;
                }
                int i = 0, j;
                while (i < k) {
                    if (nums[i] == val) {
                        
                        for (j = i + 1; j< nums.length; j++) {
                            if (nums[j] != val) {
                                nums[i] = nums[j];
                                nums[j] = val;
                                break;
                            }
                        }
                    i++;
                    }
                }
                System.out.println(nums.length - k);
                printArray(nums);
            }
        
    }
}
