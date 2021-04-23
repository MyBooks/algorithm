package com.lv.study.algorithm.utils;

import sun.jvm.hotspot.utilities.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 算法通用工具
 *
 * @author lvxiaoqiang
 * @since 2021/4/23 9:30 下午
 */
public class AlgorithmUtils {

    /**
     * 生成随机整形数组
     * Math.random()        [0,1)
     * Math.random()*N      [0,N)
     * (int)(Math.random()*N)   [0,N-1]
     *
     * @param size      数组大小
     * @param start     数组起始位置
     * @param end       数组结束位置
     * @return 一个规定范围内整数数组
     */
    static public int[] generateRandomArrayInt(int size,int start,int end){
        Assert.that(end>=start,"end必须大于等于size");
        int[] array = new int[size];
        for (int i = 0;i < size;i++){
            array[i]=(int)(Math.random()*(end-start))+start;
        }
        return array;
    }

    /**
     * 生成随机整形List
     *
     * @param size      数组大小
     * @param start     数组起始位置
     * @param end       数组结束位置
     * @return 一个规定范围内整数List
     */
    static public List<Integer> generateRandomListInt(int size,int start,int end){
        Assert.that(end>=start,"end必须大于等于size");
        List<Integer> list = new ArrayList<>();
        Arrays.stream(generateRandomArrayInt(size,start,end)).forEach(value -> list.add(value));
        return list;
    }

    /**
     * 获取小数随机数数组
     *
     * @param size      数组大小
     * @param start     数组起始位置
     * @param end       数组结束位置
     * @param precision 小数精度
     * @return 返回一个规定范围小数数组
     */
    static public double[] generateRandomArrayDouble(int size,double start,double end,int precision){
        Assert.that(end>=start,"end必须大于等于size");
        Assert.that(precision>=0,"精度大于等于0");
        double baseNumber = Math.pow(10,precision);
        double[] array = new double[size];
        for (int i = 0;i < size;i++){
            array[i]=((int)(Math.random()*(end*baseNumber-start*baseNumber))+start*baseNumber)/baseNumber;
        }
        return array;
    }

    /**
     * 获取小数随机数List
     *
     * @param size      数组大小
     * @param start     数组起始位置
     * @param end       数组结束位置
     * @param precision 小数精度
     * @return 返回一个规定范围小数list
     */
    static public List<Double> generateRandomListDouble(int size,double start,double end,int precision){
        Assert.that(end>=start,"end必须大于等于size");
        List<Double> list = new ArrayList<>();
        Arrays.stream(generateRandomArrayDouble(size,start,end,precision)).forEach(value -> list.add(value));
        return list;
    }
}
