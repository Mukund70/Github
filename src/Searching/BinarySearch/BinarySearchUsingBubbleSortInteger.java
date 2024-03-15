package Searching.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

class Bubblesort{
    public void sorter(int[] numbers){
        for (int counter = 0;counter<numbers.length;counter++) {
            for (int index = 0; index < numbers.length-1; index++) {
                if (numbers[index]>numbers[index+1]){
                    int temp = numbers[index];
                    numbers[index]= numbers[index+1];
                    numbers[index+1]= temp;
                }
            }

        }
    }
}
class Binarysearch{
    public int search(int[] numbers , int key,int firstIndex,int lastIndex){
        while (firstIndex<=lastIndex) {
            int middleIndex = lastIndex + ((firstIndex - lastIndex) / 2);
            if (numbers[middleIndex]==key) return middleIndex;
            else if (numbers[middleIndex]>key) lastIndex =middleIndex-1;
            else if (numbers[middleIndex]<key) firstIndex=middleIndex+1;
        }
        return -1;
    }
}
class Main1{
    public static void main(String[] args) {
        int[] arrayNumbers = new int[]{99,1,2,7,5};
        Scanner scan = new Scanner(System.in);
        System.out.println("Arrays.toString(arrayNumbers) = " + Arrays.toString(arrayNumbers));
        Bubblesort bubblesort = new Bubblesort();
        bubblesort.sorter(arrayNumbers);
        System.out.println("Arrays.toString(arrayNumbers) after sorting = " + Arrays.toString(arrayNumbers));
        System.out.print("enter the key =");
        int key = scan.nextInt();
        Binarysearch binarysearch = new Binarysearch();
        int search = binarysearch.search(arrayNumbers, key, 0, arrayNumbers.length - 1);
        System.out.println("index =" + search);

    }
}
