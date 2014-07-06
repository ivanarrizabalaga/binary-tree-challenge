package com.arrizabalaga

/**
 * Created by arrizabalaga on 7/6/14.
 */
class Node {
    int id
    List<Node> children=[]
    boolean root=true

    void addChildren(Node child){
        child.root=false
        children.push(child)
    }
}
