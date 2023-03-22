package algorithm.simpleSort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MyTest {
    private static Integer[] arr =
//            {1,2,3,4,5,6,7,0};
            {101,0,4, 5, 6, 3, 2, 1,0,18,99,5,7,100,99,8,2,0};
    private static Long startTime;
    private static Long endTime;

    @Before
    public void start() throws IOException {
//        Path path = Paths.get(System.getProperty("user.dir"), "testDatas", "reverse_arr.txt");
//        List<String> strings = Files.readAllLines(path);
//        ArrayList<Integer> integers = new ArrayList<>();
//        for (String string : strings) {
//            integers.add(Integer.valueOf(string));
//        }
//        arr = new Integer[integers.size()];
//        integers.toArray(arr);
        startTime = System.currentTimeMillis();
    }

    @After
    public void end(){
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

    }

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
    @Test
    public void shellTest(){
        ShellSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public void mergeTest(){
        MergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public void quickTest(){
        QuickSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
