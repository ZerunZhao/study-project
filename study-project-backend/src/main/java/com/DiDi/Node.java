package com.DiDi;

import java.util.ArrayList;
import java.util.List;

//创建自定义节点
public class Node {

    private String panter;
    private String name;
    //存放子节点列表
    private List<Node> children;

    public Node(){
        this.panter = panter;
        this.name = name;
        this.children = new ArrayList<>();
    }



    public String getPanter() {
        return panter;
    }

    public void setPanter(String panter) {
        this.panter = panter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }
/*   public void addChild(Node child){

    }*/
}
