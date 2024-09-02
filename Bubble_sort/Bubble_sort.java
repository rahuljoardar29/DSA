// Write a program in java where show an example of array sorting using bubble sort

public class Bubble_sort{
    public static void main(String[]args){
        int numbers[] = {8,9,5,2,6,4};
        
        for(int i=0 ; i<numbers.length ; i++){
            for(int j=0 ; j<numbers.length -1 ; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp ;
                    
                }
            }
        }
        for(int num : numbers){
            System.out.print(num+" ");
            }
        
    }
}