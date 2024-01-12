package com.DiDi;

import com.DiDi.config.RangeList;

import java.util.List;


/**
 * 设置常量值
 * */
public class Constants {

    //是否可联[是、否]
    protected static final String rel = "rel";
    boolean[] rel_arr = new boolean[]{true, false};

    //客户类型【新客户、老客户】
    protected static final String customer = "customer";
    String[] customer_arr = new String[]{"cust_new","cust_old"};

    //金额区间【<=500、 500<X<=1000、 >1000】
    protected static final String amount = "amount";
    //RangeList<Integer> rangeSet = RangeList.create();

    //C卡分位【0-0.3、 0,3<X<=0.6、 0.6<X<=0.9、 >=0.9】
    protected static final String C_card = "C_card";
/*
    //结构树-最大级层
    protected static final Integer max_tier = 4;
    //结构树-最大子节点数量
    protected static final Integer max_node = 4;*/
}
