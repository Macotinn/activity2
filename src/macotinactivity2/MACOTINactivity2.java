package macotinactivity2;

import java.util.Arrays;

public class MACOTINactivity2 {

    public static void main(String[] args) {
   
        int[] array = {12, 17, 3, 11, 1};

        System.out.println("Elements of the Array: ");
        System.out.println("First Array Element: " + array[0]);
        System.out.println("Second Array Element: " + array[1]); 
        System.out.println("Third Array Element: " + array[2]);
        System.out.println("Fourth Array Element: " + array [3]);
        System.out.println("Fifth Array Element: " + array [4]);

        int sum = Arrays.stream(array).sum();
        System.out.println("\nSum of the array elements:  " + sum);

        int max = Arrays.stream(array).max().getAsInt(); 
        System.out.println("Maximum value in the array:" + max);
    }
}
