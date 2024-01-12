package com.DiDi.config;

import java.util.ArrayList;
import java.util.List;

//设置区间集合
public class RangeList<T> {
    private double[] ranArr = new double[2];
    private ArrayList<double[]> RangeListP;
    //创建多区间集合
    public ArrayList<double[]> create(){
        return this.RangeListP;
    }

    //区间集合添加单个区间数据()
    public ArrayList<double[]> add(double start, double end){
        double[] d1 = new double[]{start, end};
        RangeListP.add(d1);
        return RangeListP;
    }
    public ArrayList<double[]> add(double end){//设置区间集合的 结尾区间
        double[] d1 = new double[]{end};
        RangeListP.add(d1);
        return RangeListP;
    }

    //区间集合删除区间数据
    public ArrayList<double[]> remove(){


        return RangeListP;
    }

    //判断某值是否在区间集合中
    public boolean exist(double index, ArrayList<double[]> list){
        if (list.isEmpty()) return false;
        for (double[] d_arr_temp: list
             ) {
            //double[] d_arr_temp = d_arr;
            if (d_arr_temp.length == 0) continue;
            //判断数据 index是否在在区间中；
            boolean flag = false;
            if (d_arr_temp.length == 1){
                //确定是第一个区间，还是最后一个。
                System.out.println("确定是第一个区间，还是最后一个......");
                 if (list.get(0)[0] == d_arr_temp[0]){
                     flag = index <= d_arr_temp[0];
                 }else{
                     flag = index > d_arr_temp[0];
                 }
            }
            else if (d_arr_temp.length == 2){
                flag = index > d_arr_temp[0] && index <= d_arr_temp[1];
            }
            if (flag){
                return  true;
            }
        }
        return  false;
    }

    //判断某区间是否可被添加进区间集合中
    public boolean checkAdd(double[] indexArr, ArrayList<double[]> list){
        if (list.isEmpty() || indexArr.length==0) return false;
        //添加 区间为有限制区间。
        if(indexArr.length == 2) {
            for (int i=0; i<list.size(); i++) {
                list.get(i);
            }
        }
        //添加区间为一侧无限制区间
        else if (indexArr.length == 1) {

        }
        return false;
    }
}
