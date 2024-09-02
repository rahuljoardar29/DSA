import java.util.Scanner;

public class Descending {
    public static void main(String[] args) {
        System.out.println("Enter the numbers of array");
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the numbers of array");
        for (int i = 0; i < size; i++) {
            nums[i] = input.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+ 1];
                    nums[j + 1] = temp;

                }
            }
        }
        for (int num: nums) {
            System.out.print(num+ " ");

        }

    }
}
