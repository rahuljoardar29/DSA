public class Bubble_sort {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 8, 6, 7, 1 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
            for (int nums : arr) {
                System.out.print(nums + " ");
            }
            System.out.println();

        }
        

    }
}