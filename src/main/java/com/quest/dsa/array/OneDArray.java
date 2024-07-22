package com.quest.dsa.array;

public class OneDArray {

    public static void main(String[] args) {

//        create new Array
        var array = new SingleDimensionArray(10);
//        adding elements in array
        array.insertAt(0, "user 0");
        array.insertAt(1, "user 1");
        array.insertAt(2, "user 2");
        array.insertAt(1, "user 1 Replace");
//      printing array
        array.printAll();
//      Trying to fetch legal unassigned index.
        System.out.println( "At index 3 " + array.get(3));
//      Trying to fetch illegal index(it will throw Exception ).
        System.out.println( "At index 10 " + array.get(10));

    }
}

/**
 * Creating single dimension Array
 */
class SingleDimensionArray {
    private final String[] arr;

//Constructor to  initialize
    public SingleDimensionArray(int size) {
        arr = new String[size];
    }

//    this method will insert/replace at given location
    public void insertAt(int location, String element) {
        if (arr.length > location) {
            arr[location] = element;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
//  fetch element at specific location
    public String get(int location) {
        if (arr.length > location) {
            var element = arr[location];
            return null != element ? arr[location] : null;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
//    print content of array
    public void printAll() {
        for (var s : arr) {
            System.out.print(s + ", ");
        }
        System.out.print("\n");
    }

}