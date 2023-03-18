package algorithm.simpleSort;

import org.junit.Test;

import java.util.Arrays;

public class MyTest {
    private static Integer[] arr = {4, 5, 6, 3, 2, 1};

    @Test
    public void bubbleTest(){
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    @Test
    public void selectionTest(){
        SelectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public void insertionTest(){
        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
