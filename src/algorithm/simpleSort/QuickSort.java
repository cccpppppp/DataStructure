package algorithm.simpleSort;

import java.util.LinkedList;

public class QuickSort {
    //对数组内的元素进行排序
    public static void sort(Comparable[] a){
        sort(a,0,a.length-1);
    }

    //对数组a中从索引lo到索引hi之间的元素进行排序
    private static void sort(Comparable[] a, int low, int high){
        //安全性验证,结束条件
        if(high <= low){
            return;
        }
        int partition = partition(a, low, high);
        sort(a,low,partition-1);
        sort(a,partition+1,high);
    }

    private static int partition(Comparable[] a, int low,  int high){
        Comparable key = a[low];//最左边的元素是基准值
        int pLeft = low;
        int pRight = high+1;

        while (true){
            while (isGreater(key,a[++pLeft]) && pLeft < high);
            while (isGreater(a[--pRight],key) && pRight > low);
            if(pLeft >= pRight){
                break;
            }else {
                exch(a,pLeft,pRight);
            }
        }
        exch(a,low,pRight);
        return pRight;
    }


    //判断o1是否大于o2
    private static boolean isGreater(Comparable object1,Comparable object2){
        //可以o1-o2这样来记忆大小，负数小，正数大，0相等
        return object1.compareTo(object2) > 0;
    }

    //交换a数组中，索引i和索引j处的值
    private static void exch(Comparable[] arr,int i,int j){
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
