public class Selection {
    public static void main(String[] args) {
        int nums[] = {5,7,6,2,4,8};
        int minIndex = 0;

        for(int i=0;i<nums.length;i++){
            minIndex = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minIndex] > nums[j]){
                    minIndex = j;
                }
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;

            }
            for(int num : nums){
                System.out.print(num+" ");
            }
        }
    }
}
