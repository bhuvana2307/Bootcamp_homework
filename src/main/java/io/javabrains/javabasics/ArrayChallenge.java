package io.javabrains.javabasics;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
       int []nums={1,2,3,4,5};
       int sum=0;
       int large=nums[0];

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(large<nums[i]){
                large=nums[i];
            }
        }
        double avg=(double)sum/nums.length;
        System.out.println("sum = " + sum);
        System.out.println("large = " + large);
        System.out.println("avg = " + avg);

    }
}
