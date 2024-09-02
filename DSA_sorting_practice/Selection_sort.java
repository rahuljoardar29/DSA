public class Selection_sort {
    public static void main(String[] args) {
        int arr[] = { 1,5,8,3,2,4};

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;

                    int temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;

                }

            }
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
// Selection Sort

/*public class Selection_sort{
    public static void main(String[]args){
        int nums[] = {6,5,2,8,9,4};
        int temp , minIndex ;
        
        for(int i=0;i<nums.length;i++){
            minIndex = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minIndex] > nums[j]){
                    minIndex = j;
                }
                temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
        }
        for(int num : nums){
            System.out.print(num+" ");
        }
        
        
    }
}*/