package com.arrizabalaga

/**
 * Created by arrizabalaga on 7/6/14.
 */
class TreeBuilder {

    int[][] input
    Map nodes

    TreeBuilder(int[][] input){
        this.input=input
        nodes=[:]
    }
    
    Node build(){
        for(int i=0;i<input.length;i++){
            //[2,4]
            //get parent
            Node parent= getNode(input[i][0])
            //get child
            Node child= getNode(input[i][1])
            //add child
            parent.addChildren(child)
        }

        return findRoot()
    }

    private Node getNode(int id){
        Node result=nodes.get(id)
        if(result){
            return result
        }

        result=new Node(id:id)
        nodes.put(id,result)
        return result
    }

    private Node findRoot(){
        List result=nodes.values().findAll {node->
            node.root
        }
        if(!result){
            throw new Exception("No root node found.")
        }
        if(result.size()>1){
            throw new Exception("Several root nodes found ${result*.id}.")
        }
        return result[0]
    }    
}
