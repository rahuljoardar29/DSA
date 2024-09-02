// Selection Sort

public class Selection_sort{
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
}