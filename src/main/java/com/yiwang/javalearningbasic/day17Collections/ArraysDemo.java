package com.yiwang.javalearningbasic.day17Collections;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yiwang on 2018/6/21.
 *
 * alList:将数组变为List集合
 */
public class ArraysDemo {
    public static void main(String[] args){
//        int[] arr = {3,4,5};
//        System.out.println(Arrays.toString(arr));
//        String[] arr = {"abc","acc","kkk"};
//        List<String> list = Arrays.asList(arr);
//        sop("contains "+ list.contains("cc"));
//        list.add("qq");//不支持增删   异常java.lang.UnsupportedOperationException
//        sop(list);

//        int[] nums = {3,4,5};
        Integer[] nums= {3,4,5};
        List<Integer> li = Arrays.asList(nums);
        sop(li);
    }
    public static void sop(Object obj){
        System.out.println(obj);
    }
}
