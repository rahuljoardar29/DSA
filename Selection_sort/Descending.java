public class Descending{
    public static void main(String[] args) {
        int numbers[] = {6,5,2,8,9,4};
        int temp ;
        int minIndex = 0;

        System.out.println("Before sorting....");
        for(int num : numbers){
            System.out.print(num+" ");
        }
        for(int i=0 ;i<numbers.length ;i++){
            minIndex = i;
            for(int j=i+1 ; j<numbers.length ;j++){
                if(numbers[minIndex] > numbers[j]){
                    minIndex = j;
                }
                temp = numbers[minIndex];
                numbers[minIndex] = numbers[i];
                numbers[i]=temp;
    
            }
           
            System.out.println();
        }
        System.out.println("After sorting....");
        for(int num : numbers){
            System.out.print(num+" ");
        }

    }
}