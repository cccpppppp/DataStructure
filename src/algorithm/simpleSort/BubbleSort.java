package algorithm.simpleSort;

//接口比较 体现多态
public class BubbleSort {
    //对数组内的元素进行排序
    public static void sort(Comparable[] arr){
        int length = arr.length;
        //冒泡n-1轮
        for(int i = 0; i < length-1; i++){
            for(int j = 0; j < length-1-i; j++){
                if(isGreater(arr[j],arr[j+1])){
                    exch(arr,j,j+1);
                }
            }
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
