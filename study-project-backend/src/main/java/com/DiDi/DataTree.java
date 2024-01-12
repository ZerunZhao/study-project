package com.DiDi;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class DataTree {
    /*@Autowired
    private Node node;*/

    //

  /*  public static Node createTree(){

    }*/
  public static void main(String[] args) {

      List<Node> child = new ArrayList<>();
      Node child_node = new Node();
      child_node.setName("子节点1");
      child_node.setPanter("父节点1");
      child.add(child_node);

      Node node = new Node();
      node.setName("父节点1");
      node.setPanter("root");
      node.setChildren(child);

      System.out.println(node.getName());
      System.out.println(node.getPanter());
      System.out.println(node.getChildren());
      System.out.println(node.getChildren().get(0).getName());
      System.out.println(node.getChildren().get(0).getPanter());
      System.out.println(node.getChildren().get(0).getChildren());
      System.out.println(node.toString());

  }
}
