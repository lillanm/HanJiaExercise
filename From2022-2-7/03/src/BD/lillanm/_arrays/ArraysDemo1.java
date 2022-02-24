package BD.lillanm._arrays;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        //学会使用Arrays类的常用API,并理解其原理
        int[] arr = {10,2,55,23,24,100};
        System.out.println(arr);

        //1.返回数组内容的toString（数组）
//        String rs = Arrays.toString(arr);
//        System.out.println(rs);

        System.out.println(Arrays.toString(arr));

        //2.排序的API(默认自动对数组元素进行升序排序）
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr) );

        //3.二分搜索技术（前提数组必须排好序才支持，否则出bug）
        int index = Arrays.binarySearch(arr,55);
        System.out.println(index);

        //返回不存在元素的规律：-(应插入的位置索引+1)
        int index2 = Arrays.binarySearch(arr,22);
        System.out.println(index2);
    }
}
