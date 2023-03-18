package algorithm.simpleSort;

public class SelectionSort {
    public static void sort(Comparable[] arr) {
        int length = arr.length;
        //选择length-1次
        for (int i = 0; i < length-1; i++){
            int mixIndex = i;
            for(int j = i; j < length-1;j++){
                if(isGreater(arr[j],arr[j+1])){
                    mixIndex = j+1;
                }
            }
            exch(arr, i, mixIndex);
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
