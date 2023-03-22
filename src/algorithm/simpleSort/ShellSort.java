package algorithm.simpleSort;

public class ShellSort {
    //对数组内的元素进行排序
    public static void sort(Comparable[] arr){
        int length = arr.length;

        //初始化希尔排序的分组值
        int h = 1;
        while (h < length/2){
            h = 2*h+1;
        }

        //当分组小到0时，分组结束
        while (h>0){
            //每隔h进行分组，每组的第一个索引从i到length-h-1
            for(int i = 0; i < length-h; i++){
                //从后往前插入排序，相邻的增长量是h
                for(int j = i+h; j > h-1; j-=h){
                    if(isGreater(arr[j-h],arr[j])){
                        exch(arr,j-h,j);
                    }else {
                        break;
                    }
                }
            }
            //每次增长量减半
            h /= 2;
        }
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
