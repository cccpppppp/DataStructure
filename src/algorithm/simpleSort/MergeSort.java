package algorithm.simpleSort;

public class MergeSort {
    private static Comparable[] temp;//临时排序数组

    //对数组内的元素进行排序
    public static void sort(Comparable[] a){
        temp = new Comparable[a.length];
        sort(a,0,a.length-1);
    }

    //对数组a中从索引lo到索引hi之间的元素进行排序
    private static void sort(Comparable[] a, int low, int high){
        //安全性验证
        if(high <= low){
            return;
        }
        //获取中间元素
        int mid = (low+high)/2;

        //递归分组
        sort(a,low,mid);
        sort(a,mid+1,high);

        merge(a,low,mid,high);
    }

    /*
    从索引lo到所以mid为一个子组，从索引mid+1到索引hi为另一个子组，
    把数组a中的这两个子组的数据合并成一个有序的大组（从索引lo到索引hi）
    */
    private static void merge(Comparable[] a, int low, int mid, int high){

        int pTemp = low;//临时数组的指针
        int pLow = low;//左数组的指针
        int pHigh = mid+1;//右数组的指针

        //不等长时，先让其中一个数组遍历结束
        while ((pLow < mid+1) && (pHigh < high+1)){
            //前大后小
            if(isGreater(a[pLow],a[pHigh])){
                temp[pTemp++] = a[pHigh++];
            }else {
                temp[pTemp++] = a[pLow++];
            }
        }

        //遍历剩余的那个数组
        while (pLow < mid+1){
            temp[pTemp++] = a[pLow++];
        }
        while (pHigh < high+1){
            temp[pTemp++] = a[pHigh++];
        }

        //排序后的值放入a[]中
        for(int i = low; i < high+1; i++){
            a[i] = temp[i];
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
