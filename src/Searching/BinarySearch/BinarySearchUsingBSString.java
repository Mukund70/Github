package Searching.BinarySearch;

import java.util.Arrays;

public class BinarySearchUsingBSString {
    public int search(String[] names , String key ,int firstIndex,int lastIndex ){
        while (firstIndex<=lastIndex){
            int middleIndex = firstIndex + ((lastIndex - firstIndex) / 2);
            if (names[middleIndex].equalsIgnoreCase(key)) return middleIndex;
            else if (names[middleIndex].compareTo(key)>0) lastIndex = middleIndex-1;
            else if (names[middleIndex].compareTo(key)<0) firstIndex = middleIndex+1;
        }
        return -1;
    }
}

class Sorter{
    public void sort(String[] names){
        for (int counter = 0;counter<names.length;counter++) {
            for (int index = 0; index < names.length-1; index++) {
                if (names[index].compareTo(names[index + 1]) > 0) {
                    String temp = names[index];
                    names[index]= names[index+1];
                    names[index+1]= temp;
                }
            }
        }
    }
}
class Main2 {

    public static void main(String[] args) {
        String[] names = new String[]{"Mukund", "Krishna", "Nikhil", "venom", "Ayushi"};
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));
        Sorter sorter = new Sorter();
        sorter.sort(names);
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));
        BinarySearchUsingBSString binarySearchUsingBSString = new BinarySearchUsingBSString();
        int search = binarySearchUsingBSString.search(names, "venom", 0, names.length - 1);
        System.out.println("search = " + search);

    }
}

