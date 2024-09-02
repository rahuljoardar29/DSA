public class Insertion_sort {
    public static void main(String[] args) {
        int arr[] = { 4, 7, 6, 2, 5 };

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = key;
            for (int num : arr) {
                System.out.print(num + " "); 
        }
        System.out.println();
        
        }
    }
}