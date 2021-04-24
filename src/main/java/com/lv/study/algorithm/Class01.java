package com.lv.study.algorithm;

import java.util.Arrays;

/**
 * 算法01排序算法
 *
 * @author lvxiaoqiang
 * @since 2020/04/23
 */
public class Class01 {

    public static void main(String[] args) {
        // 异或运算 (看成非进位想加)
        int a = 7 ^ 6;
        System.out.println("a = " + a);
        // 特性
        // 1. 0 ^ N = N
        int b = 0 ^ 7;
        System.out.println("b = " + b);
        // 2. N ^ N = 0 (可以用来清零)
        int c = 7 ^ 7;
        System.out.println("c = " + c);
        // 3. 同一批数一起异或的结果是相等的顺序无关,只有两个变量交换值
        int d = 7 ^ 8 ^ 9;
        int e = 9 ^ 7 ^ 8;
        System.out.println(d == e);
        int f = 1;
        int g = 100;

        f = f ^ g; // 这里 f = f ^ g
        g = f ^ g; // 这里 g = f ^ g ^ g
        f = f ^ g; // 这里 f = f ^ g ^ f

        System.out.println("f = " + f);
        System.out.println("g = " + g);


        // 题目1.获得一个二进制的最右边的一个1
        int h = 8;
        System.out.println("h = " + Integer.toBinaryString(h));
        System.out.println("h = " + Integer.toBinaryString(~h));
        System.out.println("h = " + Integer.toBinaryString(~h+1));
        System.out.println("h = " + Integer.toBinaryString(h&(~h+1)));

        // 题目2.计算一个数组找中为奇数个数的数(利用偶数的相异或为0，0与其他数异或为本身)
        int[] array = {1,2,66,2,66,1,33,33,4};
        int j = array[0];
        for (int i = 1;i < array.length;i++){
            j = j^array[i];
        }
        System.out.println("j = " + j);

        // 题目3.计算一个数组中找有两个奇数个的数
        int[] array2 = {1,2,66,2,66,1,33,33,4,5,4,99,99,99};
        int k = 0;
        for (int aa:array2){
            k^=aa;
        }
        int classification = k&(~k+1);
        int l = 0;
        int n = 0;
        for (int aa:array2){
            if( (aa&classification) != 0){
                l ^= aa;
            }else{
                n ^= aa;
            }
        }
        System.out.println("l = " + l + " n = " + n);

        // 题目4 统计一个二进制的1的个数
        int m = -1341;
        int N = m;
        int count = 0;
        while(N != 0){
            int rightOne = N & (~N + 1);
            count ++;
            N ^= rightOne;
        }
        System.out.println("m = " + Integer.toBinaryString(m));
        System.out.println("count = " + count);

    }


}
